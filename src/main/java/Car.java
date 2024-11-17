
public abstract class Car {
    int yearOfManufacture;
    String transmissia;
    String color;
    String engine;
    String carBrand;
    String privod;

    Car(int yearOfManufacture, String transmissia, String color, String engine, String carBrand, String privod) {
        this.yearOfManufacture = yearOfManufacture;
        this.transmissia = transmissia;
        this.color = color;
        this.engine = engine;
        this.carBrand = carBrand;
        this.privod = privod;
    }

    public String getCarInfo() {
        return "год выпуска: " + yearOfManufacture + ", коробка передач: " + transmissia +
                ", цвет: " + color + ", двигатель: " + engine +
                ", марка автомобиля: " + carBrand + ", привод: " + privod;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public abstract String getCarType();
}






