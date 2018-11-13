package View;

public class Board {
	private String length;
	private String width;
	
	public Board(String length, String width)
	{
		this.length = length;
		this.width = width;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}
}
