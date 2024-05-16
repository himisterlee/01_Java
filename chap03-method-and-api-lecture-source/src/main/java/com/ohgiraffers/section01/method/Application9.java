package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        /* 다른 클래스에서 작성한 메소드 호출 */

        int first = 100;
        int second = 50;

        /*
        * non-static 메서드의 사용방법
        *
        * 사용준비
        * [클래스명] [사용할이름] = new [클래스명]();
        *
        * 사용
        * [사용할이름].[메소드명]();
        *
        * */

        Calculator calc = new Calculator();
        int min = calc.nonStaticMinNumber0f(first, second);

        System.out.println("두 수 중 최소 값은 : " + min);

        /*
        * static 메서드의 사용방법
        *
        * [클래스명].[메소드명]();
        * */

        int max = Calculator.staticMaxNumber0f(first, second);

        System.out.println("두 수 중 최대 값은 : " + max);

        // int max2 = calc.staticMaxNumber0f(first, second);
        // System.out.println("두 수 중 최대 값은 : " + max2);

        // non-static 사용방법처럼 사용은 가능하지만 권장하지 않음

    }
}
