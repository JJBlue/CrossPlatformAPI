package crossplatformapi.main.window;

import crossplatformapi.interfaces.window.IWindow;
import crossplatformapi.jni.window.NativeWindow;

public class Window implements IWindow {
	
	protected long window;
	
	public Window(long window) {
		this.window = window;
	}
	
	public String getTitle() {
		return NativeWindow.getTitle(window);
	}
	
	public long getXPosition() {
		return NativeWindow.getXPosition(window);
	}
	
	public long getYPosition() {
		return NativeWindow.getYPosition(window);
	}
	
	public long getWidth() {
		return NativeWindow.getWidth(window);
	}
	
	public long getHeight() {
		return NativeWindow.getHeight(window);
	}
	
	public void setTopMost(boolean value) {
		NativeWindow.setTopMost(window, value);
	}
	
	public void setSize(long width, long height) {
		NativeWindow.setSize(window, width, height);
	}
	
	public void setPosition(long x, long y) {
		NativeWindow.setPosition(window, x, y);
	}
	
	public void toFront() {
		NativeWindow.toFront(window);
	}
	
	public void toBack() {
		NativeWindow.toBack(window);
	}
	
	public boolean isMaximized() {
		return NativeWindow.isMaximized(window);
	}
	
	public boolean isMinimized() {
		return NativeWindow.isMinimized(window);
	}
	
	public void maximize() {
		NativeWindow.maximize(window);
	}
	
	public void minimize() {
		NativeWindow.minimize(window);
	}
	
	public void restore() {
		NativeWindow.restore(window);
	}
	
	public void hide() {
		NativeWindow.hide(window);
	}
	
	public void show() {
		NativeWindow.show(window);
	}
	
	public void close() {
		NativeWindow.close(window);
	}
	
	public long getID() {
		return window;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Window)
			return ((Window) obj).window == window;
		return false;
	}
}
