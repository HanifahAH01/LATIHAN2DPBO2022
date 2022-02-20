public class Main {

	public static void main(String[] args) {
		System.out.println("======= Klasifikasi =======");
		Memory klasifikasi = new Memory("3 Ghz", "8 GB", "RTX");

		klasifikasi.setidProduct(1019);
		klasifikasi.setPrice(4000000);
		klasifikasi.setBrand("Oppo");
		klasifikasi.setModel("A15");
		
		//keluaran
		klasifikasi.Output();
        System.out.println("===========================");
	}

}