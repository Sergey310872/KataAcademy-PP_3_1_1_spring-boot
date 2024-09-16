package web.PP_3_1_1_spring_boot.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import web.PP_3_1_1_spring_boot.model.User;

import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUser() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        if (user.getId() == null) {
            entityManager.persist(user);
        } else {
            User userDB = entityManager.find(User.class, user.getId());
            userDB.setName(user.getName());
            userDB.setLastName(user.getLastName());
            userDB.setAge(user.getAge());
        }
    }

    @Override
    public void deleteUser(Long id) {
        User userDB = entityManager.find(User.class, id);
        entityManager.remove(userDB);
    }
}