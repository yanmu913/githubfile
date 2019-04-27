package com.edoc.action.entry;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edoc.entity.Entry;
import com.edoc.service.entry.EntryService;
import com.edoc.util.PageTool;

@Controller
@RequestMapping("/entry")
public class EntryAction {

	@Autowired
	EntryService entryService;
	
	/**
	 * 查
	 * @param session
	 * @param entry
	 * @param rpt
	 * @return
	 */
	@RequestMapping("/find")
	public String entryList(HttpSession session,Entry entry,PageTool rpt) {
		System.out.println("------entryList------");
		
		PageTool pt = new PageTool();
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println("categoryid="+entry.getCategoryid());
		System.out.println("curPage:"+rpt.getCurrPage());
		map.put("categoryid", entry.getCategoryid());
		
		pt.setAllCount(entryService.findCount(map));
		System.out.println("allcount:"+entryService.findCount(map));
		pt.setCurrPage(rpt.getCurrPage());
		
		System.out.println("start:"+pt.getStart());
		map.put("start", pt.getStart());
		map.put("pageSize", pt.getPageSize());
		
		List<Entry> eList = entryService.find(map);
		System.out.println(eList);
		session.setAttribute("eList", eList);
		session.setAttribute("pt", pt);
		session.setAttribute("categoryId", entry.getCategoryid());
		return "redirect:/pages/show.jsp";
	}
	
	/**
	 * 增
	 * @param entry
	 * @param session
	 * @return
	 */
	@RequestMapping("/add")
	public String add(Entry entry,HttpSession session,String screateDate) {
		System.out.println("--------add------");
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println("categoryid:"+entry.getCategoryid());
		System.out.println("screateDate"+screateDate);
		map.put("categoryid", entry.getCategoryid());
		map.put("title", entry.getTitle());
		map.put("summmary", entry.getSummmary());
		map.put("uploader", entry.getUploader());
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = formater.parse(screateDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}	
		map.put("createDate",date );
		entryService.insert(map);
		return "/entry/find";
	}
	
	/**
	 * 删
	 * @param entry
	 * @param session
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(Entry entry,HttpSession session) {
		System.out.println("-----delete------");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", entry.getId());
		entryService.delete(map);
		session.setAttribute("deleteSuccess", "删除成功！");
		return "/entry/find";
	}

	
	/**
	 * 改
	 * @param entry
	 * @param session
	 * @return
	 */
	@RequestMapping("/update")
	public String update(Entry entry,HttpSession session) {
		System.out.println("-----update------");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", entry.getId());
		map.put("title", entry.getTitle());
		map.put("summmary", entry.getSummmary());
		map.put("uploader", entry.getUploader());
		entryService.update(map);
		session.setAttribute("updateSuccess", "修改成功！");
		return "/entry/find";
	}
}
