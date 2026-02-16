package az.edu.ada.modules.module05.lecutre07;

import WindowBuilder;

public class App {

	public static void main(String[] args) {
		GUIFactory factory = ConfigLoader.getFactory();

		Window window = new WindowBuilder(factory)
			.addTitle("Window")
			.addButton("OK")
			.addButton("Cancel")
			.addCheckbox("Enable Checkbox")
			.addCheckbox("Auto Save")
			.addProgressBar(75)
			.build();

		window.render();
	}
}
