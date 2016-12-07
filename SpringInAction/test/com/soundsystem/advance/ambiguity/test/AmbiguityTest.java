package com.soundsystem.advance.ambiguity.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soundsystem.advance.ambiguity.Cold;
import com.soundsystem.advance.ambiguity.Creamy;
import com.soundsystem.advance.ambiguity.Dessert;
import com.soundsystem.advance.ambiguity.DessertConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DessertConfig.class)

public class AmbiguityTest {
	@Autowired
	@Cold
	@Creamy	
	private Dessert  dessert;
	
	
	
	
	
	
	@Test
	public void testNotNullMagic() {
		assertNotNull(dessert);
	}
}
