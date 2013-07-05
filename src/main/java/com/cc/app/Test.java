package com.cc.app;

import com.cc.app.service.NameService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   final NameService nameService = new NameService();
       System.out.println("My Name Is :"+nameService.getMyName());
	}

}
