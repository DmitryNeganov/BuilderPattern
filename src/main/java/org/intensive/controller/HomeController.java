package org.intensive.controller;

import org.intensive.builder.Director;
import org.intensive.builder.Lunch;
import org.intensive.builder.concrete_builders.FullLunchBuilder;
import org.intensive.builder.concrete_builders.LightLunchBuilder;
import org.intensive.builder.concrete_builders.StandardLunchBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomeView() {
        return "home";
    }

    @RequestMapping("/lightLunch")
    public String getLightLunch(Model model) {
        Lunch lunch = (new Director()).getLunch(new LightLunchBuilder());
        String lightLunch = lunch.toString();
        model.addAttribute("lunch", lightLunch);
        return "lunch";
    }

    @RequestMapping("/standardLunch")
    public String getStandardLunch(Model model) {
        Lunch lunch = (new Director()).getLunch(new StandardLunchBuilder());
        String lightLunch = lunch.toString();
        model.addAttribute("lunch", lightLunch);
        return "lunch";
    }

    @RequestMapping("/fullLunch")
    public String getFullLunch(Model model) {
        Lunch lunch = (new Director()).getLunch(new FullLunchBuilder());
        String lightLunch = lunch.toString();
        model.addAttribute("lunch", lightLunch);
        return "lunch";
    }
}
