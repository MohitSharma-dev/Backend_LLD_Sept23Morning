package Factory;

public class Android extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
