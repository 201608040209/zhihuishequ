package com.sc.resident.controller.car;

import com.sc.resident.service.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vo.Result;

/**
 * Package: com.sc.resident.controller.car
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2020/4/2 13:25
 */
@Controller
@RequestMapping("sc/resident/car")
public class CarController {
    @Autowired
    CarService carService;
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    @ResponseBody
    public Result findCarEntiyById(){
        return new Result().setSuccess(carService.findCarEnityById("1"));
    }
}
