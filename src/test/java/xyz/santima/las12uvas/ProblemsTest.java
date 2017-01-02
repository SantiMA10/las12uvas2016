package xyz.santima.las12uvas;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import xyz.santima.las12uvas.problems.P1_CociendoHuevos;
import xyz.santima.las12uvas.problems.P2_ContandoEnLaArena;
import xyz.santima.las12uvas.problems.P3_La13_14;
import xyz.santima.las12uvas.problems.P4_AburrimientoEnLasSobremesas;
import xyz.santima.las12uvas.problems.P5_LaFarsanteDeMaryPoppins;
import xyz.santima.las12uvas.problems.P6_CubosVisibles;

public class ProblemsTest {
	
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(out));
	}

	@Test
	public void test_p1() throws Exception {
		System.setIn(new ByteArrayInputStream("3 5\n5 5\n6 5\n0 0".getBytes()));
		P1_CociendoHuevos.main(null);
		assertEquals("10\n10\n20\n", out.toString());
	}
	
	@Test
	public void test_p2() throws Exception {
		System.setIn(new ByteArrayInputStream("1\n4\n6\n0".getBytes()));
		P2_ContandoEnLaArena.main(null);
		assertEquals("1\n1111\n111111\n", out.toString());
	}
	
	@Test
	public void test_p3() throws Exception {
		System.setIn(new ByteArrayInputStream("4\n12-13\n13-14\n15-14\n17-14".getBytes()));
		P3_La13_14.main(null);
		assertEquals("SI\nNO\nSI\nNO\n", out.toString());
	}
	
	@Test
	public void test_p4() throws Exception {
		System.setIn(new ByteArrayInputStream("3\n1\n0".getBytes()));
		P4_AburrimientoEnLasSobremesas.main(null);
		assertEquals("18\n3\n", out.toString());
	}
	
	@Test
	public void test_p5() throws Exception {
		System.setIn(new ByteArrayInputStream("2\nsupercalifragilisticoespialidoso\nMary".getBytes()));
		P5_LaFarsanteDeMaryPoppins.main(null);
		assertEquals("osodilaipseocitsiligarfilacrepus\nYram\n", out.toString());
	}
	
	@Test
	public void test_p6() throws Exception {
		System.setIn(new ByteArrayInputStream("4\n2\n3\n4\n10000\n".getBytes()));
		P6_CubosVisibles.main(null);
		assertEquals("8\n26\n56\n599880008\n", out.toString());
	}

}
