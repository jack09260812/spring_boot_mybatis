package com.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.WorkFlow;
import com.web.service.WorkFlowService;

@RestController
public class WorkFlowController {

	private WorkFlowService workFlowService;
	
	@RequestMapping("/WorkFlowController/add")
	public String add(WorkFlow workFlow){
		return null;
	}
	@RequestMapping("/WorkFlowController/list")
	public String list(WorkFlow workFlow){
		return null;
	}
	@RequestMapping("/WorkFlowController/update")
	public String update(WorkFlow workFlow){
		return null;
	}
}
