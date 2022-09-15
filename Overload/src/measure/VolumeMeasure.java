package measure;

public class VolumeMeasure {
	public double pi = 3.1416; 		// as we know pi equal to 3.1416
	public double V;
	public double v;
	
	public double measureVolume(int r, double h) {
		
		v = 3.1416 * r * r * h;
		return v;
		
	}
	
    public double measureVolume(int r) {
			
		V = 4 * 3 * 3.1416 * r * r * r;
		return V;
		
	}
    
    public double measureVolume(double a) {
    	
    	V = a * a * a;
    	return V;
    	
    }
}
