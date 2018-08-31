package com.names.Generator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String app(Model model){
        RandomNameGenerator rn = new RandomNameGenerator("pokemon");
        for (int i = 0; i < 3; i++){
            System.out.println(rn.next());
        }
        model.addAttribute("team_name1", rn.next());
        model.addAttribute("team_name2", rn.next());
        model.addAttribute("team_name3", rn.next());
        return "app";
    }

    @GetMapping("/project")
    public String project(){
        return "project";
    }

    @GetMapping("/avatar")
    public String avatar(){
        return "avatar";
    }

    @GetMapping("/result")
    public String result(){
        return "result";
    }

    @RequestMapping("/app/{theme}")
    public String appThemed(@PathVariable(required = false, value="theme") String theme, Model model) {
        RandomNameGenerator rn = new RandomNameGenerator(theme);

        for (int i = 0; i < 3; i++){
            System.out.println(rn.next());
        }
        model.addAttribute("team_name1", rn.next());
        model.addAttribute("team_name2", rn.next());
        model.addAttribute("team_name3", rn.next());
        model.addAttribute("project_name", rn.next());
        return "gen";
    }
}
