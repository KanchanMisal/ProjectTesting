package com.task.shopCart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@Table(name = "emp_credentials")
public class EmpCredentials {
    @Id
    @Column(name = "emp_credentials_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empCredentialsId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "user_login_status")
    private String userLoginStatus;


}
