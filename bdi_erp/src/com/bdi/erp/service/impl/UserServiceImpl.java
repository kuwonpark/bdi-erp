package com.bdi.erp.service.impl;

import com.bdi.erp.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean login(String id, String pwd) {
		if(id == null || pwd == null) {
			return false;
		}
		
		if(id.equals("coco")) {
			if(pwd.equals("c1c2c3")){
				return true;
			}
		}
		return false;
	}

}
