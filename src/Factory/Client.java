package Factory;

import Factory.components.Button.Button;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
//        Platform p = new Android();

        String platform = "Android";
        Platform p = Platform.createPlatform(platform);

        UIComponentFactory uiComponentFactory =  p.createUIComponentFactory();
        Button button = uiComponentFactory.createButton();
        Menu menu = uiComponentFactory.createMenu();
        Dropdown dropdown = uiComponentFactory.createDropdown();

    }
}
