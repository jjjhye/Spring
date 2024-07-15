package com.woori.springboot1.Controller;

import com.woori.springboot1.DTO.ex4DTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ex4 {
    @GetMapping("/ex4")
    public String ex4() {
        return "ex4";
    }
    //HTML에서 여러게의 변수를 DTO로 그룹으로 받을 때
    //보내는 변수명과 DTO내에 변수명은 동일해야한다(DTO는 RequestParam사용x)
    //부족하거나 남는 변수는 자동으로 무시처리
    @PostMapping("/ex4")
    public String ex4(ex4DTO data, Model model) {
        //ex4에서 num1과 num2를 받아서 합을 구해서 result에 전달
        Integer num1 = data.getNum1();//DTO에 저장된 변수는 getter메소드로 불러오기
        Integer num2 = data.getNum2();
        Integer sum = num1 + num2;
        data.setSum(sum);//DTO에 변수에 값을 저장할 때는 setter메소드로 저장하기
        model.addAttribute("data", data);//일반변수처럼 DTO를 전달한다
        return "result";
    }
}
