package com.CollegeManagment.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @GetMapping("/admin_login")
    public String adminLogin() {
        return "admin_login.html";
    }

    @PostMapping("/admin_login")
    public String loginAdmin(@RequestParam String email, @RequestParam String password) {
        // Implement admin authentication logic
        return "redirect:/admin_dashboard";
    }

    @GetMapping("/admin_dashboard")
    public String adminDashboard() {
        return "admin_dashboard.html";
    }
}
