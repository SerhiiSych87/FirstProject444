package Homework9.Task2;

public class Address {

    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {

        Address adress1 = new Address();
        adress1.setIndex(11500);
        adress1.setCountry("Ukraine");
        adress1.setCity("Korosten");
        adress1.setHouse(117);
        adress1.setApartment(90);

        System.out.println("YOUR ADRESS ARE:");

        System.out.println(adress1.index+" "+adress1.country+" "+adress1.city+" "+adress1.house+" "+ adress1.getApartment());

    }


}
