package univtln.fr.i111.jlaffaill662;

import univtln.fr.i111.jlaffaill662.Figures.Cercle;
import univtln.fr.i111.jlaffaill662.Figures.Figure;
import univtln.fr.i111.jlaffaill662.Figures.Rectangle;

public class Test1 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle();
        Cercle c1 = new Cercle();

        System.out.println(r.getId());
        System.out.println(r2.getId());
        System.out.println(c1.getId());

        Figure[] figures = new Figure[]{r, r2, c1};


        System.out.println("Area Sum : " + areaSum);
    }
}
