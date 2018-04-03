package lab1and2;

import lab1and2.models.Figure;
import lab1and2.models.Rectangle;
import lab1and2.pool.FigurePool;

public class Main {

    public static void lab1(){
        Figure figure = new Rectangle("Pasha", 1,2,3,4);
        //figure.draw();
        FigurePool pool = new FigurePool();
        pool.setFigure(figure);
        pool.draw();
    }

    public static void lab2(){
        Class figureClass = null;
        try {
            figureClass = Class.forName("lab1and2.models.Rectangle") ;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Создается класс с конструктором по умолчанию
        try {
            Figure figure = (Figure) figureClass.newInstance();
            figure.draw();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {



    }
}
