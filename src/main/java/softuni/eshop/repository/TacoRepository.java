package softuni.eshop.repository;

import org.springframework.data.repository.CrudRepository;
import softuni.eshop.model.entity.Taco;


public interface TacoRepository extends CrudRepository<Taco, Long> {

}
