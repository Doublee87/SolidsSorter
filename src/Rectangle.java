/*
<Ameen Almiftah>		<04/27/2011>
<class name: rectangle>
<class description: deals with rectangle data, parent of cube>
*/

import java.text.DecimalFormat;

public class Rectangle extends Solid{

	private double length;
	private double width;
	private double height;

	/*
	<method name: rectangle >
	<description: class constructor>
	<preconditions: none>
	<postconditions: instantiate length, width and height>
	*/
	
	public Rectangle(){
		super();
		this.length = 0.0;
		this.width = 0.0;
		this.height = 0.0;
	}
	// sets values foe length, width and height
	public Rectangle(double length, double width, double height){
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	//length getter
	public double getLength(){
		return this.length;
	}

	//length setter
	public void setLength(double length){
		this.length = length;
	}
	
	//width getter
	public double getWidth(){
		return this.width;
	}
	//width setter
	public void setWidth(double width){
		this.width = width;
	}
	// height getter 
	public double getHeight(){
		return this.height;
	}
	
	// height setter
	public void setHeight(double height){
		this.height = height;
	}

	//rectangle volume calculator 
	public double volume(){
		return this.getLength() * this.getWidth() * this.getHeight();
	}
	
	//rectangle surface calculator
	public double surface(){
		return 2* (this.getLength() * this.getWidth()) + (this.getLength() * this.getHeight()) +(this.getWidth() * this.getHeight());
	}

	
	/*
	<method name: display >
	<description: displays information on screen>
	<preconditions: none>
	<postconditions: none>
	*/
	
	public void display()
	{
		java.text.DecimalFormat fmt = new java.text.DecimalFormat("###.00");
		String output = "Rectangular Solid Length=" + fmt.format(length);
		output += " width=" + fmt.format(width);
		output += " height=" + fmt.format(height);
		output += " surface area=" + fmt.format(surface());
		output += " volume=" + fmt.format(volume());
		System.out.print(output + "\n");
	}    


}