package com.ohgiraffers.section02.uses;

public class MemberRegister {

    // 서비스라는 클래스에서 정보를 받아오고, Register라는 클래스에서 받은 정보를 처리하겠다,

    // 등록
    public void regist(Member[] members) {

        System.out.println("회원을 등록합니다.");

        // 실제로 저장되지는 않았고, repository의 메서드를 통해
        // repository에 저장할 예정.

        // 향상된 for 문
        for(Member member : members) {
            System.out.println(member.getName() + "님을 회원 등록을 하겠습니다.");
        }
        // members란 배열안에 들어있는 Member들을 하나씩 꺼내와서 모두 한번씩 반복해주는 for문

        // 일반 for 문
//        for(int i =0; i < members.length; i++) {
//            System.out.println(members[i].getName() + "님을 회원 등록을 하겠습니다.");
//        }

        if(MemberRepository.store(members)){
            System.out.println("총" + members.length + "명의 회원 등록에 성공했습니다.");
        }

    }
}
