
package CustomizedComponents;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Mostafa Hussein
 */
public class roundedPanel extends JPanel{
    private Color backgroundColor;
            private int cornerRadius;

            public roundedPanel(LayoutManager layout, int radius) {
                super(layout);
                cornerRadius = radius;
            }

            public roundedPanel(LayoutManager layout, int radius, Color bgColor) {
                super(layout);
                cornerRadius = radius;
                backgroundColor = bgColor;
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(cornerRadius, cornerRadius);
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Draws the rounded panel with borders.
                if (backgroundColor != null) {
                    graphics.setColor(backgroundColor);
                } else {
                    graphics.setColor(getBackground());
                }
                graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
                graphics.setColor(getForeground());
                graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
            }
}
