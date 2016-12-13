package com.soundsystem.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soundsystem.CDPlayerConfig;
import com.soundsystem.CompactDisc;
import com.soundsystem.SgtPeppers;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

	@Test
	public void cdShouldNotBeNull() {
		CompactDisc cd = new SgtPeppers();
		assertNotNull(cd);
	}

}
