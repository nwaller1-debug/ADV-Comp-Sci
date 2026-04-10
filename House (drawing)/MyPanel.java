import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    public MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        // to-do: draw the house!

        // Adds shapes to an ArrayList, converting them all to Polygons
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        // building
        shapes.add(new Rectangle(125, 125, 125, 125));
        shapes.get(0).setFillColor(Color.green);

        // door
        shapes.add(new Rectangle(160, 250, 50, 200));
        shapes.get(1).setFillColor(Color.orange);

        shapes.add(new Oval(95, 90, 185, 185));
        shapes.get(2).setFillColor(Color.green);

        shapes.add(new Oval(300, 440, 18, 10));
        shapes.get(3).setFillColor(Color.black);

        shapes.add(new Oval(70, 440, 18, 10));
        shapes.get(3).setFillColor(Color.black);

        shapes.add(new Oval(80, 370, 18, 10));
        shapes.get(3).setFillColor(Color.black);

        shapes.add(new Triangle());
        shapes.get(3).setFillColor(Color.black);

        shapes.add(new Triangle(new int[] { 360, 390, 375 }, new int[] { 165, 135, 125 }));
        shapes.get(3).setFillColor(Color.black);

        shapes.add(new Square(370, 110, 20));
        shapes.get(1).setFillColor(Color.red);

        // roof
        // shapes.add(new Triangle(new int[]{125, 250, 375}, new int[]{125, 75, 125}));

        // Draws all the shapes in the ArrayList using that shape's draw method
        for (Shape p : shapes) {
            p.draw(g);
        }

    }

}
