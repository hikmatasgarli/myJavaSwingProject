/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.orient.course.service;

import az.orient.course.dao.LoginDao;
import az.orient.course.model.LoginUser;

/**
 *
 * @author Ideas.az
 */
public class LoginServiceImpl implements LoginService{

    private LoginDao loginDao;
    
    public LoginServiceImpl(LoginDao loginDao) {
          this.loginDao = loginDao;
    }

    @Override
    public LoginUser login(String username, String password) throws Exception {
          return loginDao.login(username, password);
    }
    
}
