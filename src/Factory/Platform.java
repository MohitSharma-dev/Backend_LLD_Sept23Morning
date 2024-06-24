package Factory;

import Factory.components.Button.AndroidButton;
import Factory.components.Button.Button;
import Factory.components.Button.IOSButton;

public abstract class Platform {
    public void setRefreshRate(){

    }

    public void setTheme(){

    }

    public static Platform createPlatform(String platformName){
        return PlatformFactory.getPlatform(platformName);
    }

//    public Button createButton(){
////        if(this is an instance of Android ){
////            return new AndroidButton();
////        } else if(this is an instance of IOS){
////            return new IOSButton();
////        }
//    }

    public abstract UIComponentFactory createUIComponentFactory();
}
