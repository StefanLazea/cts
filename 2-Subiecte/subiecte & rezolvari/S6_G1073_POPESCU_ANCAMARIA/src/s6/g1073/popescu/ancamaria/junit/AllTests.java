package s6.g1073.popescu.ancamaria.junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(SuiteClass.class)
@SuiteClasses({ TestMetoda.class, TestSetter.class })
public class AllTests {

}
