package com.woori.springboot1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//사용목적 선언 : @Controller컨트롤러로 사용할 클래스로 선언
//public : 클래스 밖에서 호출해서 사용이 가능
//private : 클래스 내에서만 호출해서 사용이 가능
@Controller
public class ex1 {
    //브라우저와 A로 태그로 전달받을 경우 GetMapping을 사용
    @GetMapping("/ex1")//브라우저로부터 요청신호
    public String ex1(){
        return "ex1";//ex1.html로 이동
    }

    //Form으로 전달받을 경우 PostMapping을 사용
    @PostMapping("/ex2") //반드시 / 구분자가 포함되어야 한다.
    public String ex2(){

        return "ex2";
    }
}
