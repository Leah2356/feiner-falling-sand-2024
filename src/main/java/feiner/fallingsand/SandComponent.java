package feiner.fallingsand;

import javax.swing.*;
import java.awt.*;

public class SandComponent extends JComponent {

    private final Sand sand;
    private int[][] field;

    public SandComponent(Sand sand) {
        this.sand = sand;
        this.field = sand.getField();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        sand.fall();
        repaint();
        field = sand.getField();
        g.setColor(Color.BLUE);
        // draw the sand
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                if (field[y][x] == 1) {
                    g.fillRect(x * 3, y, 3, 3);
                }
            }
        }
    }
}