package com.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.WorkFlowNodeRunLog;
import com.web.service.WorkFlowNodeRunLogService;

@RestController
public class WorkFlowNodeRunLogController {

	private WorkFlowNodeRunLogService workFlowNodeRunLogService;
	
	@RequestMapping("/WorkFlowNodeRunLogController/add")
	public String add(WorkFlowNodeRunLog workFlowNodeRunLog){
		return null;
	}
	@RequestMapping("/WorkFlowNodeRunLogController/list")
	public String list(WorkFlowNodeRunLog workFlowNodeRunLog){
		return null;
	}
	@RequestMapping("/WorkFlowNodeRunLogController/update")
	public String update(WorkFlowNodeRunLog workFlowNodeRunLog){
		return null;
	}
}
