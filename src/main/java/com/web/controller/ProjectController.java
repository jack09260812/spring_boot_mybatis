package com.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Project;
import com.web.service.ProjectService;

@RestController
public class ProjectController {

	private ProjectService projectService;
	
	@RequestMapping("/ProjectController/add")
	public String add(Project project){
		return null;
	}
	@RequestMapping("/ProjectController/list")
	public String list(Project project){
		return null;
	}
	
	@RequestMapping("/delete")
	public String delete(Project project){
		return null;
	}
}
