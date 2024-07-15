package com.woori.springboot1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ex2 {
    @GetMapping("/num1")
    public String num1(@RequestParam(name="num1") String num1){
        System.out.println("브라우저로부터 받은 num1의 값 : "+num1);

        return "num1";
    }
    //보내는 변수와 받는 변수의 이르밍 다른 경우
    //@RequestParam(name="보내는 변수")받는 변수
    @GetMapping("/num2")
    public String num2(@RequestParam(name="num2") String num1){
        System.out.println("브라우저로부터 받은 num1의 값 : "+num1);

        return "num1";
    }

}
//보내는 변수명과 받는 변수명은 동일하게 지정(기본)