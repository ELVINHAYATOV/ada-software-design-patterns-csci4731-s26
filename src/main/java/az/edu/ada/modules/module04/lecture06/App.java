package az.edu.ada.modules.module04.lecutre06;

public class App {

	public static void main(String[] args) {
		Button button = Button();
		Checkbox checkbox = ChechBox();
		// Assume WindowManager is external library
		WindowManager.shared.addViews([checkbox, button]);
	}
}
