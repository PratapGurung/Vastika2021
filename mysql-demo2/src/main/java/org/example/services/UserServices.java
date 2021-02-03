package org.example.services;

import org.example.model.User;

import java.util.List;

public interface UserServices {
    int saveUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
    User getUserById(int id);
    List<User> getAllUser();
}
