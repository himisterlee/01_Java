package com.ohgiraffers.section01.conditional;

public class Application {
    // 실험용 클래스
    public static void main(String[] args) {

        A_If aIf = new A_If();

        // aIf.testSimpleIfStatement(); // 단일 if 문
        // aIf.testDimpleIfStatement(); // 중첩 if 문

        B_IfElse bIfElse = new B_IfElse();

        // bIfElse.testSimpleIfElseStatement(); // 단일 if-else 문
        // bIfElse.testNestedIfElseStatement(); // 중첩 if-else 문

        C_IfElseif cIfElseIf = new C_IfElseif();
        // cIfElseIf.testSimpleIfElseIfStatement();
        // cIfElseIf.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();
        // dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchVendingMachine();

    }
}
