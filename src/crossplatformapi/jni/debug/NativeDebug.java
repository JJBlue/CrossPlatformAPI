package crossplatformapi.jni.debug;

public class NativeDebug {
	/**
	 * print or not print errors. Errors can be normal, so no wonder, if it prints some.
	 */
	public native static void printError(boolean value);
}
