package cts.examen.s2.unittesting;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(SlowTest.class)
@SuiteClasses({ testConstructor.class, testMinDrugPrice.class, testSetBodyTemp.class })
public class AllTestsWithOutSlowTest {

}
