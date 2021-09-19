package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;


class MessageBuilderTest {

	@Test
	void testGetMessageForValidName() {
		MessageBuilder messageBuilder= new MessageBuilder();
		assertEquals("Hello Priyanka",messageBuilder.getMessage("Priyanka"));
	}
	
	@Test
	void testGetMessageForInValidName() {
		MessageBuilder messageBuilder= new MessageBuilder();
		assertNotEquals("Hello Admin",messageBuilder.getMessage("Priyanka"));
	}
	
	@Test
	void testGetMessageForNull() {
		MessageBuilder messageBuilder= new MessageBuilder();
		assertEquals("Please provide a name!",messageBuilder.getMessage(null));
	}

}
