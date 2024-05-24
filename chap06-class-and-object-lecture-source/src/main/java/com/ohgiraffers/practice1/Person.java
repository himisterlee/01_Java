package com.ohgiraffers.practice1;

public class Person {

    // 속성(나이, 이름, 성별, 결혼여부, 자녀수)
    private int age;
    private String name;
    private char gender;
    private boolean marriage;
    private String text;

    // 생성자 메소드
    public Person(int age, String name, char gender, boolean marriage) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.marriage = marriage;
        if(marriage) {
            text = "했고";
        } else {
            text = "하지 않았고";
        }
    }


}
