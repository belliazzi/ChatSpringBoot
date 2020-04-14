package com.dbelliazzi.test;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dbelliazzi.chat.WebsocketDemoApplication;
import com.dbelliazzi.chat.controller.ChatController;
/**
 * test sul Controller 
 * @author Damiano
 *
 */

@SpringBootTest(classes = WebsocketDemoApplication.class)
public class ControllerTests {
	@Autowired
	private ChatController controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
