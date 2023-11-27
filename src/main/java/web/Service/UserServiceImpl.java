package web.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.Dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Transactional
    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);

    }

    @Transactional
    @Override
    public void updateUser(User userinfo, long id) {
        userDao.updateUser(userinfo, id);
    }

    @Transactional
    @Override
    public User readUser(long id) {
        return userDao.readUser(id);
    }

    @Override
    public void initialAddUser() {
        userDao.initialAddUser();
    }
}

