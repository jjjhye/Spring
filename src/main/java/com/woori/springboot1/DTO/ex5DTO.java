package com.woori.springboot1.DTO;


import lombok.*;

//lombok이 반드시 설치되어 있어야한다
//인텔리제이는 기본 제공
//어노테이션을 이용해서 사용자가 작성할 메소드를 자동화 생성 대체
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ex5DTO {
    private Integer num1;
    private Integer num2;
    private Integer sum;
}
