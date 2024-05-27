package com.ohgiraffers.section08.initblock;

public class Application {
    public static void main(String[] args) {

        /*
        * */


        // 인스턴스 생성
        Product product = new Product();

        // 자료형별 기본값으로 초기화된 내용 확인
        // System.out.println(product.getInfomation());

        // 명시적 초기화로 필드 초기화
        //System.out.println(product.getInformation());

        // 초기화블럭으로 필드 초기화
        //System.out.println(product.getInformation());

        // 매개변수 있는 생성자를 이용한 초기화 학인
        Product product = new Product("대륙폰", 30000, "샤오미");
        System.out.println(product.getInformation());

        /*
        * 초기화의 순서
        * 인스턴스 변수 : 기본값 -> 명시적초기값 -> 인스턴스초기화블럭 -> 생성자
        * 클래스 변수 : 기본값 -> 명시적초기값 -> 정적초기화블럭 -> 인스턴스초기화블럭 -> 생성자
        * */
    }
}
