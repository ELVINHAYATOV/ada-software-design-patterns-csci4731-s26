package az.edu.ada.modules.module04.lecutre06;

public class Checkbox {

	public bool isBordersRounded;

	public Checkbox() {
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("win")) {
			isBordersRounded = false;
			System.out.println("Operating system is Windows");
		} else if (os.contains("mac")) {
			isBordersRounded = true;
			System.out.println("Operating system is macOS");
		} else {
			isBordersRounded = true;
			System.out.println("Operating system is Unknown");
		}
	}
}
