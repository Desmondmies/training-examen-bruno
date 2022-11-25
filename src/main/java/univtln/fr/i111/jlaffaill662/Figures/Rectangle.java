package univtln.fr.i111.jlaffaill662.Figures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rectangle extends Polygone {
    private static int cpt = 1;

    public Rectangle() {
        super('R', cpt);
        this.points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 1));
        points.add(new Point(1, -2));
        points.add(new Point(0, -2));
        cpt++;
    }

    public Rectangle(Point ... points){
        super('R', cpt);
        this.points = new ArrayList<>();
        this.points.addAll(Arrays.asList(points));
        cpt++;
    }

    public Rectangle(char type, int id){
        super(type, id);
    }
}
