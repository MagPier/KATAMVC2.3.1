package web.Dao;


import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void add(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    public User readUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void removeUserById(long id) {
        User user = readUser(id);
        if (null == user) {
            throw new NullPointerException("User not found");
        }
        entityManager.remove(user);
        entityManager.flush();
    }

    @Override
    public void updateUser(User userinfo) {
        entityManager.merge(userinfo);
        entityManager.flush();
    }

    @Override
    public void initialAddUser() {

        add(new User("Ivan", "Ivanov", "ivan@internet.ru"));
        add(new User("Petr", "Petrov", "petr@internet.ru"));
        add(new User("Semen", "Semenov", "semen@internet.ru"));
        add(new User("Sidor", "Sidorov", "sidor@internet.ru"));
    }
}
