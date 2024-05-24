package com.ohgiraffers.practice;

public class Book {

    // 속성 추출
    private String bookCreatedBy;
    private String bookName;
    private int page;
    private String bookCover;

    // 저자 설정 메소드
    public void setBookCreatedBy(String bookCreatedBy) {
        this.bookCreatedBy = bookCreatedBy;
    }

    // 책이름 설정 메소드
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // 페이지수 설정 메소드
    public void setPage(int page) {
        this.page = page;
    }

    // 책 커버 설정 메소드
    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public String getInfo() {
        return "이 책의 이름은 " + this.bookName + " 이고 저자는 " + this.bookCreatedBy + " 이며, 페이지 수는 " +
                this.page + " 이고 커버종류는 " + this.bookCover + " 입니다.";
    }

}
