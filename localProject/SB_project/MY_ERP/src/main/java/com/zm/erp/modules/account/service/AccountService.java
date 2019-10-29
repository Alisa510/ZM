package com.zm.erp.modules.account.service;

import com.zm.erp.common.Result;
import com.zm.erp.modules.account.entity.User;

public interface AccountService {

	Result insertUser(User user);
	
	Result getUserResult(User user);
}
