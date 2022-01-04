package seven_segment;

public interface Context {
    void setState(DisplayState state);
    DisplayState getState();
}
