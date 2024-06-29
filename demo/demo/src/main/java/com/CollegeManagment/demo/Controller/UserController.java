package com.CollegeManagment.demo.Controller;

import com.CollegeManagment.demo.ENTITY.User;
import com.CollegeManagment.demo.SERVICE.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration.html";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute User user) {
        userService.save(user); // Corrected this line
        return "redirect:/login";
    }

    @GetMapping("/schedule_meeting")
    public String scheduleMeeting() {
        return "schedule_meeting.html";
    }
}
