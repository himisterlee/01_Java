package com.ohgiraffers.practice;

public class Notebook {

    // 속성 (브랜드, 모델명, RAM 용량, SSD 용량)
    private String brand;
    private String modelName;
    private int ram;
    private int ssd;


    // 브랜드 메소드
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 모델명 메소드
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // RAM 용량 메소드
    public void setRam(int ram) {
        this.ram = ram;
    }

    // SSD 용량 메소드
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    // 정보 출력 메소드
    public String getInfo() {
        return "이 노트북의 브랜드는 " + this.brand + " 브랜드 이고 모델명은 " + this.modelName + " 입니다. 사양은 RAM "
                + this.ram + "GB 이고 하드디스크 용량은 SSD " + this.ssd + "GB 입니다.";
    }
}
