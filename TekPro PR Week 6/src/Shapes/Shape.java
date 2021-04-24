package Shapes;

public class Shape {
	private String color = "red";
	private boolean filled = true;
	
	public Shape(){// 1st constructor(default)
		this.color = "green";
		this.filled = true;
	}
	
	public Shape(String color, boolean filled){// 2nd constructor
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor(){// getter for String color
		return this.color;
	}
	
	public void setColor(String color){// setter for String color
		this.color = color;
	}
	
	public boolean isfilled(){// getter for boolean filled
		return this.filled;
	}
	
	public void setfilled(boolean filled){// setter for boolean filled
		this.filled = filled;
	}
	
	public String toString(){
		return  "A Shape with color of "+ this.color + " and " + ((this.isfilled() == true) ? "filled" : "Not filled");
	}

}
