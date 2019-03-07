package com.sandica.springMVC;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.RequestContext;

import com.sandica.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Locale locale,Model model) {
		System.out.println("HomePage requested, locale = "+locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("servertime", formattedDate);
		return "home";
	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	public String user (@RequestParam("username") String user, Model model) {
	
		model.addAttribute("username",user);
		return "user";
	}
	
}
