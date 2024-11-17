import java.util.ArrayList;
import java.util.List;

public class Main {
    //it's main origin

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();

        list.add(new Audi(2015, "avtomat", "grey", "benzin", "a4", "quattro"));
        list.add(new Audi(2020, "avtomat", "black", "dizel", "a6", "quattro"));
        list.add(new Mercedes(2016, "avtomat", "white", "dizel", "e-class", "zadnii"));
        list.add(new Mercedes(2017, "avtomat", "red", "benzin", "c-class", "zadnii"));
        list.add(new Toyota(2009, "avtomat", "green", "benzin", "camry", "perednii"));
        list.add(new Toyota(2012, "avtomat", "brown", "benzin", "prius", "perednii"));
        list.add(new Honda(2004, "mehanika", "blue", "benzin", "civic", "perednii"));
        list.add(new Honda(2014, "avtomat", "yellow", "benzin", "crv", "perednii"));
        list.add(new Lada(2004, "mehanika", "white", "benzin", "kalina", "zadnii"));
        list.add(new Lada(2024, "avtomat", "black", "benzin", "vesta", "perednii"));

        showCarsAfter2006(list);
        changeColor(list);
        printCarTypes(list);
        showCarsOnPetrol(list);
    }

    public static void showCarsAfter2006(List<Car> list) {
        for (Car car : list) {
            if (car.yearOfManufacture > 2006) {
                System.out.println(car.getCarInfo());
            } else {
                System.out.println(car.getCarInfo() + " - устаревший авто");
            }
        }
    }

    public static void changeColor(List<Car> list) {
        for (Car car : list) {
            if (car.color.equals("green")) {
                car.changeColor("red");
                System.out.println("Цвет автомобиля " + car.carBrand + " изменен на красный.");
            }
        }
    }

    public static void printCarTypes(List<Car> list) {
        for (Car car : list) {
            System.out.println(car.getCarType());
        }
    }

    public static void showCarsOnPetrol(List<Car> list) {
        System.out.println("Автомобили на бензине: ");
        for (Car car : list) {
            if (car.engine.equals("benzin")) {
                System.out.println(car.getCarInfo());
            } else {
                System.out.println("Автомобили на бензине отсутствуют");
            }
        }
    }
}
