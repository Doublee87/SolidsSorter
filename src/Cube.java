/*
<Ameen Almiftah>		<04/27/2011>
<class name: Cube>
<class description: deals with cube data>
*/
import java.text.DecimalFormat;

public class Cube extends Rectangle{
	private double side;
	public Cube(){
		super();
		this.side = 0.0;
	}
	
	/*
	<method name: Cube >
	<description: class constructor>
	<preconditions: none>
	<postconditions: instantiate side as length, width and height>
	*/
	
	public Cube (double side){
		super(side,side,side);
		this.side = side;

	}
	
	/*
	<description:  side getter>
	<preconditions: none>
	<postconditions: none>
	*/
	public double getSide(){
		return side;

	}
	/*
	<description: side setter>
	<preconditions: none>
	<postconditions: sets side to input>
	*/
	public void setSide(double side){
		this.side = side;
	}
	// calls parent to measure surface 
	public double surface(){
		return super.surface();

	}
	//calls parent to measure volume
	public double volume(){
		return super.volume();

	}

	/*
	<method name: display >
	<description: displays information on screen>
	<preconditions: none>
	<postconditions: none>
	*/
	
	public void display(){
		java.text.DecimalFormat fmt = new java.text.DecimalFormat("###.00");
		String output = "Cube side=" + fmt.format(side);
		output += " surface area=" + fmt.format(surface());
		output += " volume=" + fmt.format(volume());
		System.out.print(output + "\n");       
	}
}
