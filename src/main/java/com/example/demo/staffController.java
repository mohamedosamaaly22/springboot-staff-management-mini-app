package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class staffController {
    List<staff> staffList = new ArrayList<>();
    @GetMapping("/")
    public String AddStaff(Model model) {
        model.addAttribute("newStaff", new staff());
        return "staff";
    }
    @PostMapping("/submitStaff")
    public String postMethodName(staff newStaff) {
        staffList.add(newStaff);
        return "redirect:/getStaffList";
    }
    @GetMapping("/getStaffList")
    public String getMethodName(Model model) {
        model.addAttribute("staffList", staffList);
        return "getStaff";
    }
    
    
}
