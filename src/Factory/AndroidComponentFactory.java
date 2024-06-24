package Factory;

import Factory.components.Button.AndroidButton;
import Factory.components.Button.Button;
import Factory.components.Dropdown.AndriodDropdown;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.AndroidMenu;
import Factory.components.Menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndriodDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
