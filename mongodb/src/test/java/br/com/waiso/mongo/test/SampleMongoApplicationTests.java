package br.com.waiso.mongo.test;

import static org.junit.Assert.assertTrue;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.waiso.mongo.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@IntegrationTest
public class SampleMongoApplicationTests {

	@ClassRule
	public static OutputCapture outputCapture = new OutputCapture();

	@Test
	public void testDefaultSettings() throws Exception {
		String output = SampleMongoApplicationTests.outputCapture.toString();
		assertTrue("Wrong output: " + output, output.contains("firstName='Alice', lastName='Smith'"));
	}

}