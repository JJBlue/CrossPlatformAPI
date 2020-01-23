package crossplatformapi.main.display;

import crossplatformapi.jni.display.NativeDisplay;

public class Display {
	protected long display;
	
	public Display(long display) {
		this.display = display;
	}
	
	public boolean isPrimary() {
		return NativeDisplay.isPrimary(display);
	}
	
	public long getX() {
		return NativeDisplay.getX(display);
	}
	
	public long getY() {
		return NativeDisplay.getY(display);
	}
	
	public long getWidth() {
		return NativeDisplay.getWidth(display);
	}
	
	public long getHeight() {
		return NativeDisplay.getHeight(display);
	}
	
	public long getWorkX() {
		return NativeDisplay.getWorkX(display);
	}
	
	public long getWorkY() {
		return NativeDisplay.getWorkY(display);
	}
	
	public long getWorkWidth() {
		return NativeDisplay.getWorkWidth(display);
	}
	
	public long getWorkHeight() {
		return NativeDisplay.getWorkHeight(display);
	}
	
	public void setBrightness(long brightness) {
		NativeDisplay.setBrightness(display, brightness);
	}
	
	public long getBrightness() {
		return NativeDisplay.getBrightness(display);
	}
	
	public long getMinBrightness() {
		return NativeDisplay.getMinBrightness(display);
	}
	
	public long getMaxBrightness() {
		return NativeDisplay.getMaxBrightness(display);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Display)
			return ((Display) obj).display == display;
		return false;
	}
}
