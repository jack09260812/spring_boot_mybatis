package com.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.WorkFlowRunLog;
import com.web.service.WorkFlowRunLogService;

@RestController
public class WorkFlowRunLogController {

	private WorkFlowRunLogService workFlowRunLogService;
	
	@RequestMapping("/WorkFlowRunLogController/add")
	public String add(WorkFlowRunLog workFlowRunLog){
		return null;
	}
	@RequestMapping("/WorkFlowRunLogController/list")
	public String list(WorkFlowRunLog workFlowRunLog){
		return null;
	}
	@RequestMapping("/WorkFlowRunLogController/update")
	public String update(WorkFlowRunLog workFlowRunLog){
		return null;
	}
}
