package assignments.com.app.vehicles;

public class Vehicle {
    private String registrationNo;
    private String color;
    private double price;
    public Vehicle(String  registrationNo, String color, double price){
        this.registrationNo = registrationNo;
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString() {
        return registrationNo+" "+color+" "+price;
    }
    @Override
    public boolean equals(Object obj) {
        return this.registrationNo.equals(((Vehicle) obj).registrationNo);
    }
}
