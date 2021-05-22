package com.company.dienLanhBachKhoa.service;

import com.company.dienLanhBachKhoa.exception.UserNotfoundException;
import com.company.dienLanhBachKhoa.model.User;
import com.company.dienLanhBachKhoa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        //hash password và chuyển về Base64.String()




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

    @Transactional
    public void deleteUser(Long id){
        userRepo.deleteUserById(id);
    }
}
