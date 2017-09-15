package com.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.WorkFlowNode;
import com.web.service.WorkFlowNodeService;

@RestController
public class WorkFlowNodeController {

	private WorkFlowNodeService workFlowNodeService;
	@RequestMapping("/WorkFlowNodeController/add")
	public String add(WorkFlowNode workFlowNode){
		return null;
	}
	@RequestMapping("/WorkFlowNodeController/list")
	public String list(WorkFlowNode workFlowNode){
		return null;
	}
	@RequestMapping("/WorkFlowNodeController/update")
	public String update(WorkFlowNode workFlowNode){
		return null;
	}
	@RequestMapping("/WorkFlowNodeController/delete")
	public String delete(WorkFlowNode workFlowNode){
		return null;
	}
}
