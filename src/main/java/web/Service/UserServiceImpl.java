package web.Service;

import org.springframework.stereotype.Service;
import web.Dao.UserDao;
import web.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void add(User user) {
        userDao.add(user);
    }


    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }


    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);

    }

    @Override
    public void updateUser(User userinfo, long id) {
        userDao.updateUser(userinfo,id);
    }

    @Override
    public User readUser(long id) {
        return userDao.readUser(id);
    }

    @Override
    public void initialAddUser() {
        userDao.initialAddUser();
    }
}

