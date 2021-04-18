package RockwellAutomation.CALStartup_Test;

//PLC class with mode as a property
public class PLC {
	private PlcMode mode;

	public PLC(PlcMode mode) {
		this.mode = mode;
	}

	public PlcMode getPlcMode() {
		return mode;
	}

	public void setPlcMode(PlcMode mode) {
		this.mode = mode;
	}

	public void changeMode() {
		if (mode == PlcMode.RUN) setPlcMode(PlcMode.PROGRAM);
		else setPlcMode(PlcMode.RUN);
	}
}
