package az.edu.ada.modules.module05.lecutre07;

import Button;
import Checkbox;
import ProgressBar;
import java.util.ArrayList;
import java.util.List;

public class Window {

	private String title;
	private List<Button> buttons;
	private List<Checkbox> checkboxes;
	private List<ProgressBar> progressBars;

	public Window() {
		this.buttons = new ArrayList<>();
		this.checkboxes = new ArrayList<>();
		this.progressBars = new ArrayList<>();
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void addButton(Button button) {
		buttons.add(button);
	}

	public void addCheckbox(Checkbox checkbox) {
		checkboxes.add(checkbox);
	}

	public void addProgressBar(ProgressBar progressBar) {
		progressBars.add(progressBar);
	}

	public List<Button> getButtons() {
		return buttons;
	}

	public List<Checkbox> getCheckboxes() {
		return checkboxes;
	}

	public List<ProgressBar> getProgressBars() {
		return progressBars;
	}

	public void render() {
		System.out.println("=== Window: " + title + " ===");
		for (Button button : buttons) {
			button.paint();
		}
		for (Checkbox checkbox : checkboxes) {
			checkbox.paint();
		}
		for (ProgressBar progressBar : progressBars) {
			progressBar.paint();
		}
		System.out.println("========================");
	}
}
