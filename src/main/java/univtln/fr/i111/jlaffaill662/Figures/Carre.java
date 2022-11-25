package univtln.fr.i111.jlaffaill662.Figures;

import java.util.ArrayList;
import java.util.List;

public class Carre extends Rectangle{

    private static int cpt = 1;

    public Carre() {
        super('S', cpt);
        this.points = new ArrayList<>();
        points.add(new Point(-2, 2));
        points.add(new Point(2, 2));
        points.add(new Point(2, -2));
        points.add(new Point(-2, -2));
        cpt++;
    }

}
