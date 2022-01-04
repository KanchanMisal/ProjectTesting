package com.task.shopCart.dto.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpCredentialsReqDto {
    private Integer empCredentialsId;

    private String userName;

    private String userPass;

    private String userLoginStatus;
}
