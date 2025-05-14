package com.PES1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleAPI{
    @GetMapping("/register")
    public String getregister(){
        return "This is PES register Page !";
    }
}