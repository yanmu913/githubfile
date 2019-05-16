package com.info.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.info.entity.Student;
import com.info.service.StudentService;
@RestController
@RequestMapping("/student")
public class StudentAction {
	
	@Reference(version="1.0")
	private StudentService studentService;
	
	/**
	 * 查找出学生的所有信息
	 * @return
	 */
	@RequestMapping("/find")
	public List find(HttpSession session) {
		System.out.println("----------------studentfind");
		//获取学生的信息集合
		List<Student> sList = studentService.find();
		System.out.println("sList："+sList);
		session.setAttribute("sList", sList);
		return sList;
	}
	
	/**
	 * 更新学生的信息
	 * @return
	 */
	@RequestMapping("/update")
	public String update(Student student,HttpSession session,String updateDate) {
		System.out.println("-----------------------studentupdate");
		System.out.println(student);
		System.out.println(updateDate);
		
		//将页面获取的数据添加到新的Student对象中
		Student stu = new Student();
		stu.setStuName(student.getStuName());
		stu.setStuEmail(student.getStuEmail());
		stu.setStuGender(student.getStuGender());
		stu.setStuTelephone(student.getStuTelephone());
		stu.setClassId(student.getClassId());
		stu.setStuId(student.getStuId());
		try {
			SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
			Date newDate =  formater.parse(updateDate);
			System.out.println("newDate:"+newDate);
			stu.setStuBirthday(newDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(stu);
		//更新传入的Student对象
		int result = studentService.update(stu);
		
		if(result==1) {
			System.out.println("~~~~~~~~~~~~~~~~successs");
			session.setAttribute("updateResult", "suc");
		}else {
			System.out.println("~~~~~~~~~~~~~~~~fail");
			session.setAttribute("updateResult", "err");
		}
		return "/student/find";
	}
}
