package com.info.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.info.entity.Classes;
import com.info.service.ClassesService;

@Controller
public class InitAction {
	@RequestMapping("/")
	public String init(HttpSession session) {
System.out.println("--------------classesfind");
		return "/pages/main.jsp";
	}
}
