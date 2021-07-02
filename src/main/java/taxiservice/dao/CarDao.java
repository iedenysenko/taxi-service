package taxiservice.dao;

import java.util.List;
import taxiservice.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
