package univtln.fr.i111.jlaffaill662.Figures;

import java.util.ArrayList;
import java.util.List;

public class Polygone extends Figure{
    private static int cpt = 1;

    public Polygone() {
        super('P', cpt);
        this.points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(3, 5));
        points.add(new Point(5, 1));
        points.add(new Point(4, -3));
        points.add(new Point(2, -4));
        cpt++;
    }

    public Polygone(char type, int id){
        super(type, id);
    }

    @Override
    public int getAire() {
        int sum = 0;
        for (int i = 0; i < this.points.size() - 1; i++){
            Point p = this.points.get(i);
            Point p1 = this.points.get(i+1);
            sum += p.getX() * p1.getY() - p1.getX() * p.getY();
        }

        sum *= 0.5;
        return sum;
    }
}
