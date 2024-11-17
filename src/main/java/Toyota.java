public class Toyota extends Car{
    Toyota(int yearOfManufacture, String transmissia, String color, String engine, String carBrand, String privod) {
        super(yearOfManufacture, transmissia, color, engine, carBrand, privod);
    }
    public String getCarType() {
        return "Toyota";
    }
}