package RockwellAutomation.CALStartup_Test;


import org.junit.jupiter.api.Test;

public class Rockwell_CALSSolutionTest 
{
	private static final PuzzleSolution TestObj = new PuzzleSolution();
	
	@Test
	void sameNumberOfPLCsAndEmployees_correctNumberOfPLCsInRunMode() {
		System.out.println("Test the puzzle solution for 1100 employes with 1100 PLCs");
		System.out.println("After the completion of process, The number of PLCs in RUN Mode: "+ TestObj.doTheCalculations());
	}
}
