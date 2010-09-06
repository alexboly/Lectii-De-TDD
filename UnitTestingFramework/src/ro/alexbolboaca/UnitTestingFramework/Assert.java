package ro.alexbolboaca.UnitTestingFramework;

public class Assert {

	public static void AssertEquals(String expected, String actual) {
		if(expected != actual)
			throw new AssertionException();
	}
}
