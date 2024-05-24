package com.ohgiraffers.practice1;

public class Application {
    public static void main(String[] args) {

        /*
        * 문제 1
        * 이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고,
        * 객체를 생성하여 값을 출력하세요.
        * */

        Dog dog = new Dog("Max", 5, "골든 리트리버");
        System.out.println(dog.getInfo());
        System.out.println();


        /*
        * 문제 2
        * Joshua Bloch가 쓴 "Effective Java" 책을 만들고, 416페이지이며 하드커버인
        * 책 객체를 생성하여 값을 출력하세요.
        * */

        Book book = new Book("Joshua Bloch", "Effective Java", 416, "하드커버");
        System.out.println(book.getInfo());
        System.out.println();


        /*
        * 문제 3
        * Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을
        * 출력하세요.*/

        Car car = new Car("Tesla Model S", 2022, "전기차");
        System.out.println(car.getInfo());
        System.out.println();


    }
}
