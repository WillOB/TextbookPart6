package chapter33;

public class Box {
	
	private double width;
	private double height;
	private double length;
	
	Box(double width, double height, double length){
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	Box(double side){
		this.width = this.height = this.length = side;
	}
	
	Box(Box oldBox){
		this.width = oldBox.width;
		this.height = oldBox.height;
		this.length = oldBox.length;
	}
	

	public double volume(){
		return width * height * length;
	}
	
	public double area(){
		return 2 * width * height + 2 * width * length + 2 * height * length;
	}
	
	private double faceArea(){
		return width * height;
	}
	
	private double topArea(){
		return width * length;
	}
	
	private double sideArea(){
		return height * length;
	}
	
	public double area2(){
		return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
	}
	
	public double length(){
		return length;
	}
	
	public double height(){
		return height;
	}
	
	public double width(){
		return width;
	}
	
	public Box biggerBox(Box oldBox){
		return new Box(1.25 * oldBox.width, 1.25 * oldBox.height, 1.25 * oldBox.length);
	}

	public Box smallerBox(Box oldBox){
		return new Box(.75 * oldBox.width, .75 * oldBox.height, .75 * oldBox.length);
	}
	
	public boolean nests(Box outsideBox){
		return width < outsideBox.width && height < outsideBox.height && 
				length < outsideBox.length;
	}
}
