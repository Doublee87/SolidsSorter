/*
	<Ameen Almiftah>		<04/27/2011>
	<program #2>
	<this program will read data of different solids from a file and sort it>
*/

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SolidSorter{
	public static void main(String [] args)
	{
		String file = "";
		Scanner console = new Scanner(System.in);
		SolidList sList = null;
		SolidList vList = null;

		System.out.print("Enter the File name: ");
		file = console.next();

		try
		{

			VolumeMeasurer vM = new VolumeMeasurer();
			SurfaceMeasurer sM = new SurfaceMeasurer();

			vList = new SolidList(vM);
			sList = new SolidList(sM);
			vList.fileReader(file);
			sList.fileReader(file);

			vList.display();
			sList.display();


		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Specified file: " + file + " not found");
			fnfe.printStackTrace();
		}
	}
}