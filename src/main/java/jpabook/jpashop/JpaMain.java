package jpabook.jpashop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaBasicApplication {

    @Autowired
    private MemberRepository memberRepository; // ✅ Spring Data JPA 사용

    public static void main(String[] args) {
        SpringApplication.run(JpaBasicApplication.class, args);
    }




}
