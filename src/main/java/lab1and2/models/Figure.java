package lab1and2.models;

public abstract class Figure {

    private String name;

    public Figure(){

    }

    public Figure(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void draw();

}
