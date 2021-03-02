package softuni.eshop.repository;

import org.springframework.data.repository.CrudRepository;
import softuni.eshop.model.entity.Order;

import java.util.Date;
import java.util.List;


public interface OrderRepository  extends CrudRepository<Order, Long> {
    List<Order> findByDeliveryZip(String deliveryZip);
    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
}