package com.capgemini.assignment3.oops.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.assignment3.oops.Television;

class TelevisionTest {

	Television tv;

	@BeforeEach
	void setup() {
		tv = new Television(true, 48, 24);
	}

	@Test
	void testIncreaseVolume() {
		assertEquals(49, tv.increaseVolume());
	}

	@Test
	void testDecreaseVolume() {
		assertEquals(47, tv.decreaseVolume());
	}

	@Test
	void teststateOfTv() {
		assertEquals(false, tv.stateOfTv());
	}

	@Test
	void channelChange() {
		assertEquals(45, tv.channelChange(45));
	}

	@AfterEach
	void tearDown() {
		tv = null;
	}

}
