package com.banksystem.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.banksystem.util.PageAssistant;

public class BaseDaoImpl<T> implements BaseDao<T> {
	protected HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public void insert(T t) {
		ht.save(t);
		
	}

	@Override
	public void delete(T t) {
		ht.delete(t);
		
	}

	@Override
	public void update(T t) {
		ht.update(t);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> select(String hql, Object... param) {
		System.out.println("basedao-------------select");
		return ht.find(hql, param);
	}

	@Override
	public int count(String hql, Object... param) {
		return Integer.parseInt(ht.find(hql, param).get(0)+"");
	}

	public PageAssistant<T> selectByPage(PageAssistant<T> pa, String hql, Object... param) {
		final int start = pa.getStart();
		final int size = pa.getPageSize();
		@SuppressWarnings("unchecked")
		List<T> items = ht.executeFind(new HibernateCallback<List<T>>() {
			public List<T> doInHibernate(Session session) 
					throws HibernateException, SQLException {
				
				/* 创建查询对象query */
				Query query = session.createQuery(hql);
				/* 添加占位符参数 */
				for(int i = 0; i < param.length; i++) {
					query.setParameter(i, param[i]);
				}
				/* 添加分页参数 */
				query.setFirstResult(start);
				query.setMaxResults(size);
				/* 查询 */
				List<T> list = query.list();
				/* 返回查询结果 */
				return list;
			}
		});
		
		/* 2. 将查询到的页面内容赋值给页面助手对象 */
		pa.setItems(items);
		return pa;
	}

}
