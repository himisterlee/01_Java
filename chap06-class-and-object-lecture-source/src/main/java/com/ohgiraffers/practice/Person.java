package com.ohgiraffers.practice;

public class Person {

    // 속성 생성(나이, 이름, 성별, 결혼유무, 자녀 수)
    private int age;
    private String name;
    private char gender;
    private boolean marriage;
    private int children;
    private String text;

    // 나이 메소드
    public void setAge(int age) {
        this.age = age;
    }

    // 이름 메소드
    public void setName(String name) {
        this.name = name;
    }

    // 성별 메소드
    public void setGender(char gender) {
        this.gender = gender;
    }

    // 결혼유무 메소드
    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
        if(marriage) {
        this.text = "했고";
        } else {
            this.text = "하지 않았고";
        }

    }

    // 자녀 수 메소드
    public void setChildren(int children) {
        this.children = children;
    }

    // 정보 출력 메소드
    public String getInfo() {
        return this.name + "는 나이가 " + this.age + "살이고 성별은 " + this.gender +
                "자 입니다. 또한 결혼은 " + text + " 자녀는 " + this.children + "명 입니다.";
    }





}
