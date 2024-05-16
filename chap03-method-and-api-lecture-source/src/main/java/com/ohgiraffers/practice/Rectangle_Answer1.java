package com.ohgiraffers.practice;

public class Rectangle_Answer1 {
    public static void main(String[] args) {

        // static

        double wid = 3.82;
        double len = 8.65;

        double area1 = Rectangle.getArea1(wid, len);
        System.out.println("직사각형의 면적은 = " + area1);

        double circ1 = Rectangle.getCircumference1(wid, len);
        System.out.println("직사각형의 둘레는 = " + circ1);

    }
}
