package zhaolu.emm.dao.impl;

import zhaolu.emm.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name,String password){
        if (name.equals("张三")&password.equals("123")){
            return true;
        }
            return false;
    }
}
