package az.edu.ada.modules.module05.lecutre07;

import AppColor;

public class Checkbox {

	private boolean checked = false;
	public AppColor backgroundColor;
	public AppColor tintColor;

	public Checkbox() {
		backgroundColor = AppColor.gray();
		tintColor = AppColor.tint();
	}

	public void paint() {
		System.out.println("Rendering Checkbox: " + checked);
	}
}
