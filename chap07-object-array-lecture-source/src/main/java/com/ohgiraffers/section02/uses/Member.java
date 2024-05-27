package com.ohgiraffers.section02.uses;

public class Member {

    // 멤버의 정보값
    private int num;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    // 생성자 (생성자로만 등록할 경우 위에 멤버정보값이 private 으로 되어있어서 다른 class 에서는 초기화가 불가하기에 설정자도 같이 생성해주면 public 으로 시작하기 때문에
    // 내용이 같아도 다른 class 에서 값을 변경할 수 있다.)
    public Member(int num, String id, String pwd, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 접근자
    public int getNum() {
        return num;
    }

    // 설정자
    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // 필드값 조회용 메서드
    public String getInformation() {
        return "Member [num = " + num + ", id = " + id + ", pwd = " +
                pwd + ", name = " + name + ", age = " + age + ", gender = "
                + gender + "]";
    }


}
