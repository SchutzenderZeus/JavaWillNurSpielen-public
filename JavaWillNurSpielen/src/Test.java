import util.ShowInFrame;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(34.0, 2.0);
        Vertex v2 = new Vertex(42.0, 0.0);
        Vertex v3 = new Vertex(34.0, 2.0);
        Vertex v4 = new Vertex(0.0, 0.0);
        /*Vertex v5 = new Vertex(9.0, 7.0);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println("v1.x = "+v1.x);
        System.out.println("v1.length = "+v1.length());

        System.out.println(v1);
        v1.skalarMultMod(2);
        System.out.println(v1);
        System.out.println(v4);

        v1.addMod(v2);
        System.out.println(v2);

        v1.skalarMultMod(0.5);
        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v4));

        GeometricObject g1 = new GeometricObject(v2, 30, 40);
        GeometricObject g2 = new GeometricObject(v2, 30, 50);
        GeometricObject jannis = new GeometricObject(12, 56, 40, 60);
        GeometricObject lmao = new GeometricObject(52, 110, 30,30);

        System.out.println(g2);


        System.out.println(lmao.contains(jannis));*/

        ShowInFrame.show("Geht das?", new PaintablePanel(new PaintableOval(50,50,50,50, Color.blue)));


    }
}
