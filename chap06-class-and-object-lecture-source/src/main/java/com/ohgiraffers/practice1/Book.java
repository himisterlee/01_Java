package com.ohgiraffers.practice1;

public class Book {

    // 속성(저자, 책이름, 페이지수, 커버종류)
    private String bookCreatedBy;
    private String bookName;
    private int page;
    private String cover;


    // 생성자 메소드
    public Book(String bookCreatedBy, String bookName, int page, String cover) {
        this.bookCreatedBy = bookCreatedBy;
        this.bookName = bookName;
        this.page = page;
        this.cover = cover;
    }

    // 정보호출 메소드
    public String getInfo() {
        return "이 책의 이름은 " + this.bookName + " 이고 저자는 " + this.bookCreatedBy + " 이며, 페이지 수는 " +
                this.page + " 이고 커버종류는 " + this.cover + " 입니다.";
    }


}
