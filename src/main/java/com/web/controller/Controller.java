package com.web.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.codehaus.jettison.json.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.UserAuthorize;
import com.web.service.UserAuthorizeService;

@RestController
public class Controller {
	
	@Resource
	private UserAuthorizeService userAuthorizeService;
	
	@RequestMapping("/Controller/controller")
	public String index(){
		return "hello world!!!come on !!!";
	}
	@RequestMapping("/Controller/list")
	public String list(){
		UserAuthorize user = new UserAuthorize();
		List<Map<Object,Object>> lists = userAuthorizeService.list(user);
		System.out.println(lists.size());
		JSONArray jsonArray = new JSONArray();
		for(Map<Object,Object> map: lists){
			jsonArray.put(map);
		}
		return jsonArray.toString();
	}
}
