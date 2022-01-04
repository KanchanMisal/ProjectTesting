package com.task.shopCart.dao.impl;

import com.task.shopCart.dao.LoginDao;
import com.task.shopCart.dto.req.EmpCredentialsReqDto;
import com.task.shopCart.dto.req.UserLoginReqDto;
import com.task.shopCart.dto.res.EmpCredentialsResDto;
import com.task.shopCart.dto.res.UserLoginResDto;
import com.task.shopCart.dto.res.UserPrivilegeResDto;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserLoginResDto getUserNameLoginDao(UserLoginReqDto userLoginResDto1) {
        System.out.println("Inside Dao");

        Session session = null;

        try {
            session = sessionFactory.openSession();

//

            Query query=session.createQuery("select u.userName as userName, u.userPass as userPass, u.userLoginStatus as userLoginStatus , u.empCredentialsId as empCredentialsId from EmpCredentials as u where u.userName=:userName and u.userPass=:userPass ");
            query.setParameter("userName", userLoginResDto1.getUserName());
            query.setParameter("userPass", userLoginResDto1.getUserPass());

            query.setResultTransformer(Transformers.aliasToBean(UserLoginResDto.class));

            UserLoginResDto userLoginResDto = (UserLoginResDto) query.uniqueResult();

            return userLoginResDto;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }



}

