import javax.print.event.PrintEvent;

public class Hardware extends Product{
    
    //Deklarasi Atribut
    private String brand;
    private String model;
    
    //Constructor 
    Hardware() {
    }
    
    //Constructor
    public Hardware(String brand, String model) {
        this.setBrand(brand);
        this.setModel(model);
    }
    
    //Get Set Methods
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    
    //Output Methods
    public void output_hardware(){
        System.out.println("Brand Hardware : "+ this.getBrand());
        System.out.println("Model Hardware : "+ this.getModel());

    }
    
    
    
}