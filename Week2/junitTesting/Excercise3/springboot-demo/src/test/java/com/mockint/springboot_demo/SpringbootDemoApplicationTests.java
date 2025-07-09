package com.mockint.springboot_demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemoApplicationTests {

	@Test
 public void contextLoads() {
		Repositiry mockRepository = mock(Repositiry.class);
		when(mockRepository.getData()).thenReturn("Mock Data");
		Service service = new Service(mockRepository);
		String result = service.processData();
		assertEquals("Processed Mock Data" , result);
		
	}

}
