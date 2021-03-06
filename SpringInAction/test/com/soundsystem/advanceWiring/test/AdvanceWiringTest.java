package com.soundsystem.advanceWiring.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soundsystem.advance.wiring.CDPlayerConfigAdvance;
import com.soundsystem.advance.wiring.MagicBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfigAdvance.class)

public class AdvanceWiringTest {
	@Autowired
	private MagicBean magicBean;
	@Test
	public void testNotNullMagic() {

		assertNotNull(magicBean);
	}

}
