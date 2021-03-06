package ro.ase.csie.cts.gr1087.testare.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.gr1087.testare.teste.categorii.TesteImportante;

@RunWith(Categories.class)
@IncludeCategory({TesteImportante.class})
@SuiteClasses({ AllTests.class, TestStudentAlteTeste.class })
public class SuitaTesteImportante {

}
