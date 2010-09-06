package ro.alexbolboaca.UnitTestingFramework;

public class AssertEqualsTests {

	public void runTests() {
		throwsExceptionIfArgumentsAreDifferent();
		doesntThrowExceptionIfArgumentsAreEqual();
	}

	void doesntThrowExceptionIfArgumentsAreEqual() {
		
		boolean throwsException = false;
		
		try{
		Assert.AssertEquals("expected", "expected");
		}catch (AssertionException e){
			throwsException = true;
		}
		
		Assert.AssertEquals(new Boolean(false).toString(), new Boolean(throwsException).toString());
	}

	void throwsExceptionIfArgumentsAreDifferent() {
		
		boolean throwsException = false;
		
		try {
			Assert.AssertEquals("expected", "actual");			
		} catch (AssertionException e) {
			throwsException = true;
		}
		
		Assert.AssertEquals(new Boolean(true).toString(), new Boolean(throwsException).toString());
	}
}
