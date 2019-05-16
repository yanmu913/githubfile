package com.info.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.info.entity.Classes;
import com.info.service.ClassesService;
@Controller
@RequestMapping("/classes")
public class ClassesAction {
	@Reference(version="1.0")
	private ClassesService classesService;

	/**
	 * 查找班级的信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/find")
	public List find() {
		System.out.println("--------------classesfind");
		
		//获取到班级数据的集合
		List<Classes> cList = classesService.find();
		System.out.println("cList："+cList);
//		session.setAttribute("cList", cList);
		return cList;
	}
}
