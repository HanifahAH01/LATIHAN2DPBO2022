public class Product{
    
    //Deklarasi Atribut
    private int price;
    private int idProduct;
    
    //Constructor
    public Product() {
    }

    
    // getter and setter
    public void setidProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public int getidProduct() {
        return idProduct;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    //Output Method
    public void output_product(){
        System.out.println("Id Product : "+ this.getidProduct());
        System.out.println("Price : "+ this.getPrice());
    }

}