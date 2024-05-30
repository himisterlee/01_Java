package com.ohgiraffers.api.string;

public class StringProcess {
    public String preChar(String helloWorld) {

        // 1. 매개변수 전달이 잘되는지 확인.
        System.out.println("helloWorld = " + helloWorld);

        char firstChar = helloWorld.charAt(0);
        System.out.println("firstChar = " + firstChar);

        // 첫 글자 대문자로 바꾸기
        // 1) 문자 -> 문자열로 변환
        String firstStr = Character.valueOf(firstChar).toString();
        //String firstStr2 = Character.toString(firstChar);
        // 2) UpperCase로 대문자로 바꾸기
        firstStr = firstStr.toUpperCase(); // H

        System.out.println("대문자로 바꾼 " + firstStr);

        // 첫글자를 뺀 나머지 부분 subString 사용
        String remainStr = helloWorld.substring(1); // ello world
        System.out.println("substring한 결과 : " + remainStr);

        return firstStr + remainStr;
    }

    public int charSu(String str, char ch) {

        System.out.println("매개변수로 넘어온 문자열 " + str);
        System.out.println("매개변수로 넘어온 문자 " + ch);

        // str = application car cable
        // ch = c
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if (ch == findChar) {
                count ++;
            }
        }

        return count;
    }
}
