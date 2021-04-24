package Shapes;

/*	Write a class called Square, as a subclass of Rectangle.
 *  Convince yourself that Square can be modeled as a subclass 
 *  of Rectangle. Square has no instance variable, but inherits 
 *  the instance variables width and length from its superclass 
 *  Rectangle. 
 */


public class Square extends Rectangle {
	public Square(){
		super();
	}
	
	public Square(double side){
		super(side,side);
	}
	
	public Square(double side, String color, boolean filled){
		super(side,side,color,filled);
	}
	
	public double getSide(){
		return super.getWidth();
	}
	
	public void setSide(double side){
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double side){
		setSide(side);
	}
	
	public void setLength(double side){
		setSide(side);
	}
	
	public String toString(){
		return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
	}

}
