package com.soundsystem.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soundsystem.depended.DependedCDPlayer;
import com.soundsystem.depended.SgtPeppersForDependency;
import com.soundsystem.depended.SoundSystemConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)

public class DependedCDPlayerTest {
	@Autowired
	private DependedCDPlayer mediaPlayer;
	@Autowired
	private SgtPeppersForDependency sgtPeppersForDependency;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(mediaPlayer);

	}

	@Test
	public void sgtPeppersForDependencyShouldNotBeNull() {
		assertNotNull(sgtPeppersForDependency);

	}
}
