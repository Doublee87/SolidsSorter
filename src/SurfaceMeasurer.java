/*
	<Ameen Almiftah>		<04/27/2011>
	<surfaceMeasurer>
	<class description: surface measurer implements Measurer used for common surface operation>
*/

public class SurfaceMeasurer implements Measurer {

	public double getMeasurer (Object x){

		Solid sfr = (Solid) x;
		return sfr.surface();


	}

}
