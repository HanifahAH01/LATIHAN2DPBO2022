#include <string>
#include "Product.cpp"

using namespace std;

class Hardware : public Product
{
private:
	//deklarasi
	string model;
	string brand;

public:
	//Constructor 
	Hardware(string model, string brand)
	{
		this->model = model;
		this->brand = brand;
	};

  	//Constructor 
	Hardware(){

	};

	// get set
	void setModel(string model)
	{
		this->model = model;
	};

	string getModel()
	{
		return this->model;
	};

	void setBrand(string brand)
	{
		this->brand = brand;
	};

	string getBrand()
	{
		return this->brand;
	};
};