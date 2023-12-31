package web.Service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void removeUserById(long id);

    void updateUser(User userinfo, long id);

    void initialAddUser();

    User readUser(long id);
}
