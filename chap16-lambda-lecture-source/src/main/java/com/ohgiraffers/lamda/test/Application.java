package com.ohgiraffers.lamda.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();

        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }
        /**
         * <pre>
         * @실습문제1
         * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
         * </pre>
         */
        private void test1() {
            System.out.println(LocalTime.now().withNano(0));
            System.out.println();

            // 방법 1 Runnable
            Runnable now = () -> {
                System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            };

            now.run();

            // 방법 2 Consumer
            Consumer<LocalTime> now2 = (time) -> {
                System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            };
            now2.accept(LocalTime.now());
        }

        Runnable runnable = () -> test1();

        private void test1_General() {
            //LocalTime.now() os 에 보이는 현재 시간을 반환해주는 기능
            LocalTime localTime = LocalTime.now();
            System.out.println(localTime);

            System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

            // 매개변수도 필요없음
            // 리턴도 필요없음
            // Runnable
            // Consumer
        }

        /**
         * <pre>
         * @실습문제2
         * 로또를 생성하는 람다식을 작성하세요.
         * 로또 -> 1~45 사이의 숫자가 6개 (중복 없이)
         * - 리턴타입 Set<Integer>
         * </pre>
         */
        private void test2() {
//            Set<Integer> set = new HashSet<>();
//
//
//            for(int i = 0; i < 6; i++) {
//                int num = (int) (Math.random() * 45) + 1;
//                set.add(num);
//                set.add(num);
//                set.add(num);
//                set.add(num);
//                set.add(num);
//                set.add(num);
//                System.out.print("lotto = " + "[" + num + "]");
//
//            }

            Supplier<Set<Integer>> lotto = () -> {
                Set<Integer> set = new TreeSet<>();
                while (set.size() < 6) {
                    set.add((int)(Math.random() * 45) + 1);
                }
                return set;
            };

            Set<Integer> lottoResult = lotto.get();

            System.out.println("lottoResult = " + lottoResult);

        }

        private void test2_General() {

            /*
            * Set 특징 : 중복저장이 허용되지 않음
            * TreeSet 특징 : 자동 정렬
            * 컬렉션 -> 컬렉션에서 다룰 수 있는 데이터는 기본적으로 객체만 가능 -> Integer를 사용한 이유
            * */
            Set<Integer> lotto = new TreeSet<>();

            // 숫자 6개
            int num = ((int)(Math.random() * 45) + 1);
            System.out.println(num);

            // 반복문
            while (lotto.size() < 6) {
                lotto.add((int)(Math.random() * 45) + 1);

                System.out.println("lotto = " + lotto);
            }
        }

        /**
         * <pre>
         * @실습문제3
         * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
         * 현재 1달러는 1350원이다.
         * ￦ 3000 =>  ＄ 2.3076923076923075
         * </pre>
         */
        private void test3() {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("환율을 계산할 원화를 입력해 주세요 : ");
//            int won = sc.nextInt();
//            int dollar = won / 1300;
//            System.out.println("\");

            Consumer<Integer> calc = won -> {
                double rate = 1300;
                double dollar = won / rate;
                System.out.println("￦" + won + " => ＄ " + dollar);
            };

            calc.accept(3000);
        }

        private void test3_General() {

            // 입력받을 값
            int won = 3000;

            // 환율
            double rate = 1300;

            // 달러로 환산
            double dollar = won / rate;

            // 출력
            System.out.println("￦" + won + " => ＄ " + dollar);
        }

        /**
         * <pre>
         * @실습문제4
         * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
         * </pre>
         */
        private void test4() {

            Function<Integer, Double> calc = won -> {
                double rate = 1300;
                return won / rate;
            };

            double dollar = calc.apply(3000);
            System.out.println(dollar);
        }

        /**
         * <pre>
         * @실습문제4 -1
         * 위 문제를 jdk가 제공하는 BiFunction 함수형인터페이스 형식에 맞게 변형하세요.
         * 원화, 환율을 입력받아 변환된 달러를 리턴하도록 만드세요
         * </pre>
         */

        private void test4_1() {

            BiFunction<Integer, Double, Double> biFun = (won, rate) -> {
                return won / rate;
            };
            double dollar = biFun.apply(3000, 1300.0);
            System.out.println("dollar = " + dollar);
        }


        /**
         * <pre>
         * @실습문제5
         * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
         * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
         * </pre>
         */
        private void test5() {
            List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");

            Predicate<String> isLengthZero = str -> str.trim().length() == 0;

            for (String str : strList) {
                System.out.println("[" + str + "]의 길이는 0입니까? " + isLengthZero.test(str));
            }

        }

        public void test5_General() {

            // List를 만드는 방법 1
            List<String> strList1 = new ArrayList<>();
            strList1.add("abc");
            strList1.add("");
            strList1.add("대한민국");
            strList1.add("   ");

            // List를 만드는 방법 2
            // Arrays.asList() : 나열된 값을 리스트로 만들어준다.
            // asList()로 만든 리스트의 경우, 컬렉션 프레임워크가 아닌 Arrays 클래스 내부의
            // static inner class로 만들어진다 -> 추가, 삭제 불가능 / 변경만 가능
            List<String> strlist2 = new ArrayList<>(Arrays.asList("abc", "", "대한민국", "   "));

            List<String> strAsListTest = Arrays.asList("1", "2");
            //strAsListTest.add("3"); // unsupportedOperationException 발생
            //strAsListTest.clear(); // unsupportedOperationException 발생


            // List를 만드는 방법 3
            // List.of() : 팩토리메소드, 나열된 값을 리스트로 만들어준다.
            // List.of()로 만든 리스트는 ImmutableCollections 객체의 내부클래스인 ListN 클래스로 List를 생성
            // -> 추가, 삭제 불가능 / 변경만 가능하다.
            List<String> strListOfTest = new ArrayList<>(List.of("1, 2"));
            //strListOfTest.add("3"); // unsupportedOperationException 발생
            //strListOfTest.clear();
            List<String> strList3 = new ArrayList<>(List.of("abc", "", "대한민국", "   "));

            /*
            * List.of(), Arrays.asList() -> 추가, 삭제 불가능하게 된 이유
            * 불변객체이어야 다른 컬렉션으로 변환이 용이하기 때문
            * */

            // 공백을 제외한 문자열의 길이가 0인지 판단
            for(String str : strList1) {
                // 문자열을 trim() -> 공백을 앞뒤로 다 지우는

                Boolean isLengthZero = str.trim().length() == 0;

                System.out.println("[" + str + "]의 길이는 0입니까? " + isLengthZero);
            }

        }
    }
