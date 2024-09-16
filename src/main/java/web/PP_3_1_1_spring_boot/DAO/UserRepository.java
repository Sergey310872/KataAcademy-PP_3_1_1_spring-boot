package web.PP_3_1_1_spring_boot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.PP_3_1_1_spring_boot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
