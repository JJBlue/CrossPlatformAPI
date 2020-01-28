package crossplatformapi.main.battery;

import crossplatformapi.main.battery.event.BatteryEvent;
import crossplatformapi.main.battery.event.BatteryPercentRemainingChangedEvent;
import crossplatformapi.main.events.EventManager;

public class BatteryReceiver {
	public static void percentRemainingBattery(long percent) {
		BatteryEvent event = new BatteryPercentRemainingChangedEvent(percent);
		EventManager.callAsync(event);
	}
}
