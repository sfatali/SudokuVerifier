import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
	SudokuVerifier verifier;
	
	@Before
	public void init() {
		verifier = new SudokuVerifier();
	}
	
	@Test
	public void testVerifySuccess() {
		int result = verifier.verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		assertEquals(0, result);
	}

	@Test
	public void testVerifyFailure() {
		int result = verifier.verify("123456789912345678891234567789123456678912345567891234456789123345678912234567891");
		assertNotEquals(0, result);
	}
}
