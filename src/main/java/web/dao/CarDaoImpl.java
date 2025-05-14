package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> carList = Arrays.asList(
            new Car("Lada", "red", 2024),
            new Car("Toyota", "white", 2023),
            new Car("Lexus", "black", 2021),
            new Car("Audi", "green", 2024),
            new Car("BMW", "green", 2024));


    public List<Car> getCarList(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }


}
