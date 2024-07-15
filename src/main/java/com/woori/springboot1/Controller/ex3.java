package com.woori.springboot1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//서버에서 변수를 브라우저에 전달
@Controller
public class ex3 {
    @GetMapping("/ex3")
    public String ex3(Model model){
        //서버에서 브라우저에 변수를 전달
        //"변수명" 변수명을 문자열로 선언

        model.addAttribute("num1",30);
        model.addAttribute("num2",100);
        return "ex3";
    }
}
