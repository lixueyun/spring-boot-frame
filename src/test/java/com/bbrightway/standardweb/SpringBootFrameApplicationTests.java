package com.bbrightway.standardweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootFrameApplicationTests {

	@Test
	public void contextLoads() {
        System.out.println("master");
		System.out.println("test");
		System.out.println("test11");
	}

	@Test
	public void test(){
		System.out.println("test");
		System.out.println("master");
	}



	public static void main(String[] args) {
		Date date = new Date(118,8,1);
		LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		Date date1 = new Date();
		LocalDateTime localDateTime1 = LocalDateTime.ofInstant(date1.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime.isAfter(localDateTime1));
		System.out.println(date.after(date1));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(date1));
		System.out.println("test1");
	}
}
