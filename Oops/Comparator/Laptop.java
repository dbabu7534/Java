package Demo;

public class Laptop {
    private final String brand;
    private final int ram;
    private final String processor;
    private final int price;

    Laptop(String brand, int ram, String processor, int price){
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        this.price = price;
    }

    public int toPrice(){
        return price;
    }



    //All Class Objects Are Inheritance by the Object-Class . Object class is the parent class of any class
    @Override
    public String toString() {
        return "Brand : "+this.brand+" ---> "+this.price;
    }



    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }


}
