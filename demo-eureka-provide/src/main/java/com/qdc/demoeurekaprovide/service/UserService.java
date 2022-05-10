package com.qdc.demoeurekaprovide.service;

import com.qdc.demoeurekaprovide.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public User selectUserById(String id){
        return new User("aaa","123","zlp");
    }
    public List<User> selectAllUsers(){
        List<User> users=new ArrayList<>();
        User u1=new User("test","1222","aaaa");
        User u2=new User("test","1222","aaa");
        users.add(u1);
        users.add(u2);
        return users;
    }
    public boolean addUser(User u){
        return true;
    }
    public boolean updateUser(User u){
        return true;
    }
    public boolean deleteUser(String name){
        return true;
    }

}
