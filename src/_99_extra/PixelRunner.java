package _99_extra;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty a = new PixelParty();
	a.setColor(0, 170, 30);
	a.drawRectangle(0, 0, 50, 50);
	a.drawRectangle(0, 50, 50, 50);
	a.drawRectangle(0, 100, 50, 50);
	a.drawRectangle(0, 150, 50, 50);
	a.drawRectangle(0, 200, 50, 50);
	
	a.drawRectangle(50, 0, 50, 50);
	a.drawRectangle(50, 50, 50, 50);
	a.drawRectangle(50, 100, 50, 50);
	a.drawRectangle(50, 150, 50, 50);
	a.drawRectangle(50, 200, 50, 50);
	a.drawRectangle(50, 250, 50, 50);
	a.drawRectangle(50, 300, 50, 50);
	
	a.drawRectangle(100, 50, 50, 50);
	a.drawRectangle(100, 100, 50, 50);
	a.drawRectangle(100, 150, 50, 50);
	a.drawRectangle(100, 200, 50, 50);
	a.drawRectangle(100, 250, 50, 50);
	a.drawRectangle(100, 300, 50, 50);
	
	a.drawRectangle(150, 50, 50, 50);
	a.drawRectangle(150, 100, 50, 50);
	a.drawRectangle(150, 150, 50, 50);
	a.drawRectangle(150, 200, 50, 50);
	a.drawRectangle(150, 250, 50, 50);
	a.drawRectangle(150, 300, 50, 50);
	
	
	//frog
	
	
	a.displayImage();
	a.saveImage();
	
	
	
}
}
