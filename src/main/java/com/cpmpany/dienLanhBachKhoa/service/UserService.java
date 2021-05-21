package com.cpmpany.dienLanhBachKhoa.service;

import com.cpmpany.dienLanhBachKhoa.exception.UserNotfoundException;
import com.cpmpany.dienLanhBachKhoa.model.User;
import com.cpmpany.dienLanhBachKhoa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        user.setUserCode(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    public List<User> findAllUser(){
        return userRepo.findAll();
    }

    public User findUserById(Long id){
        return userRepo.findUserById(id)
                .orElseThrow(() -> new UserNotfoundException("Not found User with id :" +id));
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }


    public void deleteUser(Long id){
        userRepo.deleteUserById(id);
    }
}
