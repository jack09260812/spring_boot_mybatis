package com.web.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.mapper.UserAuthorizeMapper;
import com.web.model.UserAuthorize;
import com.web.service.UserAuthorizeService;
@Service("userAuthorizeService")
public class UserAuthorizeServiceImpl implements UserAuthorizeService{

	@Resource
	private UserAuthorizeMapper userAuthorizeMapper;
	@Override
	public void add(List<UserAuthorize> lists) {
		
	}

	@Override
	public List<Map<Object,Object>> list(UserAuthorize user) {
		return userAuthorizeMapper.findByName();
	}

	@Override
	public void update(UserAuthorize userAuthorize) {
		
	}

	@Override
	public void delete(UserAuthorize userAuthorize) {
		
	}
}
