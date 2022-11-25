package univtln.fr.i111.jlaffaill662.Figures;

public class Cercle extends Figure {

    private static int cpt = 1;

    private Point origine;
    private int rayon;

    public Cercle(){
        this(new Point(0, 0), 5);
    }

    public Cercle(Point origine, int rayon) {
        super('C', cpt);
        this.origine = origine;
        this.rayon = rayon;

        cpt++;
    }

    @Override
    public int getAire() {
        return (int)Math.PI * (rayon*rayon);
    }
}
