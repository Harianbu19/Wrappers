package Annotations;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class usingannotate {

	@BeforeSuite

	public void beforeSuit() {

		System.out.println("BeforeSuite");

	}

	@BeforeTest

	public void beforeTest() {

		System.out.println("BeforeTest");

	}

	@BeforeClass

	public void beforeClass() {

		System.out.println("BeforeClass");

	}

	@BeforeMethod

	public void beforeMethod() {

		System.out.println("BeforeMethod");
	}

	@Test

	public void test1() {

		System.out.println("test1");

	}

	@Test

	public void test2() {

		System.out.println("test2");

	}

	@AfterMethod

	public void afterMethod() {

		System.out.println("AfterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("afterSuite");
	}
}
