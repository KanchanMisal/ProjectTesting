package com.task.shopCart.service.impl;


import com.task.shopCart.dao.LoginDao;
import com.task.shopCart.dto.req.EmpCredentialsReqDto;
import com.task.shopCart.dto.req.UserLoginReqDto;
import com.task.shopCart.dto.res.EmpCredentialsResDto;
import com.task.shopCart.dto.res.UserLoginResDto;
import com.task.shopCart.dto.res.UserPrivilegeResDto;
import com.task.shopCart.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceimpl implements LoginService {


    @Autowired
    private LoginDao loginDao;




    @Override
    public UserLoginResDto getUserNameLoginService(UserLoginReqDto userLoginReqDto) {
        UserLoginResDto userLoginResDto = new UserLoginResDto();


        UserLoginResDto user1 = new UserLoginResDto();



        userLoginResDto = loginDao.getUserNameLoginDao(userLoginReqDto);


        if (userLoginResDto != null) {

            if (userLoginResDto.getUserLoginStatus().equalsIgnoreCase("Active")) {

                if (userLoginResDto.getUserPass().equals(userLoginReqDto.getUserPass())) {

                    System.out.println("Verified ...");
//                    UserPrivilegeResDto userPrivilegeResDto = loginDao.getLoginPrivilageDao(userLoginResDto);
//                    userLoginResDto.setUserPrivilegeResDto(userPrivilegeResDto);
                    userLoginResDto.setLoginMsg("Sucessfully Login..!!");
//                    userLoginResDto.setLoginStatus(true);

                    user1 = userLoginResDto;
                    return user1;
                } else {
                    userLoginResDto = new UserLoginResDto();
//                    userLoginResDto.setLoginStatus(false);
                    userLoginResDto.setLoginMsg("Wrong Password..!!");
                    user1 = userLoginResDto;
                    return user1;
                }

            }

        }
        return user1;
    }



}


