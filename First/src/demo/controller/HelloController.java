package demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response){
		System.out.println("inside");
		
		ModelAndView a=new ModelAndView("Hello");
		a.addObject("message","hello MVC");
		a.addObject("h","helloSpring");
		
//		a.addObject("new","hello");
		System.out.println(a);
		return a;
	}


}
