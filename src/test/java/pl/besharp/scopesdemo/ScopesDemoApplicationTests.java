package pl.besharp.scopesdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScopesDemoApplicationTests {

	@Autowired
	private DefaultService defaultService;

	@Autowired
	private DefaultService defaultService1;

	@Test
	public void contextLoads() throws InterruptedException {
		System.out.println();
		defaultService.call();
		defaultService1.call();
		Thread.sleep(1000);
	}

}
