package crossplatformapi.interfaces.window;

public interface IWindow {
	public String getTitle();
	
	public long getXPosition();
	
	public long getYPosition();
	
	public long getWidth();
	
	public long getHeight();
	
	public void setTopMost(boolean value);
	
	public void setSize(long width, long height);
	
	public void setPosition(long x, long y);
	
	public void toFront();
	
	public void toBack();
	
	public boolean isMaximized();
	
	public boolean isMinimized();
	
	public void maximize();
	
	public void minimize();
	
	public void restore();
	
	public void hide();
	
	public void show();
	
	public void close();
}
