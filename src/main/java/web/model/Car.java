package web.model;

public class Car {

    private String model;
    private String color;
    private int engine;

    public Car(String model, String color, int engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getEngine() {
        return engine;
    }
}
