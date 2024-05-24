package com.ohgiraffers.practice1;

public class Car {

    // 속성(모델명, 연식, 엔진)
    private String modelName;
    private int carYear;
    private String engine;

    // 생성자 메소드
    public Car(String modelName, int carYear, String engine) {
        this.modelName = modelName;
        this.carYear = carYear;
        this.engine = engine;
    }

    // 정보출력 메소드
    public String getInfo() {
        return "자동차의 모델명은 " + this.modelName + " 이고 연식은 " + this.carYear + "년식 이며 엔진종류는 "
                + this.engine + " 입니다.";
    }
}
