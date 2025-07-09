package org.inamsay.net.appcacheinfinity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wellcome")
public class Wellcome {
  
    @GetMapping
    public String wellcome() {
        return "Welcome to AppCache Infinity API!";
    }
}
