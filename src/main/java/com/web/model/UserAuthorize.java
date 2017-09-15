package com.web.model;

public class UserAuthorize {

	private int id;
	private int userId;
	private int ownerId;
	private int project_id;
	private int workflow_id;
	private int create_time;
	private int modify_time;
	private int dt;

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public int getWorkflow_id() {
		return workflow_id;
	}

	public void setWorkflow_id(int workflow_id) {
		this.workflow_id = workflow_id;
	}

	public int getCreate_time() {
		return create_time;
	}

	public void setCreate_time(int create_time) {
		this.create_time = create_time;
	}

	public int getModify_time() {
		return modify_time;
	}

	public void setModify_time(int modify_time) {
		this.modify_time = modify_time;
	}

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId; 
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
}
