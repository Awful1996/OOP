package lab1and2.pool;

import lab1and2.models.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigurePool {
    private List<Figure> figures = new ArrayList<Figure>();

    public void setFigure(Figure figure){
        figures.add(figure);
    }

    public void draw(){
        for (Figure figure : figures){
            figure.draw();
        }
    }

}
