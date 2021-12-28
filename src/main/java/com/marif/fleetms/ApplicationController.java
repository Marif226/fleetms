package com.marif.fleetms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/hr")
    public String widget() {
        return "/hr/index";
    }

    @GetMapping("/vehicle")
    public String vehicle() {
        return "/vehicle/index";
    }

    @GetMapping("/helpdesk")
    public String helpdesk() {
        return "helpdesk/index";
    }

    @GetMapping("/account")
    public String account() {
        return "account/index";
    }

    @GetMapping("/payroll")
    public String payroll() {
        return "payroll/index";
    }

    @GetMapping("/parameters")
    public String parameters() {
        return "parameters/index";
    }
}
