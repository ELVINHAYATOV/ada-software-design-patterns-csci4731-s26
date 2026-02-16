package az.edu.ada.modules.module05.lecutre07;

public class LinuxFactory implements GUIFactory {

	private static LinuxFactory instance;

	private LinuxFactory() {}

	public static LinuxFactory getInstance() {
		if (instance == null) {
			instance = new LinuxFactory();
		}
		return instance;
	}

	@Override
	public bool isDarkMode() {
		// TODO: implement methods to get dark mode
		return true;
	}

	@Override
	public Button createButton() {
		return new Button();
	}

	@Override
	public Checkbox createCheckbox() {
		return new Checkbox();
	}

	@Override
	public ProgressBar createProgressBar() {
		return new ProgressBar();
	}
}
