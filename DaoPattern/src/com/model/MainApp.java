package com.model;

import dao.UserDao;
import dao.UserDaoImpl;
import com.model.User;

public class MainApp {
    public static void main(String[] args) {
    	UserDao userDao = new UserDaoImpl();

        // Add Users
    	userDao.addUser(new User(0, "Alice", "alice@example.com"));
    	userDao.addUser(new User(0, "Bob", "bob@example.com"));

        // Fetch All Users
    	System.out.println("All Users:");
    	userDao.getAllUsers().forEach(System.out::println);

        // Fetch User by ID
    	System.out.println("User with ID 1:");
    	System.out.println(userDao.getUserById(1));

        // Update User
        User user = userDao.getUserById(1);
        if (user != null) {
        	user.setName("Alice Updated");
        	userDao.updateUser(user);
        }

        // Fetch Updated User
        System.out.println("Updated User with ID 1:");
        System.out.println(userDao.getUserById(1));

        // Delete User
        userDao.deleteUser(2);

        // Fetch All Users After Deletion
        System.out.println("All Users After Deletion:");
        userDao.getAllUsers().forEach(System.out::println);
    }
}
