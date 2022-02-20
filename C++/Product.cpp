#include <string>

using namespace std;

class Product
{
private:
	int idProduct;
	int price;

public:
	//Constructor 
	Product(int idProduct, int price)
	{
		this->idProduct = idProduct;
		this->price = price;
	};
    
    //Constructor 
    Product(){

	};

	//get set
	void setIdProduct(int idProduct)
	{
		this->idProduct = idProduct;
	};

	int getIdProduct()
	{
		return this->idProduct;
	};

	void setPrice(int price)
	{
		this->price = price;
	};

	int getPrice()
	{
		return this->price;
	}
};