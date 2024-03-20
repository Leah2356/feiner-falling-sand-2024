package feiner.fallingsand;

import javax.swing.*;
import java.awt.*;

public class SandComponent extends JComponent {

    private final Sand sand;
    private int[][] field;

    public SandComponent(Sand sand) {
        this.sand = sand;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; y++) {
                g.fillRect(3, 3, 3, 3);
            }
        }
    }
}
