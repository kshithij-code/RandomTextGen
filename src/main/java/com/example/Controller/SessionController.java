package com.example.Controller;

import com.example.Repository.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/auth")
public class SessionController {
    @PostMapping
    private String VerifyUser(HttpSession session,@RequestBody User user){
        session.setAttribute(user.getName() ,true);
        return "index";
    }
    @GetMapping
    private String InSession(HttpSession session){
        System.out.println(session.getAttribute("John Doe"));
        return "index";
    }
    @DeleteMapping
    private String RemoveUser(HttpSession session,@RequestBody User user){
        session.removeAttribute(user.getName());
        return "index";
    }
}
