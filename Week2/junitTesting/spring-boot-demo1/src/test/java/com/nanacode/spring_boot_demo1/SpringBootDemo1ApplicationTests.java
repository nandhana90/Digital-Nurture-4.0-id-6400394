package com.nanacode.spring_boot_demo1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemo1ApplicationTests {

	@Test
	void contextLoads() {
	 Myservices service = new Myservices();
	 assertEquals(5,service.add(2, 3));
	}

}
