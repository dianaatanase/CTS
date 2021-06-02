package ro.ase.csie.cts.gr1087.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.gr1087.testare.exceptii.ExceptieNote;
import ro.ase.csie.cts.gr1087.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.gr1087.testare.modele.Student;

public class TestStudentAlteTeste {
	
	// test fixture
	static Student student;
	static ArrayList<Integer> note;
	static String numeInitial;
	static int varstaInitiala;
	static int nrNoteInitiale;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		note = new ArrayList<>();
		nrNoteInitiale = 3;
		Random random = new Random();
		for(int i =0; i< nrNoteInitiale; i++) {
			note.add(random.nextInt(Student.MAX_NOTA+1));
		}
		numeInitial = "Gigel";
		varstaInitiala = Student.MIN_VARSTA+1;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(numeInitial, varstaInitiala, note);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMinInt() throws ExceptieVarsta{
		int varstaNoua = Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
	}
	
	@Test (expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMaxInt() throws ExceptieVarsta{
		int varstaNoua = Integer.MAX_VALUE;
		student.setVarsta(varstaNoua);
	}
	
	@Test
	public void testSetVarstaBoundaryVarstaMinimaRight() throws ExceptieVarsta {
		int varstaNoua = Student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaModificata = student.getVarsta();
		assertEquals("Test pentru limita inferioara varsta", varstaNoua, varstaModificata);
	}
	
	@Test
	public void testSetVarstaBoundaryVarstaMaximaRight() throws ExceptieVarsta {
		int varstaNoua = Student.MAX_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaModificata = student.getVarsta();
		assertEquals("Test pentru limita inferioara varsta", varstaNoua, varstaModificata);
	}
	
	@Test
	public void testSetNoteReferenceDeepCopy() throws ExceptieNote {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(10);
		note.add(10);
		note.add(10);
		student.setNote(note);
		
		int[] noteStudent = new int[student.getNrNote()];
		for( int i =0; i<student.getNrNote(); i++) {
			noteStudent[i] = student.getNota(i);
		}
		
		note.set(0, 5);
		
		int[] noteStudentDupaModificare = new int[student.getNrNote()];
		for(int i =0; i<student.getNrNote();i++) {
			noteStudentDupaModificare[i] = student.getNota(i);
		}
		
		assertArrayEquals("Test modificare note din exterior", noteStudent, noteStudentDupaModificare);
	}
	
}
