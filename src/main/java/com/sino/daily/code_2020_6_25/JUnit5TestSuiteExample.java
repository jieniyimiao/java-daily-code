package com.sino.daily.code_2020_6_25;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * create by 2020-06-26 13:03
 *
 * @author caogu
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("com.sino.daily.code_2020_6_25")
@ExcludeTags("PROD")
public class JUnit5TestSuiteExample {
}
