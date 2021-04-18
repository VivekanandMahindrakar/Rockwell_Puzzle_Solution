package RockwellAutomation.CALStartup_Test;

import java.util.List;
import java.util.stream.*;
import RockwellAutomation.CALStartup_Test.PLC;
import RockwellAutomation.CALStartup_Test.PlcMode;

public class PuzzleSolution {
	
	public int doTheCalculations() {
//Variables declaration 
		final int number_Of_Employees = 1100;
		final int number_of_PLCs = 1100;
		final int start_up_emp_index = 2;
		int empPointer, plcPointer;

//Objects creation (Instances of PLCs)
		final List<PLC> PLCList = runAllPlcs(number_of_PLCs);
		
//following lines updates the each PLC mode	
		for(empPointer=start_up_emp_index; empPointer<number_Of_Employees+1;empPointer++){

			for(plcPointer=1;plcPointer<number_of_PLCs;plcPointer++){
				
				if (((plcPointer+1) % empPointer ) == 0) {
					
					PLCList.get(plcPointer).changeMode();
				}
				
			}
				
		}
//returns the number of PLCs with current mode set as RUN				
		return countPLCsInRunMode(PLCList);
		
	}
	
//Method  to create and return object instances
	private List<PLC> runAllPlcs(int numberOfPLCs) {
		return Stream
				.generate(() -> new PLC(PlcMode.RUN))
				.limit(numberOfPLCs)
				.collect(Collectors.toList());
	}
	
//Method to count the number of the PLCs with mode set as RUN
	private int countPLCsInRunMode(List<PLC> plcs) {
		return (int) plcs.stream()
				.filter(plc -> plc.getPlcMode() == PlcMode.RUN)
				.count();
	}
	
}
