package com.bbrightway.standardweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootFrameApplicationTests {

	@Test
	public void contextLoads() {
        System.out.println("master");
		System.out.println("test");
	}

	@Test
	public void test(){
		System.out.println("test");
		System.out.println("master");
	}


}
