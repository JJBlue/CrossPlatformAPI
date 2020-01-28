package crossplatformapi.main.battery.event;

import crossplatformapi.main.battery.PowerSupply;

public class PowerSupplyChangedEvent extends BatteryEvent {
	private static final long serialVersionUID = 768057773132265252L;
	
	public final PowerSupply powerSupply;
	
	public PowerSupplyChangedEvent(PowerSupply supply) {
		this.powerSupply = supply;
	}
	
	public PowerSupply getPowerSupply() {
		return powerSupply;
	}
}
