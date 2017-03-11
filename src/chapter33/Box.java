package chapter33;

public class Box {
	
	public double width;
	public double height;
	public double length;
	
	Box(double width, double height, double length){
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	Box(double side){
		this.width = this.height = this.length = side;
	}
	

	public double volume(){
		return width * height * length;
	}
	
	public double area(){
		return 2 * width * height + 2 * width * length + 2 * height * length;
	}

}
