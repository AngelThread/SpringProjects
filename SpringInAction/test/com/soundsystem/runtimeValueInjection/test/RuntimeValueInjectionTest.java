package com.soundsystem.runtimeValueInjection.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soundsystem.runtimeValueInjection.BlankDisc;
import com.soundsystem.runtimeValueInjection.ExpressiveConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ExpressiveConfig.class)
public class RuntimeValueInjectionTest {

	@Autowired
	BlankDisc blankDisc;
	
	@Test
	public void testRuntimeInjection(){
		assertEquals("The Beatles", blankDisc.getArtist());
		System.out.println(blankDisc.getRelaseYear());
		
	}
}
