package com.ohgiraffers.practice;

public class Dog {

    // 속성을 추출해낸다. (강아지 -> 이름, 나이, 종)
    private String name;
    private int age;
    private String breed;

    // 이름 설정하는 메소드
    public void setName(String name) {
        this.name = name;
    }

    // 나이 설정하는 메소드
    public void setAge(int age) {

        if(age > 0 ) {
            this.age = age;
        } else {
            this.age = Math.abs(age); // 절대값
        }
    }

    // 종 설정하는 메소드
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getInfo() {
        return "강아지의 이름은 " + this.name + "이고, 나이는 " + this.age + "이며 종은 " + this.breed + "입니다.";
    }
}
