package ro.alexbolboaca.UnitTestingFramework;

public class UnitTestingFrameworkTests {

	public static void main(String[] args) {

		RunAllTests();
		
		System.out.println("DONE");
	}

	private static void RunAllTests() {
		new AssertEqualsTests().runTests();
	}
}
