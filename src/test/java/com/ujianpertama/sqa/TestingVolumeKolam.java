package com.ujianpertama.sqa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ujianpertama.sqa.function.FormulaVolumeKolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class TestingVolumeKolam {

	FormulaVolumeKolam volume;
	
	@Before
	public void setUp() throws Exception {
		
		volume = new FormulaVolumeKolam();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/VolumeKolam.csv")
	public void testFormulaVolumeKolam(double panjang, double lebar, double tinggi, double hasil) {
		
		assertEquals(hasil, volume.FormulaVolumeKolam(panjang, lebar, tinggi), 0.0001);
		
	}
	

}
