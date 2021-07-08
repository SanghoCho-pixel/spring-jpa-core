package jpabook.jpashop.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderTest {

    @Autowired
    private EntityManager em;

    @Test
    @Commit
    @Transactional
    void test() {
        Order order = new Order();
        Member member = new Member();

        member.getOrders().add(order);
        order.setMember(member);



        em.persist(member);
        em.persist(order);


        em.flush();
        em.clear();

        Member member1 = em.find(Member.class, 1L);
        List<Order> orders = member1.getOrders();
        System.out.println("ord = " + orders.size());
    }
}