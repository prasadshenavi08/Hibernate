package com.model;

import com.model.User; // Adjust this to match the actual package of the User class
import java.util.List;

public interface UserDao {
    void addUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(int id);
}
