package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.categorii.CategorieTestePersoaneNascuteInainte2000;

@RunWith(Categories.class)
@SuiteClasses({ PersoanaGetSexTests.class })
@ExcludeCategory({CategorieTestePersoaneNascuteInainte2000.class})
public class CustomSuiteGetSexInterval {

}
