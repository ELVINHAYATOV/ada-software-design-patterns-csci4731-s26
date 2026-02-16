package az.edu.ada.modules.module05.lecutre07;

import AppColor;

public class ProgressBar {

	public AppColor backgroundColor;
	public AppColor tintColor;

	private double value = 0;

	public ProgressBar(double value) {
		this.value = value;
		backgroundColor = AppColor.gray();
		tintColor = AppColor.tint();
	}

	public void paint() {
		System.out.println("Rendering ProgressBar [" + value + "%]");
	}

	public void setValue(int value) {
		this.value = Math.min(100, Math.max(0, value));
	}

	public double getValue() {
		return value;
	}
}
