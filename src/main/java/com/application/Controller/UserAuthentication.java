package com.application.Controller;

import com.application.Repository.User;
import com.application.Service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auth")
public class UserAuthentication {
    UserService userService;
    @GetMapping
    private String login(Model model){
        User user =new User();
        model.addAttribute("User",user);
        return "login";
    }
    @PostMapping("/login")
    private String login(@ModelAttribute("User") User user){
        userService.getByEmail(user.getEmail());
        return "index";
    }
}
