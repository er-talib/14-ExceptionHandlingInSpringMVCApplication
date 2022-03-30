package com.exception.controller;

import org.springframework.boot.WebApplicationType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

	@RequestMapping("/welcome")
	public String handlerMethod(Model model) {

		model.addAttribute("message", "Hello Talib");
		String s = null;
		s.length();

		return "welcome";
	}

	@RequestMapping("/helper")
	public String hendlerMethod2(Model model) {

		model.addAttribute("mes", "Hello Talib how are you..");
		int i = 7 / 0;
		System.out.println(i);

		return "welcome2";
	}

//	@ExceptionHandler(value = Exception.class) // handle multiple exception using single handler error method  
//	public String errorHandler2(Model model) {
//		model.addAttribute("errorMessage", " 1 Somthing is wrong please try again some time..!!");
//		return "errotPage";
//	}

	@ExceptionHandler(value = NullPointerException.class) // handel single exeption handler
	public String errorHandler(Model model) {
		model.addAttribute("errorMessage", "Somthing is wrong please try again some time..!!");
		return "errotPage";
	}

	@ExceptionHandler(value = ArithmeticException.class)
	public String errorHandler2(Model model) {
		model.addAttribute("errorMessage", " 1 Somthing is wrong please try again some time..!!");
		return "errotPage";
	}

}
