package univtln.fr.i111.jlaffaill662.Figures;

import java.util.List;

public abstract class Figure {

    private char type;
    private int id;

    protected List<Point> points;

    protected Figure(char type, int id) {
        this.type = type;
        this.id = id;
    }

    public char getType() {
        return type;
    }

    public int getId() { return id; }

    public List<Point> getPoints() {
        return points;
    }

    public Point getFirstPoint() { return points.get(0); }

    public abstract int getAire();

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Figure)) return false;

        Figure r = (Figure) obj;
        return r.getId() == getId();
    }

    @Override
    public int hashCode() {
        int res = 17;

        res = 31 * res + getType();
        return res;
    }
}
