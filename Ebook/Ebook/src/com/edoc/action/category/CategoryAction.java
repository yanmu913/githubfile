package com.edoc.action.category;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edoc.entity.Category;
import com.edoc.service.category.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryAction {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/find")
	public String catogoryList(HttpSession session) {
		System.out.println("-----catogoryList---------");
		List<Category> cList = categoryService.find(null);
		session.setAttribute("cList", cList);
		System.out.println(cList);
		return "/pages/show.jsp";
	}
}
