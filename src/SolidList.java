/*
	<Ameen Almiftah>		<04/27/2011>
	<class name: SolidList>
	<class description: reads from a file and sort data>
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SolidList {

	private Scanner scn;
	private Measurer m;
	private int count;
	private int counter;
	private Solid mySolidList [];


	/*
	<method name: SolidList >
	<description: class constructor>
	<preconditions: none>
	<postconditions: instantiate m, count, counter and mySolidList>
	*/

	public SolidList(Measurer myMeasrer){
		m = myMeasrer;
		this.mySolidList = new Solid [200];
		count= 0;
		counter = 0;
	}
	/*
	<method name: fileReader >
	<description: reads file>
	<preconditions: none>
	<postconditions: add data from file>
	*/
	public void fileReader(String file)throws FileNotFoundException{

		scn = new Scanner(new File(file));
		String type = "";
		double radius, side, length, width, height;
		radius = side = length = width = height = 0;
		while(scn.hasNext()){
			type = scn.next();

			if(type.equalsIgnoreCase("R")){

				length = scn.nextDouble();
				width = scn.nextDouble();
				height = scn.nextDouble();
				Solid newRec = new Rectangle(length, width, height);
				this.addSorted(newRec);
				count++;

			}else if(type.equalsIgnoreCase("S")){

				radius = scn.nextDouble();
				Solid newSph = new Sphere(radius);
				this.addSorted(newSph);
				count++;

			}else if(type.equalsIgnoreCase("C")){

				side = scn.nextDouble();
				Solid newCub = new Cube(side);
				this.addSorted(newCub);
				count++;
			}
		}

	}

	/*
	<method name: addSorted >
	<description: sorts data>
	<preconditions: data>
	<postconditions: sorted data>
	*/
	
	public void addSorted(Solid s) {
		int k = 0;
		if (counter != 0){
			while ((k < counter) && (m.getMeasurer(s) > m.getMeasurer(mySolidList[k])))
				k++;
			for (int j = counter; j > k; j--)
				mySolidList[j] = mySolidList[j-1];
		}
		mySolidList[k] = s;
		counter++;
	}

	/*
	<method name: display >
	<description: displays information on screen>
	<preconditions: none>
	<postconditions: none>
	*/
	
	public void display(){
		if ( m instanceof VolumeMeasurer){
			System.out.println("The solids in ascending order of volume:");
		}else if ( m instanceof SurfaceMeasurer){
			System.out.println("The solids in ascending order of surface:");
		}
		for(int i=0; i<counter; i++){
			System.out.print("   ");
			mySolidList[i].display();

		}
	}
}   
