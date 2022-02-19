public class Main {
    public static void main(String[] args) {
        System.out.println("======= Klasifikasi =======");
        
        Product pr = new Product();
        pr.setidProduct(1019);
        pr.setPrice(4000000);
        pr.output_product(); //keluaran untu product

        Hardware hd = new Hardware();
        hd.setBrand("Oppo");
        hd.setModel("A15");
        hd.output_hardware(); //keluaran untuk hardware
        
        Memory mr =  new Memory();
        mr.setFrequency("3 Ghz");
        mr.setMemorySize("8 GB");
        mr.setSupportsCuda("RTX");
        mr.output_memory(); //keluaran untuk memori

        System.out.println("===========================");
    }
    


}
