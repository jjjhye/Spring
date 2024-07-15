package com.woori.springboot1.DTO;

public class ex4DTO {
    private Integer num1;
    private Integer num2;
    private Integer sum;

    public ex4DTO(Integer num1, Integer num2, Integer sum) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "ex4DTO{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", sum=" + sum +
                '}';
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public Integer getSum() {
        return sum;
    }
    //마우스오른쪽 버튼 -> 생성(Alt-Insert) -> 생성할 메소드 지정 -> 적용할 변수를 지정

}
