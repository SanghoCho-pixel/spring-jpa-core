package jpabook.jpashop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
class JpashopApplicationTests {

	@Autowired
	private EntityManager em;

	@Test
	void contextLoads() {
	}

}
