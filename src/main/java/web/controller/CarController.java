package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    private CarService carService;


    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")

    public  String gerCar(Model model, @RequestParam(value = "count",defaultValue = "5")int count){
        model.addAttribute("cars", carService.getCountCar(count));
        return "cars";
    }

//    public String getCar(ModelMap modelMap){
//
//        List <Car> cars = carService.getCountCar(count);//  ?????????
//        modelMap.addAttribute("cars",cars);
//        return "cars";
//    }

    }