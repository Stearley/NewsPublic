package com.ippsby.publicnews.service;

import com.ippsby.publicnews.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserModel save(UserModel user);

    void delete(UserModel userId);

    List<UserModel> findAll();

    UserModel login(String username, String password);

    UserModel find (long userId);
}



