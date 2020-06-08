package s3.g1079.paris.iannis.junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(SlowTest.class)
@SuiteClasses({ testInspection.class, testSetDays.class, testTotalCost.class })
public class AllTests {

}
