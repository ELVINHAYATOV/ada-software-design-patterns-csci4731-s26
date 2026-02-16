package az.edu.ada.modules.module05.lecutre07;

import LinuxFactory;
import MacFactory;
import WinFactory;

public class ConfigLoader {

	static GUIFactory getFactory(String os, String theme) {
		switch (os) {
			case "windows":
				return WinFactory.getInstance();
			case "mac":
				return MacFactory.getInstance();
			case "linux":
				return LinuxFactory.getInstance();
			default:
				throw new Exception("Operating system is Unknown");
		}
	}
}
