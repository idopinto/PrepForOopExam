package seven_segment;

import java.awt.*;
import javax.swing.*;

import static seven_segment.DisplayState.*;

// code adapted from: https://kiunwong.blogspot.com/2012/09/seven-segments-display-in-java.html 2021-11-27 .
// author: kiunwong.

public class SevenSegmentDisplay extends JPanel implements Context {
    public SevenSegmentDisplay() {
        Dimension size = new Dimension(110, 180);
        setPreferredSize(size);
        setOpaque(true);
        setBackground(Color.black);
        x = 0;
        y = 0;
        state = new EmptyDisplay();
        createSegments();
    }

    private int x;
    private int y;
    private DisplayState state;
    private Polygon[] segments;

    @Override
    public void setState(DisplayState state) {
        this.state = state;
    }

    @Override
    public DisplayState getState() {
        return state;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // this is needed to set the background color
        setSegments(g);
    }

    private void setSegments(Graphics graphics) {
        state.handle(segments, graphics);
    }

    private void createSegments() {
        segments = new Polygon[DisplayState.SEGMENT_NUMBER];

        segments[A] = new Polygon();
        segments[A].addPoint(x + 20, y + 8);
        segments[A].addPoint(x + 90, y + 8);
        segments[A].addPoint(x + 98, y + 15);
        segments[A].addPoint(x + 90, y + 22);
        segments[A].addPoint(x + 20, y + 22);
        segments[A].addPoint(x + 12, y + 15);

        segments[B] = new Polygon();
        segments[B].addPoint(x + 91, y + 23);
        segments[B].addPoint(x + 98, y + 18);
        segments[B].addPoint(x + 105, y + 23);
        segments[B].addPoint(x + 105, y + 81);
        segments[B].addPoint(x + 98, y + 89);
        segments[B].addPoint(x + 91, y + 81);

        segments[C] = new Polygon();
        segments[C].addPoint(x + 91, y + 97);
        segments[C].addPoint(x + 98, y + 89);
        segments[C].addPoint(x + 105, y + 97);
        segments[C].addPoint(x + 105, y + 154);
        segments[C].addPoint(x + 98, y + 159);
        segments[C].addPoint(x + 91, y + 154);

        segments[D] = new Polygon();
        segments[D].addPoint(x + 20, y + 155);
        segments[D].addPoint(x + 90, y + 155);
        segments[D].addPoint(x + 98, y + 162);
        segments[D].addPoint(x + 90, y + 169);
        segments[D].addPoint(x + 20, y + 169);
        segments[D].addPoint(x + 12, y + 162);

        segments[E] = new Polygon();
        segments[E].addPoint(x + 5, y + 97);
        segments[E].addPoint(x + 12, y + 89);
        segments[E].addPoint(x + 19, y + 97);
        segments[E].addPoint(x + 19, y + 154);
        segments[E].addPoint(x + 12, y + 159);
        segments[E].addPoint(x + 5, y + 154);

        segments[F] = new Polygon();
        segments[F].addPoint(x + 5, y + 23);
        segments[F].addPoint(x + 12, y + 18);
        segments[F].addPoint(x + 19, y + 23);
        segments[F].addPoint(x + 19, y + 81);
        segments[F].addPoint(x + 12, y + 89);
        segments[F].addPoint(x + 5, y + 81);

        segments[G] = new Polygon();
        segments[G].addPoint(x + 20, y + 82);
        segments[G].addPoint(x + 90, y + 82);
        segments[G].addPoint(x + 95, y + 89);
        segments[G].addPoint(x + 90, y + 96);
        segments[G].addPoint(x + 20, y + 96);
        segments[G].addPoint(x + 15, y + 89);
    }

}