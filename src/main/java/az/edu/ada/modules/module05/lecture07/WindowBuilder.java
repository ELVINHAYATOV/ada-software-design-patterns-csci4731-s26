package az.edu.ada.modules.module05.lecutre07;

import Button;
import Checkbox;
import GUIFactory;
import ProgressBar;

public class WindowBuilder {

	private GUIFactory factory;
	private Window window;

	public WindowBuilder(GUIFactory factory) {
		this.factory = factory;
		this.window = new Window();
	}

	public WindowBuilder addTitle(String text) {
		window.setTitle(text);
		return this;
	}

	public WindowBuilder addButton(String text) {
		Button button = factory.createButton();
		window.addButton(button);
		return this;
	}

	public WindowBuilder addCheckbox(String label) {
		Checkbox checkbox = factory.createCheckbox();
		window.addCheckbox(checkbox);
		return this;
	}

	public WindowBuilder addProgressBar(int initialValue) {
		ProgressBar progressBar = factory.createProgressBar();
		progressBar.setValue(initialValue);
		window.addProgressBar(progressBar);
		return this;
	}

	public Window build() {
		return window;
	}
}
