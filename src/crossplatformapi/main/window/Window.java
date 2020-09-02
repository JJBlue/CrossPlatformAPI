package crossplatformapi.main.window;

import crossplatformapi.interfaces.window.IWindow;
import crossplatformapi.jni.window.NativeWindow;

public class Window implements IWindow {
	
	protected long window;
	
	public Window(long window) {
		this.window = window;
	}
	
	@Override
	public String getTitle() {
		return NativeWindow.getTitle(window);
	}
	
	@Override
	public long getXPosition() {
		return NativeWindow.getXPosition(window);
	}
	
	@Override
	public long getYPosition() {
		return NativeWindow.getYPosition(window);
	}
	
	@Override
	public long getWidth() {
		return NativeWindow.getWidth(window);
	}
	
	@Override
	public long getHeight() {
		return NativeWindow.getHeight(window);
	}
	
	@Override
	public void setTopMost(boolean value) {
		NativeWindow.setTopMost(window, value);
	}
	
	@Override
	public void setSize(long width, long height) {
		NativeWindow.setSize(window, width, height);
	}
	
	@Override
	public void setPosition(long x, long y) {
		NativeWindow.setPosition(window, x, y);
	}
	
	@Override
	public void toFront() {
		NativeWindow.toFront(window);
	}
	
	@Override
	public void toBack() {
		NativeWindow.toBack(window);
	}
	
	@Override
	public boolean isMaximized() {
		return NativeWindow.isMaximized(window);
	}
	
	@Override
	public boolean isMinimized() {
		return NativeWindow.isMinimized(window);
	}
	
	@Override
	public void maximize() {
		NativeWindow.maximize(window);
	}
	
	@Override
	public void minimize() {
		NativeWindow.minimize(window);
	}
	
	@Override
	public void restore() {
		NativeWindow.restore(window);
	}
	
	@Override
	public void hide() {
		NativeWindow.hide(window);
	}
	
	@Override
	public void show() {
		NativeWindow.show(window);
	}
	
	@Override
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
