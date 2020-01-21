package crossplatformapi.main.os;

import java.util.HashMap;
import java.util.Map;

import crossplatformapi.interfaces.os.IOperatingSystem;
import crossplatformapi.os.windows.WinOS;

public class OS {
	private static Map<OperatingSystem, IOperatingSystem> operatingSystems;
	
	static {
		init();
	}
	
	private static void init() {
		operatingSystems = new HashMap<>();
		
		add(new WinOS());
	}
	
	public static void add(IOperatingSystem os) {
		operatingSystems.put(os.getOperatingSystem(), os);
	}
	
	public static IOperatingSystem getOperatingSystem() {
		OperatingSystem system = OS.getOperatingSystemType();
		IOperatingSystem os = operatingSystems.get(system);
		return os;
	}
	
	public static OperatingSystem getOperatingSystemType() {
		String os = getOperatingSystemAsString();
		os = os.trim().toLowerCase();
		
		if(os.contains("win"))
			return OperatingSystem.WINDOWS;
		if(os.contains("osx") || os.contains("mac"))
			return OperatingSystem.OS;
		if (os.contains("nix") || os.contains("aix") || os.contains("nux"))
			return OperatingSystem.UNIX;
		if(os.contains("sunos"))
			return OperatingSystem.SOLARIS;
		
		return null;
	}
	
	public static String getOperatingSystemAsString() {
		return System.getProperty("os.name");
	}
}
