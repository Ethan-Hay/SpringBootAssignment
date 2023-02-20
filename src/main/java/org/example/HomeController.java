package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
@RequestMapping("/")
    public String showHomepage(){
    return "index";
}
@RequestMapping("/step-one")
    public String showStepOne(){
    return "stepOne";
}
@RequestMapping("/step-two")
    public String showStepTwo(){
    return "stepTwo";
}
    @RequestMapping("/step-three")
    public String showStepThree(){
        return "stepThree";
    }
}
