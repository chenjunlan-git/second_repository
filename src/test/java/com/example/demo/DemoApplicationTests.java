package com.example.demo;

import com.example.demo.modules.sys.util.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Test
	public void testUuid(){
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}
	@Test
	public void testDate(){
		Date time = new Date();
		System.out.println(time);
		Long dateTime = new Date().getTime();
		System.out.println(dateTime);
		Long SystemTime = System.currentTimeMillis();
		System.out.println(SystemTime);
		Date date =DateUtils.addDateMinutes(new Date(), 5);
		System.out.println(date);
	}


}
