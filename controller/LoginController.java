package com.task.shopCart.controller;

import com.task.shopCart.dto.dtoconfiguration.ResponseVO;
import com.task.shopCart.dto.req.EmpCredentialsReqDto;
import com.task.shopCart.dto.req.UserLoginReqDto;
import com.task.shopCart.dto.res.EmpCredentialsResDto;
import com.task.shopCart.dto.res.UserLoginResDto;
import com.task.shopCart.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {


    @Autowired

    private LoginService loginService;

    @RequestMapping(value="userLogin",method= RequestMethod.POST)
    public ResponseVO<UserLoginResDto> getUserNameForLoginCtrl(@RequestBody UserLoginReqDto userLoginReqDto) {
        System.out.println("Inside Rest Controller");

        ResponseVO<UserLoginResDto> responseVO = new ResponseVO<UserLoginResDto>();


        UserLoginResDto userLoginResDto = loginService.getUserNameLoginService(userLoginReqDto);

        if (userLoginResDto != null) {
            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
            System.out.println(responseVO.getStatusCode());
//            responseVO.setMessage(userLoginResDto.getLoginMsg());
            responseVO.setResult(userLoginResDto);
        } else {
            responseVO.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            System.out.println(responseVO.getStatusCode());
//            responseVO.setMessage(userLoginResDto.getLoginMsg());
            System.out.println("msg:" + responseVO.getMessage());
            responseVO.setResult(userLoginResDto);

        }
        return responseVO;
    }

}
