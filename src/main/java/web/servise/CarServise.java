package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final List<Car> carList =new ArrayList<>();

    {
        carList.add(new Car(1, "LADA 2106", 1994));
        carList.add(new Car(2, "Granta", 2007));
        carList.add(new Car(3, "LADA 2109", 1999));
        carList.add(new Car(4, "VAZ Niva", 2006));
        carList.add(new Car(5, "LADA Priora", 2018));
    }
    public List<Car> getAll() {
        return carList;
    }
    public Car getById(int id){
        return carList.stream().filter(e->e.getId()==id).findAny().orElse(null);
    }
    public List<Car> getCarCount(Integer count){
        if (Objects.nonNull(count)) {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
        return carList;
    }
}
