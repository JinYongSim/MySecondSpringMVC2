package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class homeController {
    @RequestMapping(value = "/signUP", method = RequestMethod.GET)
    public String signUp(){
        return "signUp";
    }
}
