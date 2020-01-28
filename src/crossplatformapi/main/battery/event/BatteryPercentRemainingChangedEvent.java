package crossplatformapi.main.battery.event;

public class BatteryPercentRemainingChangedEvent extends BatteryEvent {
	private static final long serialVersionUID = -1215070632974452477L;
	
	public final long percent;
	
	public BatteryPercentRemainingChangedEvent(long percent) {
		this.percent = percent;
	}
	
	public long getPercentRemaining() {
		return percent;
	}
}
