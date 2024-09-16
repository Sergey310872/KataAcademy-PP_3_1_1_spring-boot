package web.PP_3_1_1_spring_boot.service;


import web.PP_3_1_1_spring_boot.model.User;

import java.util.List;

public interface ServiceUser {

    List<User> getAllUsers();

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
