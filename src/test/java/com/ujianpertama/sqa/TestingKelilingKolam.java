package com.ujianpertama.sqa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ujianpertama.sqa.function.FormulaKelilingKolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestingKelilingKolam {

	FormulaKelilingKolam keliling;
	
	@Before
	public void setUp() throws Exception {
		
		keliling = new FormulaKelilingKolam();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/KelilingKolam.csv")
	public void testFormulaKelilingKolam(double panjang, double lebar, double tinggi, double hasil) {
		
		assertEquals(hasil, keliling.FormulaKelilingKolam(panjang, lebar, tinggi), 0.0001);
		
	} 

/*	@Test
	public void testFormulaKelilingKolam() {
		
		assertEquals(82.0f, keliling.FormulaKelilingKolam(4.0f), keliling.FormulaKelilingKolam(5.5f, 12.0f, 3.0f) 0.00001);
		
	} */
}
