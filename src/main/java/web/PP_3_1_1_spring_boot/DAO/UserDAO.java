package web.PP_3_1_1_spring_boot.DAO;

import web.PP_3_1_1_spring_boot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUser();

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
