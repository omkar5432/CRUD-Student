package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controll {
	@Autowired
	repo rp;
	@Autowired
	service se;
	
	@RequestMapping("/")
	public String one()
	{
		return "index";
	}
	
	@PostMapping("/next")
	public String two(@ModelAttribute("st") student st)
	{
		se.getdata(st);
		return "redirect:/welcome";
		
	}
	
	@RequestMapping("/welcome")
	public String three(ModelMap m)
	{
		List<student> s1 =se.getallstudent();
		m.addAttribute("s1", s1);
		return "welcome";
	}
	
	
	@RequestMapping("/del")
	public String delete(@RequestParam("id") int id)
	{
		se.deletedata(id);
		return "redirect:/welcome";
	}
	
	@RequestMapping("/edit")
	public String update(@RequestParam("id") int id,ModelMap m)
	{
		student s=se.updatedata(id);
		m.addAttribute("data", s);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute("stud") student stud)
	{
		se.update(stud);
		return "redirect:/welcome";
	}
	


}
