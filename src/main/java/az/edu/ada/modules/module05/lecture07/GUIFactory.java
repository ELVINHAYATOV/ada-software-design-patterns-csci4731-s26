package az.edu.ada.modules.module05.lecutre07;

import Button;
import Checkbox;
import ProgressBar;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
	ProgressBar createProgressBar();
}
