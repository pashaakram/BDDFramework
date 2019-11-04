package com.edgenetworks.utilities;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

public class TestngClass {

	public static void main(String[] args)
	{
		TestListenerAdapter tla = new TestListenerAdapter();

		TestNG testng = new TestNG();

		List<String> suites = Lists.newArrayList();

		suites.add(System.getProperty("user.dir") + "/testng.xml");//path to xml..in src

		testng.setTestSuites(suites);

		testng.run();

	}

}
