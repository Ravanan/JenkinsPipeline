package com.ravan.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class jenkinsCalcTest {

	@Test
	public void addtest() {
		JenkinsCalc Mycalc = new JenkinsCalc();
		assertEquals(10, Mycalc.add(5, 5) );
	}

}
