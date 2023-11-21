package com.example.demo.Controller;

import com.example.demo.Entity.dto.LoginResult;
import com.example.demo.Entity.member.Account364;
import com.example.demo.Service.ServiceLibman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController364 {
    @Autowired
    ServiceLibman serviceLibman;

    @GetMapping("/login")
    public String getLoginPage() {
        return "LoginFrm.html";
    }

    @GetMapping("/home/reader")
    public String getReaderHomePage() {
        return "reader/ReaderHomePageFrm364.html";
    }

    @GetMapping("/home/manager")
    public String getManagerHomePage() {
        return "manager/ManagerHomePageFrm364.html";
    }


}
