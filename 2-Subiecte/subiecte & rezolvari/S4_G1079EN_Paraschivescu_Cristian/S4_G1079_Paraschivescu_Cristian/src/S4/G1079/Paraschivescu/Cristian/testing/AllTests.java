package S4.G1079.Paraschivescu.Cristian.testing;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(SlowTest.class)
@SuiteClasses({ testIsInspectionNecessary.class, testSetNoDays.class, testTotalCost.class })
public class AllTests {

}
