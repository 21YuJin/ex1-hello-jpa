package jpabasic.ex1hellojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class JpaBasicApplication implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository; // ✅ Spring Data JPA 사용

    public static void main(String[] args) {
        SpringApplication.run(JpaBasicApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {
        // ✅ Spring Data JPA를 사용한 데이터 저장
        Member member = new Member();
        member.setId(1L);
        member.setName("helloA");
        memberRepository.save(member); // ✅ JPA를 통해 DB에 저장

        // ✅ JPQL을 사용한 전체 멤버 조회
        List<Member> members = memberRepository.findAll();
        for (Member m : members) {
            System.out.println("회원 이름: " + m.getName());
        }
    }
}
