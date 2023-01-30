package org.intensive.controller;

import org.intensive.builder.Director;
import org.intensive.builder.Lunch;
import org.intensive.builder.concrete_builders.FullLunchBuilder;
import org.intensive.builder.concrete_builders.LightLunchBuilder;
import org.intensive.builder.concrete_builders.StandardLunchBuilder;
import org.intensive.builder.repo.LunchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    LunchRepo lunchRepo;

    @GetMapping("/")
    public String showHomeView() {
        return "home";
    }

    @GetMapping("/lightLunch")
    public String getLightLunch(Model model) {
        Lunch lunch = (new Director()).getLunch(new LightLunchBuilder());
        String lightLunch = lunch.toString();
        model.addAttribute("lunch", lightLunch);
        lunchRepo.save(lunch);
        return "lunch";
    }

    @GetMapping("/standardLunch")
    public String getStandardLunch(Model model) {
        Lunch lunch = (new Director()).getLunch(new StandardLunchBuilder());
        String lightLunch = lunch.toString();
        model.addAttribute("lunch", lightLunch);
        lunchRepo.save(lunch);
        return "lunch";
    }

    @GetMapping("/fullLunch")
    public String getFullLunch(Model model) {
        Lunch lunch = (new Director()).getLunch(new FullLunchBuilder());
        String lightLunch = lunch.toString();
        model.addAttribute("lunch", lightLunch);
        lunchRepo.save(lunch);
        return "lunch";
    }

    @GetMapping("/menu")
    public String getMenu(Model model){
        List<Lunch> menu = lunchRepo.findAll();
        model.addAttribute("menu", menu);
        return "menu";
    }


}
