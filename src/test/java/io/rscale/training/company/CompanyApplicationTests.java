package io.rscale.training.company;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyApplicationTests {

	@Test
	public void contextLoads() {
	       org.junit.Assert.assertTrue( new ArrayList().isEmpty() );
	}

}
