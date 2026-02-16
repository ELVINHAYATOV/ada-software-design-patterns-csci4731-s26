package az.edu.ada.modules.module05.lecutre07;

import AppColor;

public class Button {

	public AppColor backgroundColor;
	public AppColor textColor;

	public Button() {
		backgroundColor = AppColor.background();
		textColor = AppColor.primary();
	}

	public void paint() {
		System.out.println("Rendering Button");
	}
}
