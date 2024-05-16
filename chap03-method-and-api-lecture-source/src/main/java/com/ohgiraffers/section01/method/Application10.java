package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 5;

        /* Calculator Class에
        더하기, 빼기, 곱하기, 나누기, 나머지
        이 각각을 수행할 수 있는 메서드를 만들고
        Application10의 main 메서드에 출력하라.

        (더하기, 빼기, 곱하기, 나누기 => non-static
        나머지 => static)

         */


        // 더하기
        Calculator calc = new Calculator();
        int plus = calc.plus(num1, num2);
        System.out.println("두 수의 합은 = " + plus);

        // 빼기
        Calculator calc2 = new Calculator();
        int minus = calc2.minus(num1, num2);
        System.out.println("두 수를 빼면 = " + minus);

        // 곱하기
        Calculator calc3 = new Calculator();
        int multipli = calc3.multipli(num1, num2);
        System.out.println("두 수를 곱하면 = " + multipli);

        // 나누기
        Calculator calc4 = new Calculator();
        int divi = calc4.divi(num1, num2);
        System.out.println("두 수를 나누면 = " + divi);

        // 나머지
        int remain = Calculator.remain(num1, num2);
        System.out.println("두 수를 나눈 나머지 값 = " + remain);

    }
}
