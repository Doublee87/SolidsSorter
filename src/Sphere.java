/*
<Ameen Almiftah>		<04/27/2011>
<class name: sphere>
<class description: deals with sphere data>
*/

import java.text.DecimalFormat;
public class Sphere extends Solid {

	private double radius;

	/*
	<method name: Sphere >
	<description: class constructor>
	<preconditions: none>
	<postconditions: instantiate radius>
	*/
	
	public Sphere(){
		super();
		this.radius = 0.0;
	}
	
	// sets radius
	public Sphere(double radius){
		this.radius = radius;
	}
	
	// radius getter
	public double getRadius(){
		return radius;
	}
	
	// radius setter
	public void setRadius(double radius){
		this.radius = radius;
	}
	// sphere volume calculator
	public double volume(){
		return  ( (4.0/3.0) * Math.PI * (Math.pow(this.getRadius(), 3.0)) );
	}
	// sphere surface calculator
	public double surface(){
		return 4 * ( Math.PI * (this.getRadius() * this.getRadius()));
	}

	/*
	<method name: display >
	<description: displays information on screen>
	<preconditions: none>
	<postconditions: none>
	*/
	
	public void display(){
		java.text.DecimalFormat fmt = new java.text.DecimalFormat("###.00");
		String output = "Sphere radius = " + fmt.format(radius);
		output += " surface area = " + fmt.format(surface());
		output += " volume = " + fmt.format(volume());
		System.out.print(output + "\n");
	}    


}