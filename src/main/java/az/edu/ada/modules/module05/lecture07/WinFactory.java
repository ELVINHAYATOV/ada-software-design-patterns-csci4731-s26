package az.edu.ada.modules.module05.lecutre07;

public class WinFactory implements GUIFactory {

	private static WinFactory instance;

	private WinFactory() {}

	public static WinFactory getInstance() {
		if (instance == null) {
			instance = new WinFactory();
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
