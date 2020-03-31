package vehicles;


enum Orientation {
	NORTH, SOUTH, EAST, WEST;
}


/**
 * Location represents location for each vehicle on a track
 * 
 * @author aviv
 *
 */
public class Location {
	
	
	private float km;
	private boolean lights;
	
	private Point point;
	private Orientation orientation;
	
	
	
	
	
	
	
/**
 * getter Point 
 * 
 * @return Point object
 */
	public Point getPoint() {
		return point;
	}
	/**
	 * setter Point 
	 * 
	 * @param Point object 
	 */
	public void setPoint(Point point) {
		this.point = point;
	}
	/**
	 * getter Orientation 
	 * 
	 * @return Orientation object
	 */
	public Orientation getOrientation() {
		return orientation;
	}
	/**
	 * setter Orientation
	 * 
	 * @param Orientation object
	 */
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	/**
	 * getter km - represent KM
	 * 
	 * @return km 
	 */
	public float getKm() {
		return km;
	}
	/**
	 * setter km
	 * 
	 * @param km
	 */
	public void setKm(float km) {
		this.km = km;
	}
	/**
	 * 
	 * @return if the lights are True(on) or False(off) 
	 */
	public boolean isLights() {
		return lights;
	}
	/**
	 * setter lights
	 * 
	 * @param lights 
	 */
	public void setLights(boolean lights) {
		this.lights = lights;
	}
}
