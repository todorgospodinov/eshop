package softuni.eshop.repository;

import org.springframework.data.repository.CrudRepository;
import softuni.eshop.model.entity.Ingredient;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
