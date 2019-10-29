package com.zm.erp.modules.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 授权控制器
 * @author Alisa
 *
 */
@Controller
@RequestMapping("/authority")
public class AuthorityController {
	@RequestMapping("/roleAuthPage")
	public String rolePage(ModelMap modelMap) {
		modelMap.addAttribute("template", "authority/roleAuthPage");
		return "indexSimple";
	}
	

	@RequestMapping("/departmentAuthPage")
	public String departmentPage(ModelMap modelMap) {
		modelMap.addAttribute("template", "authority/departmentAuthPage");
		return "indexSimple";
	}
}
