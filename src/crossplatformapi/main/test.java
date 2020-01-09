package crossplatformapi.main;

import crossplatformapi.jni.stats.PowerStates;

public class test {
	public static void main(String[] args) {
		System.out.println("start");
		LibraryLoader.loadWindows();
		PowerStates.standby();
	}
}
