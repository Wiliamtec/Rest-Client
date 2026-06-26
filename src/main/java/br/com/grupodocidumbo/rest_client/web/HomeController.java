package br.com.grupodocidumbo.rest_client.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

    @GetMapping
    public String inicio(){
        return "home";
    }

}
