package co.edu.utp.misiontic.g12g4.backend.taskhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Spring MVC

@Controller
public class TaskHomeController {
    
    @GetMapping("/principal")
    public String goToPrincipal(Model model){
        return "";
    }

    @GetMapping("/login")
    public String goToLogin(Model model){
        return "login";
    }

    @GetMapping("/registro")
    public String goToRegistro(Model model){
        return "registro";
    }
}
