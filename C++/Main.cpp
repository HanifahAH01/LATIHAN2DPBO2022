#include <string>
#include <iostream>
#include "Memory.cpp"

using namespace std;

int main()
{
	//output
	Memory klasifikasi = Memory("3 Ghz", "8 GB", "RTX");
	klasifikasi.setIdProduct(1019);
	klasifikasi.setPrice(4000000);
	klasifikasi.setBrand("Oppo");
	klasifikasi.setModel("A15");

	//menampilkon output
	cout << "======= Klasifikasi =======" << endl;
	cout << "Id Product : " << klasifikasi.getIdProduct() << endl;
		cout << "Price : " << klasifikasi.getPrice() << endl;
		cout << "Brand : " << klasifikasi.getBrand() << endl;
		cout << "Model : " << klasifikasi.getModel() << endl;
		cout << "Frequency Memory : " << klasifikasi.getFrequency() << endl;
		cout << "Memory	Size : " << klasifikasi.getMemorySize() << endl;
		cout << "Support Cuda : " << klasifikasi.getSupportCuda() << endl;
	//klasifikasi.Output();
	cout << "===========================" << endl;

	return 0;
}