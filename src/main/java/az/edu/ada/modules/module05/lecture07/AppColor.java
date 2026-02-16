package az.edu.ada.modules.module05.lecutre07;

import java.awt.Color;

public class AppColor {

	private final Color anyColor;
	private final Color darkColor;

	public AppColor(Color anyColor, Color darkColor) {
		this.anyColor = anyColor;
		this.darkColor = darkColor;
	}

	public AppColor(Color anyColor) {
		this(anyColor, null);
	}

	public Color get(boolean isDarkMode) {
		if (isDarkMode && darkColor != null) {
			return darkColor;
		}
		return anyColor;
	}

	public static AppColor background() {
		return new AppColor(new Color(255, 255, 255), new Color(18, 18, 18));
	}

	// for forground element such as text
	public static AppColor primary() {
		return new AppColor(new Color(18, 18, 18), new Color(255, 255, 255));
	}

	public static AppColor tint() {
		return new AppColor(new Color(33, 150, 243), new Color(100, 181, 246));
	}

	public static AppColor black() {
		return new AppColor(new Color(0, 0, 0));
	}

	public static AppColor gray() {
		return new AppColor(new Color(50, 50, 50));
	}

	public static AppColor white() {
		return new AppColor(new Color(255, 255, 255));
	}
}
