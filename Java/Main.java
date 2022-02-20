public class Main {

	public static void main(String[] args) {
	
		Memory klasifikasi = new Memory();

		klasifikasi.setidProduct(1019);
		klasifikasi.setPrice(4000000);
		klasifikasi.setBrand("Oppo");
		klasifikasi.setModel("A15");
		klasifikasi.setFrequency("3 Ghz");
		klasifikasi.setMemorySize("8 GB");
		klasifikasi.setSupportsCuda("RTX");
		
		//keluaran
		System.out.println("======= Klasifikasi =======");
		System.out.println("Id Product : " + klasifikasi.getidProduct());
		System.out.println("Price : " + klasifikasi.getPrice());
		System.out.println("Brand : " + klasifikasi.getBrand());
		System.out.println("Model : " + klasifikasi.getModel());
		System.out.println("Frequency Memory : " + klasifikasi.getFrequency());
		System.out.println("Memory Size : " + klasifikasi.getMemorySize());
		System.out.println("Support Cuda : " + klasifikasi.getSupportsCuda());
        System.out.println("===========================");
	}

}