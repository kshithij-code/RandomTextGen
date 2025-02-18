package com.application.Controller;

import com.application.Repository.User;
import com.application.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth0")
public class UserAuthentication {
    @Autowired
    UserService userService;
    @GetMapping
    private String login(Model model){
        model.addAttribute("user",new User());
        return "login";
    }
    @PostMapping("/login")
    private String login(@ModelAttribute("user") User user,Model model){
        System.out.println(user.toString());
        if(!userService.verfyUser(user.getEmail())){
            model.addAttribute("user",user);
            return "register";
        }
        model.addAttribute("user",user);
        return "Home";
    }
    @PostMapping("/register")
    private String register(@ModelAttribute("user") User user){
        userService.createUser(user);
        return "login succ";
    }
}
