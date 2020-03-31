package vehicles;


enum Orientation {
	NORTH, SOUTH, EAST, WEST;
}

public class Location {
	
	private float km;
	private boolean lights;
	
	
	private Point point;
	private Orientation orientation;
	
	
	
	
	
	
	
	
	
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public Orientation getOrientation() {
		return orientation;
	}
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public boolean isLights() {
		return lights;
	}
	public void setLights(boolean lights) {
		this.lights = lights;
	}
}
