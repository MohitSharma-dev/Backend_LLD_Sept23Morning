package Factory;

public class PlatformFactory {
    public static Platform getPlatform(String platformName) {
        if(platformName.equals("Android")){
            return new Android();
        } else if (platformName.equals("IOS")){
            return new IOS();
        }
        return null;
    }
}
