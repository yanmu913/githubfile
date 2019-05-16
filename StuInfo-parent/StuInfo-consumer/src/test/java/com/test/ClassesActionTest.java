package com.test;

import java.util.List;

import com.info.action.ClassesAction;
import com.info.entity.Classes;

public class ClassesActionTest  {

	public static void main(String[] args) {
		ClassesAction ca = new ClassesAction();
		List<Classes> list = ca.find();
		System.out.println(list);
	}
}
