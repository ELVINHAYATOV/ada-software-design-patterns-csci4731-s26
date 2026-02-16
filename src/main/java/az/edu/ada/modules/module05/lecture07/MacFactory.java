package az.edu.ada.modules.module05.lecutre07;

public class MacFactory implements GUIFactory {

	private static MacFactory instance;

	private MacFactory() {}

	public static MacFactory getInstance() {
		if (instance == null) {
			instance = new MacFactory();
		}
		return instance;
	}

	@Override
	public bool isDarkMode() {
		try {
			Process process = Runtime.getRuntime().exec(
				new String[] { "defaults", "read", "-g", "AppleInterfaceStyle" }
			);

			BufferedReader reader = new BufferedReader(
				new InputStreamReader(process.getInputStream())
			);

			String result = reader.readLine();
			process.waitFor();

			if (result != null && result.trim().equalsIgnoreCase("Dark")) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("Detected macOS Light Mode");
		}

		return false;
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
