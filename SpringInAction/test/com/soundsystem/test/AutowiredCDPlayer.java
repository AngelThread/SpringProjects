package com.soundsystem.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soundsystem.CDPlayerConfig;
import com.soundsystem.autowiring.CDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class AutowiredCDPlayer {
	
	@Autowired
	private CDPlayer mediaPlayer;
	
	 @Test
	 public void cdShouldNotBeNull(){
		 assertNotNull(mediaPlayer);
	 }

}
