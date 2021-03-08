package softuni.eshop.repository;


import org.springframework.data.repository.CrudRepository;
import softuni.eshop.model.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
