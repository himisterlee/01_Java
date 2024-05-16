package com.ohgiraffers.practice;
import com.ohgiraffers.practice.Rectangle.*;

public class Rectangle_Answer {
    public static void main(String[] args) {

        // non-static

        double width = 3.82;
        double length = 8.65;

        Rectangle rc = new Rectangle();
        double area = rc.getArea(width, length);
        System.out.println("직사각형의 면적은 = " + area);

        Rectangle rc1 = new Rectangle();
        double circ = rc1.getCircumference(width, length);
        System.out.println("직사각형의 둘레는 = " + circ);





    }
}

//
