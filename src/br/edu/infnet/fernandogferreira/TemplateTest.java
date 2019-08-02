package br.edu.infnet.fernandogferreira;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TemplateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTemplate() {
		Template template = new Template();
		assertNotNull(template);
	}
	
	@Test
	public void testTemplateReturnString() {
		String templateStr = "Essa e uma string";
		Template template = new Template(templateStr);
		assertNotNull(template);
		String retString = template.render();
		assertNotNull(retString);
		assertEquals(retString, templateStr);
	}


}
