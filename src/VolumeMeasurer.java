/*
	<Ameen Almiftah>		<04/27/2011>
	<volumeMeasurer interface>
	<class description: volume measurer implements Measurer used for common volume operation>
*/

public class VolumeMeasurer implements Measurer {



	public double getMeasurer (Object x){

		Solid sfr = (Solid) x;
		return sfr.volume();

	}	

}