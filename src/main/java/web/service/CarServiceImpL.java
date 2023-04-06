package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpL implements CarService{

    private List<Car> carList = new ArrayList<>();

    public CarServiceImpL(){
        carList.add(new Car("red","ford", 3));
        carList.add(new Car("grey","audi", 7));
        carList.add(new Car("yellow","opel", 1));
        carList.add(new Car("white","mazda", 2));
        carList.add(new Car("black","bmw", 6));
    }
//    @Override
//    public List<Car> getCar() {
//        return carList;
//    }


    @Override
    public List<Car> getCountCar(Integer count) {
        if (count >= 5){
             return carList;

        }
        return carList.subList(0, count);

//       if ((count == null || count < 1)){
//           count = carList.size();
//       }else if (count > carList.size()){
//           throw new IllegalArgumentException("Запрошенное" +
//                   "количество машин больше, чем количество машин в списке");
//
//       }
//       return carList.subList(0, count);
    }
}
