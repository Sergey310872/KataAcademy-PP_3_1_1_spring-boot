package web.PP_3_1_1_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.PP_3_1_1_spring_boot.DAO.UserDAO;
import web.PP_3_1_1_spring_boot.DAO.UserRepository;
import web.PP_3_1_1_spring_boot.model.User;

import java.util.List;

@Service
public class ServiceUserImp implements ServiceUser {
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
//        return userDAO.getAllUser();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
//        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
//        userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
//        userDAO.deleteUser(id);
    }
}
