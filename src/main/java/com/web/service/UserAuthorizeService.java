package com.web.service;

import java.util.List;
import java.util.Map;

import com.web.model.UserAuthorize;

public interface UserAuthorizeService {

	public void add(List<UserAuthorize> lists);
	
	public List<Map<Object,Object>> list(UserAuthorize userAuthorize);
	
	public void update(UserAuthorize userAuthorize);
	
	public void delete(UserAuthorize userAuthorize);
}
