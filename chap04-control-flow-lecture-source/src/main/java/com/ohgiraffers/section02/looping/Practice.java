package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Practice {

    public void star() {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
 * 작동순서
 * num 이 5일경우
 * 1 <= 5; true 가 되므로 안쪽 for 문으로 넘어감
 * 1 <= 1 도 true 가 되므로 *이 한개 찍힘
 * 증감식인 j++ 가 실행되므로 j는 2가되고 2 <= 1 인 상태가 되므로 false 가 되면서 안쪽 for 문을 빠져나와
 * 마지막줄에 있는 줄바꿈을 실행하면서
 * *
 * 요런 상태가 됨
 * 다시 바깥 for 문 중 증감식이 실행되면서 i 가 2가되고 true 가 되면서 안쪽 for 문으로 넘어감
 * 다시 int j = 1 로 초기화되어 1 <= 2 인 상태가 되면서 *이 한개 찍힘
 * j++증감식이 실행되며 j가 2가되고 2 <= 2 인 상태로 한번 더 *이 찍힘
 *
 * *
 * **
 *
 * 다시 증감식인 j++ 가 실행되면서 j가 3이되고 3 <= 2 false 인 상태가 되어 for 문을 빠져나와
 * 마지막줄에 있는 줄바꿈을 실행한다.
 *
 * *
 * **
 * 현재 요런상태
 *
 * 이런식으로 반복이 되면서 5개까지 진행이 되고 최종적으로는
 * *
 * **
 * ***
 * ****
 * *****
 * 요런 상태가 됨
 * */