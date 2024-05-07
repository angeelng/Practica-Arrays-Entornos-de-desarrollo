package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestsMedia.class, TestsMediana.class, TestsNumeroMax.class, TestsNumeroMin.class })
public class AllTests {

}
