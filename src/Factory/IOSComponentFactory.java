package Factory;

import Factory.components.Button.Button;
import Factory.components.Button.IOSButton;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Dropdown.IOSDropdown;
import Factory.components.Menu.IOSMenu;
import Factory.components.Menu.Menu;

public class IOSComponentFactory implements UIComponentFactory {
    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
