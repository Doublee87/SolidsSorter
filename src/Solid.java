/*
<Ameen Almiftah>		<04/27/2011>
<class name: Solid>
<class description: parent class of sphere and rectangle, grandparent of cube>
*/

public abstract class Solid {

    protected Measurer volumeMeasurer;
    protected Measurer surfaceMeasurer;
    private String solidName;
    
    // class constructor
    public Solid(){
    	solidName = "unknown";
    	this.volumeMeasurer = new VolumeMeasurer();
    	this.surfaceMeasurer = new SurfaceMeasurer();
    }
    //name setter
    public void setName (String name){
    	solidName = name;
    }
    //name getter
    public String getName(){
    	return solidName;
    }
    
    // abstract volume class
    public abstract double volume();
    
    // abstract surface class
    public abstract double surface();
    
    // abstract display class
    public abstract void display();    
}