package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램
        * */

        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;

//        System.out.print("자바 점수를 입력해 주세요 : ");
//        scores[0] = sc.nextInt();
//        System.out.print("자바 점수를 입력해 주세요 : ");
//        scores[1] = sc.nextInt();
//        System.out.print("자바 점수를 입력해 주세요 : ");
//        scores[2] = sc.nextInt();
//        System.out.print("자바 점수를 입력해 주세요 : ");
//        scores[3] = sc.nextInt();
//        System.out.print("자바 점수를 입력해 주세요 : ");
//        scores[4] = sc.nextInt();

//        sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
//        avg = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / 5;

//        System.out.println("자바 점수의 합계는 " + sum + " 이고 " + "평균은 " + avg + " 입니다.");



        // 점수를 입력 받는다.
        // 입력받은 점수를 scores 배열에 저장
        for(int i = 0; i < scores.length; i++) {

            System.out.println((i + 1)+ "번째 학생의 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();
        }
        // 배열에 값들을 합계 -> int
        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        // 배열에 값들을 평균 -> 실수
        avg = (double)sum/scores.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);


    }
}
