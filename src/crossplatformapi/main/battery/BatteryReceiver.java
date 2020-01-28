package crossplatformapi.main.battery;

import crossplatformapi.main.battery.event.BatteryEvent;
import crossplatformapi.main.battery.event.BatteryPercentRemainingChangedEvent;
import crossplatformapi.main.battery.event.BatterySaverChangedEvent;
import crossplatformapi.main.battery.event.PowerSupplyChangedEvent;
import crossplatformapi.main.events.EventManager;

public class BatteryReceiver {
	public static void percentRemainingBattery(long percent) {
		BatteryEvent event = new BatteryPercentRemainingChangedEvent(percent);
		EventManager.callAsync(event);
	}
	
	/**
	 * called on notebooks, if ac power is connected
	 */
	public static void powerplug() {
		BatteryEvent event = new PowerSupplyChangedEvent(PowerSupply.POWER_PLUG);
		EventManager.callAsync(event);
	}
	
	/**
	 * called on notebooks, if the power plug was removed and notebook works now on battery
	 */
	public static void batteryPower() {
		BatteryEvent event = new PowerSupplyChangedEvent(PowerSupply.BATTERY);
		EventManager.callAsync(event);
	}
	
	/**
	 * use short-term power source
	 */
	public static void short_term_Power() {
		BatteryEvent event = new PowerSupplyChangedEvent(PowerSupply.SHORT_TERM_POWER);
		EventManager.callAsync(event);
	}
	
	public static void batterySaverChanged(boolean on) {
		BatteryEvent event = new BatterySaverChangedEvent(on);
		EventManager.callAsync(event);
	}
}
