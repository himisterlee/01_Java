package com.ohgiraffers.practice;

public class Application {
    public static void main(String[] args) {

        // 문제 1
        Dog dog = new Dog();

        dog.setName("Max");
        dog.setAge(5);
        dog.setBreed("골든 리트리버");

        System.out.println("문제 1 : 이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.");
        System.out.println(dog.getInfo());

        Dog dog1 = new Dog();

        dog1.setName("멍무");
        dog1.setAge(10);
        dog1.setBreed("푸들");
        System.out.println(dog1.getInfo());
        System.out.println();


        // 문제 2
        Book book1 = new Book();

        book1.setBookName("Effective Java");
        book1.setBookCreatedBy("Joshua Bloch");
        book1.setPage(416);
        book1.setBookCover("하드커버");

        System.out.println("문제 2 : Joshua Bloch가 쓴 Effective Java 책을 만들고, 416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.");
        System.out.println(book1.getInfo());
        System.out.println();


        // 문제 3
        Car car = new Car();

        car.setCarModel("Tesla Model S");
        car.setModelYear(2022);
        car.setEngine("전기차");

        System.out.println("문제 3 : Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을 출력하세요.");
        System.out.println(car.getInfo());
        System.out.println();

        // 문제 4
        Person person = new Person();

        person.setAge(30);
        person.setName("James");
        person.setGender('남');
        person.setMarriage(true);
        person.setChildren(3);

        System.out.println("문제 4 : 나이가 30살이고 이름이 James인 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다. 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.");
        System.out.println(person.getInfo());
        System.out.println();

        // 문제 5
        Notebook notebook = new Notebook();

        notebook.setBrand("Dell");
        notebook.setModelName("XPS 13");
        notebook.setRam(16);
        notebook.setSsd(512);

        System.out.println("문제 5 : Dell 브랜드의 XPS 13 모델이고, 16GB RAM과 512GB SSD를 가진 노트북을 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.");
        System.out.println(notebook.getInfo());

    }
}
