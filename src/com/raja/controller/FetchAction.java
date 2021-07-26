package com.raja.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.raja.utils.DbUtils;

public class FetchAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<User> list = null;
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}


	public String execute() throws Exception {
		ResultSet rs = null;
		User user = null;
		list = DbUtils.FetchData();
		System.out.println("**********" + list);
		if (list != null) {
		
				return "SUCCESS";
			}

		
		return null;
	}

}
