#include <string>
#include <iostream>
#include "Hardware.cpp"

using namespace std;

class Memory : public Hardware
{
private:
	//atribut
	string frequency;
	string memorySize;
	string supportCuda;

public:
	  //Constructor 
	Memory(string frequency, string memorySize, string supportCuda)
	{
		this->frequency = frequency;
		this->memorySize = memorySize;
		this->supportCuda = supportCuda;
	}
    
    //Constructor 
    Memory(){

    }

	//get set
	void setFrequency(string frequency)
	{
		this->frequency = frequency;
	}

	string getFrequency()
	{
		return this->frequency;
	}

	void setMemorySize(string memorySize)
	{
		this->memorySize = memorySize;
	}

	string getMemorySize()
	{
		return this->memorySize;
	}

	void setSupportCuda(string supportCuda)
	{
		this->supportCuda = supportCuda;
	}

	string getSupportCuda()
	{
		return this->supportCuda;
	}

	// method for print the class instance
	/*void Output()
	{
		// show the instance
		cout << "Id Product : " << this->getIdProduct() << endl;
		cout << "Price : " << this->getPrice() << endl;
		cout << "Brand : " << this->getBrand() << endl;
		cout << "Model : " << this->getModel() << endl;
		cout << "Frequency Memory : " << this->getFrequency() << endl;
		cout << "Memory	Size : " << this->getMemorySize() << endl;
		cout << "Support Cuda : " << this->getSupportCuda() << endl;
      
	}*/
};