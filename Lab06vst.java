// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet {

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);


        // Draw Random Lines
        Random rand = new Random(12345);
        for (int x = 0; x < 101; x++) {
            int x1 = rand.nextInt(350) + 10;
            int y1 = rand.nextInt(250) + 50;
            int x2 = rand.nextInt(300) + 10;
            int y2 = rand.nextInt(250) + 10;
            int red = rand.nextInt(255 - 1 - 1 - 1);
            int green = rand.nextInt(255 - 1 - 1 - 1);
            int blue = rand.nextInt(255 - 1 - 1 - 1);
            g.setColor(new Color(red, green, blue));
            g.drawLine(x1, y1, x2, y2);
        }

        // Draw Random Squares

        int maxx = 740;
        int maxy = 250;
        int minx = 400;
        int miny = 10;
        for (int x = 0; x < 101; x++) {
            int x1 = rand.nextInt(maxx - minx - 1) + minx;
            int y1 = rand.nextInt(maxy - miny - 1) + miny;
            int red = rand.nextInt(255 - 1 - 1 - 1);
            int green = rand.nextInt(255 - 1 - 1 - 1);
            int blue = rand.nextInt(255 - 1 - 1 - 1);
            g.setColor(new Color(red, green, blue));
            g.fillRect(x1, y1, 50, 50);
        }

        // Draw Random Circles


        maxx = 300;
        maxy = 500;
        minx = 10;miny = 300;
        for (int x = 0; x < 101; x++) {
            int x1 = rand.nextInt(maxx - minx + 1) + minx;
            int y1 = rand.nextInt(maxy - miny + 1) + miny;
            int red = rand.nextInt(255 - 1 - 1 - 1);
            int green = rand.nextInt(255 - 1 - 1 - 1);
            int blue = rand.nextInt(255 - 1 - 1 - 1);
            g.setColor(new Color(red, green, blue));
            g.drawOval(x1, y1, x, x);
        }


        // Draw 3-D Box
        g.setColor(Color.YELLOW);
        g.fillRect(500, 350, 100, 100);
        g.setColor(Color.red);
        g.fillRect(550, 400, 100, 100);

        Polygon cube = new Polygon();
        cube.addPoint(600, 350);
        cube.addPoint(600, 400);
        cube.addPoint(650, 400);
        g.setColor(Color.blue);
        g.fillPolygon(cube);

        Polygon cube2 = new Polygon();
        cube2.addPoint(500, 350);
        cube2.addPoint(550, 400);
        cube2.addPoint(550, 500);
        cube2.addPoint(500, 450);
        g.setColor(Color.green);
        g.fillPolygon(cube2);


    }
}



    
 