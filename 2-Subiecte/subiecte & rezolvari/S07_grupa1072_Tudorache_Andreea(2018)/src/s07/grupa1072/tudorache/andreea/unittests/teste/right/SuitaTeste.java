package s07.grupa1072.tudorache.andreea.unittests.teste.right;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(TesteIncluse.class)
@SuiteClasses({Teste1.class, Teste2.class})
public class SuitaTeste {

}
