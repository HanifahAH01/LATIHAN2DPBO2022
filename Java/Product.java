public class Product{
    
    private int price; //Deklarasi Atribut price
    private int idProduct; //Deklarasi Atribut id produk
    
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
}