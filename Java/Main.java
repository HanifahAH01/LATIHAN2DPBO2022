public class Main {

	public static void main(String[] args) {
	
		System.out.println("======= Klasifikasi =======");
		Memory klasifikasi = new Memory();

		klasifikasi.setidProduct(1019);
		klasifikasi.setPrice(4000000);
		klasifikasi.setBrand("Oppo");
		klasifikasi.setModel("A15");
		klasifikasi.setFrequency("3 Ghz");
		klasifikasi.setMemorySize("8 GB");
		klasifikasi.setSupportsCuda("RTX");
		
		//keluaran
		klasifikasi.Output();
        System.out.println("===========================");
	}

}