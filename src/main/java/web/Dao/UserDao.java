package web.Dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    void removeUserById(long id);

    void updateUser(User userinfo);

    void initialAddUser();

    User readUser(long id);
}

