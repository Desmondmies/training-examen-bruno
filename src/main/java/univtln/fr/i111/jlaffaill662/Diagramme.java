package univtln.fr.i111.jlaffaill662;

import univtln.fr.i111.jlaffaill662.Figures.Figure;
import univtln.fr.i111.jlaffaill662.Figures.Point;
import univtln.fr.i111.jlaffaill662.Figures.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diagramme {

    public class Builder{

        private List<Figure> figures = new ArrayList<>();

        public Builder add(Figure f){
            figures.add(f);
            return this;
        }

        public Diagramme build(){
            return new Diagramme(figures);
        }
    }

    private List<Figure> figures = new ArrayList<>();
    private static int cpt = 0;

    private int diagrammeId;

    public Builder getBuilder(){
        return new Builder();
    }

    public Diagramme() {
        this.diagrammeId = cpt;
        cpt++;
    }

    public Diagramme(List<Figure> figures){
        this();
        this.figures.addAll(figures);
    }

    public int getDiagrammeId() {
        return diagrammeId;
    }

    public int getAire(){
        int areaSum = 0;
        for (Figure f : figures){
            areaSum += f.getAire();
        }
        return areaSum;
    }

    public Rectangle getBoundingBox(){
        Point _p = figures.get(0).getFirstPoint();
        Point _p1 = figures.get(1).getFirstPoint();
        int xMin = _p.getX();
        int xMax = _p1.getX();
        int yMin = _p.getY();
        int yMax = _p1.getY();

        for (Figure f : figures){
            for (Point pt : f.getPoints()){
                int X = pt.getX();
                int Y = pt.getY();
                if (xMin > X) xMin = X;
                if (xMax < X) xMax = X;

                if (yMin > Y) yMin = Y;
                if (yMax < Y) yMax = Y;
            }
        }

        Point p1 = new Point(xMin, yMax);
        Point p2 = new Point(xMax, yMax);
        Point p3 = new Point(xMax, yMin);
        Point p4 = new Point(xMin, yMin);
        Rectangle boundingBox = new Rectangle(p1, p2, p3, p4);

        return  boundingBox;
    }
}
