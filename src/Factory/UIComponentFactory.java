package Factory;

import Factory.components.Button.Button;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
