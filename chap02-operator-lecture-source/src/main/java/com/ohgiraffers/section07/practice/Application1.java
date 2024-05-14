package com.ohgiraffers.section07.practice;

public class Application1 {
    public static void main(String[] args) {

        System.out.println("산술 연산자");
        System.out.println();
        System.out.println("1. 변수 a가 15이고, b가 4일 때, a / b의 결과를 구하세요.");
        int a = 15;
        int b = 4;
        System.out.println("1번 답 : " + "a / b = " + (a / b));
        System.out.println();

        System.out.println("2. 두 수 8과 3에 대해 나눈 나머지 값의 연산을 수행하는 코드를 작성하세요.");
        System.out.println("2번 답 : " + "8 % 3 = " + (8 % 3));
        System.out.println();

        System.out.println("3. 5 * 2 - 3 을 계산하고 결과를 출력하는 코드를 작성하세요.");
        System.out.println("3번 답 : " + "5 * 2 - 3 = " + (5 * 2 - 3));
        System.out.println();

        System.out.println("복합 대입 연산자");
        System.out.println();
        System.out.println("1. 변수 x 가 10일 때, x += 5의 결과는 얼마인가요?");
        int x = 10;
        System.out.println("1번 답 : " + " x += 5 = " + (x += 5));
        System.out.println();

        System.out.println("2. 변수 y가 20일 때, y /= 4의 결과를 구하세요.");
        int y = 20;
        System.out.println("2번 답 : " + " y /= 4 = " + (y /= 4));
        System.out.println();

        System.out.println("3. 변수 z가 8이고, z %= 3을 수행한 후의 z의 값을 구하세요.");
        int z = 8;
        System.out.println("3번 답 : " + " z %= 3 = " + (z %= 3));
        System.out.println();

        System.out.println("증감 연산자");
        System.out.println();
        System.out.println("1. 변수 i가 0일 때, i++ 후의 i의 값을 출력하세요.");
        int i = 0;
        i++;
        System.out.println("1번 답 : " + " i++ = " + (i));
        System.out.println();

        System.out.println("2. int j = 10; 선언 후 --j의 결과를 출력하세요.");
        int j = 10;
        --j;
        System.out.println("2번 답 : " + " --j = " + (j));
        System.out.println();

        System.out.println("3. int k = 5; 선언 후 k값을 증가시키고, 증가된 값을 출력하는 코드를 작성하세요.");
        int k = 5;
        k++;
        System.out.println("3번 답 : " + " k++ = " + (k));
        System.out.println();

        System.out.println("비교 연산자");
        System.out.println();
        System.out.println("1. 두 변수 num1 = 10, num2 = 20이 같은지 비교하는 코드를 작성하세요.");
        int num1 = 10;
        int num2 = 20;
        System.out.println("1번 답 : " + " num1 == num2 = " + (num1 == num2));
        System.out.println();

        System.out.println("2. 15가 10보다 큰지 확인하는 Java 코드를 작성하세요.");
        System.out.println("2번 답 : " + " 15 > 10 = " + (15 > 10));
        System.out.println();

        System.out.println("3. 변수 age가 18 이상인지 확인하는 조건문을 작성하세요.");
        int age = 38;
        System.out.println("3번 답 : " + " age > 18 = " + (age > 18));
        System.out.println();

        System.out.println("논리 연산자");
        System.out.println();
        System.out.println("1. 변수 c = true, d = false 일 때, 둘다 참이어야 참을 반환하는 조건문을 작성하세요.");
        boolean c = true;
        boolean d = false;
        System.out.println("1번 답 : " + "c && d = " + (c && d));
        System.out.println();

        System.out.println("2. int age = 20; 이 18 이상이면서 65 미만인지 확인하는 코드를 작성하세요.");
        System.out.println("2번 답 : " + "age > 18 && age < 65 = " + (age > 18 && age < 65));
        System.out.println();

        System.out.println("3. 변수 x = 10, y = 20 일 때, x가 10이 아니거나 y가 25 이상인지 확인하는 코드를 작성하세요.");

        System.out.println("3번 답 : " + " x != 10 || y > 25 = " + (x != 10 || y > 25));




































    }
}
