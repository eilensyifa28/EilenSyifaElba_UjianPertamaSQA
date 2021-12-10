package com.ujianpertama.sqa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ujianpertama.sqa.function.KonversiSuhu;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestingSuhu {
	
	KonversiSuhu suhu;

	@Before
	public void setUp() throws Exception {
		
		suhu = new KonversiSuhu();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/Suhu.csv")
	public void testKonversiSuhu(double f, double hasil) {
			
			assertEquals(hasil, suhu.KonversiSuhu(f), 0.0001);
			
	}

}
