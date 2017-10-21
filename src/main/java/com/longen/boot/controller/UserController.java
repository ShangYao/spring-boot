package com.longen.boot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.longen.boot.domain.User;
import com.longen.boot.service.UserService;

@Controller
public class UserController {

	@Resource
	UserService userService;

	@RequestMapping("/")
	public String index() {
		return "redirect:/list";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<User> users = userService.getUserList();
		model.addAttribute("users", users);
		return "user/list";
	}

	@RequestMapping("/toAdd")
	public String toAdd() {
		return "user/userAdd";
	}

	@RequestMapping("/add")
	public String add(User user) {
		userService.saveUser(user);
		return "redirect:/list";
	}

	@RequestMapping("/toEdit")
	public String toEdit(Model model, Long id) {
		User user = userService.findUserById(id);
		model.addAttribute("user", user);
		return "user/userEdit";
	}

	@RequestMapping("/delete")
	public String delete(Long id) {
		userService.delete(id);
		return "redirect:/list";
	}
}