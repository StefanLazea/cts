package junit.testare;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(CategorieTesteSuita.class)
@SuiteClasses({ TestCaseConstructor.class, TestCaseMetodaTotalIntrari.class })
public class Suita {

}
