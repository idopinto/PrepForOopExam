package seven_segment;

import java.awt.*;

public abstract class DisplayState{

    public final static int SEGMENT_NUMBER = 7;
    public final static int A = 0;
    public final static int B = 1;
    public final static int C = 2;
    public final static int D = 3;
    public final static int E = 4;
    public final static int F = 5;
    public final static int G = 6;

    private final static Color OFF = Color.green.darker().darker().darker().darker();
    private final static Color ON = Color.green.brighter().brighter().brighter().brighter().brighter();

    private boolean[] segmentStates;

    public DisplayState(boolean A, boolean B, boolean C, boolean D, boolean E, boolean F, boolean G) {
        this.segmentStates = new boolean[]{A,B,C,D,E,F,G};
    }

    public void handle(Polygon[] segments, Graphics graphics){
        for (int i = 0; i < SEGMENT_NUMBER; i++) {
            graphics.setColor((segmentStates[i] ? ON : OFF));
            graphics.fillPolygon(segments[i]);
            graphics.drawPolygon(segments[i]);
        }
    }
}
