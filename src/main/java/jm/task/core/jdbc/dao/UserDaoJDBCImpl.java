package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserDaoJDBCImpl implements UserDao {


    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
//        String sql = "CREATE TABLE users(id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT, name VARCHAR(50), last_name VARCHAR(50), age TINYINT(3));";
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.execute(sql);
//        } catch (SQLException e) {
//            System.out.println("База данных уже существует!");
//        }
//        System.out.println("База данных успешно создана!");
    }

    public void dropUsersTable() {
//        String sql = "DROP TABLE IF EXISTS users;";
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.execute(sql);
//        } catch (SQLException e) {
//            System.out.println("Базы данных с таким именем не существует!");
//        }
//        System.out.println("База данных успешно удалена!");
    }


    public void saveUser(String name, String lastName, byte age) {
//        String sql = "INSERT INTO users (name, last_name, age) VALUES (?, ?, ?)";
//        try (Connection connection = Util.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//            System.out.println("Новый пользователь с именем " + name + " успешно добавлен!");
//        } catch (SQLException e) {
//            System.out.println("Ошибка при добавлении пользователя!");
//        }
    }

    public void removeUserById(long id) {
//        String sql = "DELETE from users where id = ?";
//        try (Connection connection = Util.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//            System.out.println("Пользователь с id " + id + " удален!");
//        } catch (SQLException e) {
//            System.out.println("Ошибка при удалении пользователя!");
//        }


    }

    public List<User> getAllUsers() {
//        List<User> userList = new ArrayList<>();
//        String sql = "SELECT * FROM users";
//        try (Connection connection = Util.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            ResultSet resultSet = preparedStatement.executeQuery(sql);
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("last_name"));
//                user.setAge(resultSet.getByte("age"));
//                userList.add(user);
//            }
//            System.out.println("Список всех пользователей получен :");
//        } catch (SQLException e) {
//            System.out.println("Ошибка при получении списка пользователей");
//        }
        return null;
    }

    public void cleanUsersTable() {
//        String sql = "TRUNCATE TABLE users";
//        try (Connection connection = Util.getConnection();
//             Statement statement = getConnection().createStatement()) {
//            statement.executeUpdate(sql);
//            System.out.println("Таблица пользователей очищенна!");
//        }catch (SQLException e){
//            System.out.println("Ошибка при очистке таблицы");
//        }
    }
}
