package com.learn.spring_modulith_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

class ModularityTests {

	static ApplicationModules modules = ApplicationModules.of(SpringModulithDemoApplication.class);

	// this test is to verify whether our current code comply with spring-modulith
	@Test
	void verifyModularStructure() {
		modules.verify();
	}

}
