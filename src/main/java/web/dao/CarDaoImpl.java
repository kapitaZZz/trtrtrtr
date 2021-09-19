package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static List<Car> cars = new ArrayList<>();


    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    static {
        cars.add(new Car("UAZ", "gray", 3.6));
        cars.add(new Car("lada", "white", 1.6));
        cars.add(new Car("ford", "black", 2.0));
        cars.add(new Car("bmw", "yellow", 2.5));
        cars.add(new Car("nissan", "red", 2.4));
    }
}
