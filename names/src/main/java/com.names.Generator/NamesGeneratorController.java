package com.names.Generator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NamesGeneratorController {


    @RequestMapping("/")
    public String index(Model model) {
        // any processing

        //userRepository.findById(1);
        return "home";
    }

    @GetMapping("/home")
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/app")
    public String app(){;
        return "app";
    }

}
