package com.ohgiraffers.practice1;

public class Dog {

    // 생성자로 객체만들기

    // 속성(이름, 나이, 종)
    private String name;
    private int age;
    private String breed;


    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getInfo() {
        return "강아지의 이름은 " + this.name + " 이고, 나이는 " + this.age + "살 이며 종은 " + this.breed + " 입니다.";
    }

}
