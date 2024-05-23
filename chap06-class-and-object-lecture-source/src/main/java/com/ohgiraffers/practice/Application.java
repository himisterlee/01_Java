package com.ohgiraffers.practice;public class Application {
    public static void main(String[] args) {

        // 문제 1
        Max max = new Max();

        max.name = "Max";
        max.age = 5;
        max.breed = "골든 리트리버";

        System.out.println("문제 1 : 이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.");
        System.out.println("정답 : 강아지의 이름은 " + max.name + "이고 나이는 " + max.age + "살 이며 종은 " + max.breed + "종 입니다.");
        System.out.println();

        // 문제 2
        EffectiveJava effectiveJava = new EffectiveJava();

        effectiveJava.bookCreatedBy = "Joshua Bloch";
        effectiveJava.bookName = "Effective Java";
        effectiveJava.bookPage = 416;
        effectiveJava.bookCover = "하드커버";

        System.out.println("문제 2 : Joshua Bloch가 쓴 Effective Java 책을 만들고, 416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.");
        System.out.println("정답 : " + effectiveJava.bookName + "는 " + effectiveJava.bookCreatedBy + "가 만들었으며 " + "총 " + effectiveJava.bookPage + "페이지 이고 " + effectiveJava.bookCover + "입니다.");


    }
}
