package com.woori.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//스프링부트를 이용한 응용프로그램
//@ : 어노테이션, 기존에 존재하는 기능이나 자동으로 생성하는 작업(주입)
//클래스위에 어노테이션은 선언을 위한 어노테이션
@SpringBootApplication
public class Springboot1Application {
    //C언어 이후 언어에서 프로그랜의 시작하는 메소드가 main
    public static void main(String[] args) {
        //스프링부트 구동
        SpringApplication.run(Springboot1Application.class, args);
    }

}
//상단에 실행/디벼깅을 구동할 대 반드시 main이 있는 클래스를 지정
//Application이 표기죄면 아무곳에서나 실행하면 스프링부트가 구동된다
//현재 파일이 표기되면 반드시 main이 있는 파일로 이동해서 스프링부트를 구동한다
//실행/디버깅은 반드시 실행 상태를 확인하고, 사용하지 않을 때는 종료후 사용