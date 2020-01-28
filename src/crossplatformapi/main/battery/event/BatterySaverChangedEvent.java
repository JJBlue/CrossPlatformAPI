package crossplatformapi.main.battery.event;

public class BatterySaverChangedEvent extends BatteryEvent {
	private static final long serialVersionUID = 2012076635111818520L;
	
	public final boolean on;
	
	public BatterySaverChangedEvent(boolean on) {
		this.on = on;
	}
	
	public boolean isOn() {
		return on;
	}
}
