package com.sandica.springMVC;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sandica.entity.User;

@Controller
public class HomeController {
	
	public static ArrayList<User> list;
	
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
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String register (Model model) {
		
		return "register";
	}
	
	@RequestMapping(value="/welcome", method = RequestMethod.POST)
	public String welcome (@RequestParam("fname") String firstname,@RequestParam("lname") String lastname,@RequestParam("uname") String username,@RequestParam("upass") String password, Model model) {
		User user = new User(firstname, lastname, username, password);
		list = new ArrayList<User>();
		list.add(user);
		model.addAttribute("firstname",firstname);
		model.addAttribute("lastname",lastname);
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		return "welcome";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list (User user, Model model) {
		model.addAttribute("list", list);
		return "list";
	}
	
}
