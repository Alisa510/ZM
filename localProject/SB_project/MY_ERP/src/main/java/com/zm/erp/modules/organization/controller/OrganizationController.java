package com.zm.erp.modules.organization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/organization")
public class OrganizationController {

	@RequestMapping("/structurePage")
	public String structurePage (ModelMap modelMap) {
		modelMap.addAttribute("template", "organization/structurePage");
		return "indexSimple";
	}
	
	@RequestMapping("/departmentPage")
	public String departmentPage (ModelMap modelMap) {
		modelMap.addAttribute("template", "organization/departmentPage");
		return "indexSimple";
	}
}
