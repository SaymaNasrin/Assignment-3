package measure;

public class measureMain {
public static void main(String[] args) {
		
		VolumeMeasure vm = new VolumeMeasure();
		
		System.out.println("Volume of Cylinder:" + vm.measureVolume(5, 6));
		System.out.println("Volume of Sphere:" + vm.measureVolume(3));
	    System.out.println("Volume of Cube:" + vm.measureVolume(1.5));
	}

}
