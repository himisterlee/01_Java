package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import java.util.Date;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 임포트
        *
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우, 패키지명을 포함한 풀 클래스 이름을 사용해야하지만
        * 너무길다.
        *
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
        * 예) 최상단에 import com.ohgiraffers.section01.method.Calculator; 라고 입력하면 적용됨
        * (자동으로 생성설정이 되어있으면 자동 생성됨)
        *
        * */

        // non-static 메서드의 경우
        Calculator calc = new Calculator();
        int min = calc.nonStaticMinNumber0f(50,60);

        System.out.println("50과 60 중 더 작은 것은? " + min);

        // static 메서드의 경우
        int max = calc.staticMaxNumber0f(100,200);
        System.out.println("100과 200 중 더 큰 것은? " + max);

        int max2 = calc.staticMaxNumber0f(100,200);
        System.out.println("100과 200 중 더 큰 것은? " + max2);

        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());


    }
}
