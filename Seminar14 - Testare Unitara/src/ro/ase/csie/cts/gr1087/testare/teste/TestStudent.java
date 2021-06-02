package ro.ase.csie.cts.gr1087.testare.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.csie.cts.gr1087.testare.exceptii.ExceptieNote;
import ro.ase.csie.cts.gr1087.testare.exceptii.ExceptieNume;
import ro.ase.csie.cts.gr1087.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.gr1087.testare.modele.Student;
import ro.ase.csie.cts.gr1087.testare.teste.categorii.TesteImportante;

class TestStudent {

	// Test Fixture
	
	static Student student;
	static ArrayList<Integer> note;
	
	static String numeInitial = "Gigel";
	static int varstaInitiala =21;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(7);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		note.clear();
		note = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student(numeInitial, varstaInitiala, note);
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	@Ignore
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetVarstaValoriNormaleRight() throws ExceptieVarsta {
		//int varstaNoua = 22;
		int varstaNoua = Student.MIN_VARSTA+1;
		student.setVarsta(varstaNoua);
		assertEquals("Testare cu valori ok",varstaNoua, student.getVarsta());
		
	}
	
	
	@Test
	public void testSetNumeRight() {
		String numeNou = "Ionel";
		try {
			student.setNume(numeNou);
			assertEquals("Test cu valori corecte", numeNou, student.getNume());
		} catch (ExceptieNume e) {
			fail("Am primit exeptie pt valori normale.");
		}
	}
	
	
	@Test
	public void testSetVarstaErrorConditionsValoriNegative() {
		int varstaNoua = -100;
		try {
			student.setVarsta(varstaNoua);
			fail("Nu am primit exceptie pt varsta cu valori negative.");
		} catch (ExceptieVarsta e) {
			assertTrue(true);
		}
	}
	
	
	@Test//(expected = ExceptieVarsta.class)
	public void testSetVarstaErrorConditionsValoriMari() {
		int varstaNoua = Student.MAX_VARSTA+100;
		try {
			student.setVarsta(varstaNoua);
			fail("Nu am primit exceptie pt varsta cu valori mari.");
		} catch (ExceptieVarsta e) {
			assertTrue(true);
		}
	}
	
	@Category(TesteImportante.class)
	@Test
	public void getNotaMinimaOrderingSortateCrescator() throws ExceptieNote {
		int notaMinima = 4;
		ArrayList<Integer> noteSortate = new ArrayList<>();
		for(int i =0; i<5; i++){
			noteSortate.add(notaMinima+i);
		}
		student.setNote(noteSortate);
		
		int notaDeterminata = student.getNotaMinima();
		assertEquals("Test cu note sortate crescator.", notaMinima, notaDeterminata);
	}
	
	@Category(TesteImportante.class)
	@Test
	public void testGetNotaMinimaCardinalityZero() throws ExceptieNote {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(Student.MAX_NOTA);
		student.setNote(note);
		
		int notaMinima = Student.MAX_NOTA;
		int notaMinimaCalculata = student.getNotaMinima();
		
		assertEquals("Test fara note", notaMinima, notaMinimaCalculata);
	}
	
	@Test
	public void testGetNotaMinimaExistenceReferintaNull() throws ExceptieNote {
		student.setNote(null);
		
		int notaMinima=0;
		int notaMinimaCalculata = student.getNotaMinima();
		
		assertEquals("Test cu referinta null pt note", notaMinima, notaMinimaCalculata);
	}
}
