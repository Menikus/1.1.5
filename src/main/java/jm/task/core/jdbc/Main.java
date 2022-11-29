package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Oleg", "Olegovich", (byte) 20);
        userService.saveUser("Ivan", "Ivanovich", (byte) 25);
        userService.saveUser("Petr", "Petrovich", (byte) 30);
        userService.saveUser("Anatoliy", "Anatolievich", (byte) 30);
//        userService.removeUserById(3);
        
        List<User> userList = userService.getAllUsers();
        userList.stream().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeSession();
    }
}

