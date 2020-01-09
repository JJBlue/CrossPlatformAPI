package crossplatformapi.interfaces.states;

public interface PowerStates {
	public void modernStandby(); //S0
	public void standby(); //S1-3
	public void hibernate(); //S4
	public void shutdown(); //S5
}
