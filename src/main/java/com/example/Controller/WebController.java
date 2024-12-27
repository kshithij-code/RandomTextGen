package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {
    List<Integer> list1 =new ArrayList<Integer>();
    public WebController(){
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
    }
    @GetMapping(value = "/")
    public String index(Model model){

        System.out.println(list1);
        model.addAttribute("List",list1);
        return "index";
    }
    @GetMapping(value = "/add")
    public String add(Model model){
        List<Integer> list=new ArrayList<>();
        model.addAttribute("List",list);
        return "add";
    }
    @PostMapping(value = "/addShit")
    public String addShit(@ModelAttribute("List") List<Integer> list,Model model){
        list1.addAll(list);
        model.addAttribute("List",list1);
        return "index";
    }
}
