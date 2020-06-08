package s5.g1073.paler.georgiana.testare;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(IncludTests.class)
@SuiteClasses({ TestareBoundary.class, testareExistence.class, TestarePerformance.class, TestareRight.class })
public class AllTests {

}
