package com.ohgiraffers.practice;

public class Car {

    // 속성 추출(모델명, 연식, 엔진)
    private String carModel;
    private int modelYear;
    private String engine;


    // 모델명 생성 메소드
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // 연식 생성 메소드
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    // 엔진 생성 메소드
    public void setEngine(String engine) {
        this.engine = engine;
    }

    // 정보출력 메소드
    public String getInfo() {
        return "자동차의 모델명은 " + this.carModel + " 이고 연식은 " + this.modelYear + "년식 이며 엔진종류는 "
            + this.engine + " 입니다.";
    }

}
