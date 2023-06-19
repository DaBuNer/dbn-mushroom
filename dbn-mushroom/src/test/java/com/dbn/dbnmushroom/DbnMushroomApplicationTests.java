package com.dbn.dbnmushroom;

import com.dbn.dbnmushroom.mapper.TestMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DbnMushroomApplicationTests {

	@Resource
	TestMapper testMapper;

	@Test
	void contextLoads() {
		System.out.println(testMapper.getMessage());
	}

}
