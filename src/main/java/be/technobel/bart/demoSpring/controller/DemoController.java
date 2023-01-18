package be.technobel.bart.demoSpring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/message")
    public String displayMessage(Model model){
        String message = "Mon message venant du controller";
        model.addAttribute("msg",message);
        return "message-view";
    }

}
