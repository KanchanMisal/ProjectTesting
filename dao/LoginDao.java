package com.task.shopCart.dao;

import com.task.shopCart.dto.req.EmpCredentialsReqDto;
import com.task.shopCart.dto.req.UserLoginReqDto;
import com.task.shopCart.dto.res.EmpCredentialsResDto;
import com.task.shopCart.dto.res.UserLoginResDto;
import com.task.shopCart.dto.res.UserPrivilegeResDto;

public interface LoginDao  {
  UserLoginResDto getUserNameLoginDao(UserLoginReqDto userLoginResDto);

//
}

