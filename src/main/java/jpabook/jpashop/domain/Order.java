package jpabasic.ex1hellojpa.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS") // DB에 "ORDER BY"기 예약어로 설정되어 있는 경우가 있어서
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}