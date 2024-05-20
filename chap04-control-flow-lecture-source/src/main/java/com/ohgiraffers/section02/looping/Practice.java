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
작동순서
int i = 1; i <= 5; 판단해서 true 인지 확인
true 면 밑에 전체 코드가 실행됨
그러면서 * 이 찍히고 한줄 띄어짐
안쪽 for 문이 실행됨
j <= i; 가 현재 1 <= 1; 로 true 가 되어 *이 찍힘
현재
*
*
인상태
증감식 실행됨(j++) j가 2가 되면서 수식이 맞지않아 false 나옴
바깥으로 빠져나와서 바깥 for 문의 증감식이 실행됨(i++)
true 가 나오면서 아래 코드들이 모두 실행됨
*
**
요런 상태가 됨

반복

j가 1이고 i가 1이므로 서로 같음 = true 가 되어 *이 한개 찍힘
그리고 안쪽 for문에서 증감식으로 넘어감(j++)
j가 2가됨
j <= i; 식이 2 <= 1; 로 대입되고 false 가 됨
for문에서 빠져나와 System.out.println(); 공백명령어가 진행됨
그러면 *인 상태에서 한줄 내려감

그리고 다시 바깥 for문에서 증감식이 실행됨(i++)
i 가 2가 되었고 i <= 5; 식에서 2 <= 5; 로 대입되어 true 나옴
안쪽 for 문이 실행됨
j가 2고 i도 2인 상태이므로 true 가 되어 *이 찍힘
현재
*
*    인상태
증감식으로 넘어가서(j++) j가 3이됨
3 <= 2 인 상태이므로 false 가 됨
 */
 */
 */


 */
 */
 */
 */
 */
 */
 */
 */
 */
 */
 */
 */
 */


*
**
***
