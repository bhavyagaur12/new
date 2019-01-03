package com.spring;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
//	@InitBinder
//	public void binder(WebDataBinder binder){
////		binder.setDisallowedFields(new String[] {"mobile"});
//		SimpleDateFormat a=new SimpleDateFormat("ddmmyyyy");
//		binder.registerCustomEditor(Date.class, "date", new CustomDateEditor(a, false));
////		binder.registerCustomEditor(String.class,"name" ,new StudentNameEditor());
//		
//	}
//	

	@RequestMapping(value="/AdmissionForm",method=RequestMethod.GET)
	public ModelAndView handle(){
		ModelAndView a=new ModelAndView("AdmissionForm");
		return a;
	}
	
	
//	@RequestMapping(value="/AdmissionSuccess",method=RequestMethod.POST)
//	public ModelAndView postMethod(@RequestParam("name") String names,@RequestParam("hobby") String hobbys){
//		System.out.println("inside object method");
//		Student s=new Student();
//		s.setName(names);
//		s.setHobby(hobbys);
//		ModelAndView a=new ModelAndView("AdmissionSuccess");
//		a.addObject("message","registered "+names+" "+hobbys);
//		a.addObject("student",s);
//		return a;
//	}
	
	@RequestMapping(value="/admission",method=RequestMethod.POST)
	public ModelAndView model(@Valid @ModelAttribute("student") Student student1,BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView error=new ModelAndView("AdmissionForm");
			return error;
		}
		
		System.out.println(student1.getAddress().getCity());
		System.out.println("inside the model method");
		ModelAndView m=new ModelAndView("AdmissionSuccess");
		return m;
		
	}
	
}
