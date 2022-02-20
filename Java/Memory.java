public class Memory extends Hardware 
{   
    private String frequency; //deklarasi atribut frequency
    private String memorySize; //deklarasi atribut memori
    private String supportsCuda; //dekarasi atribut cuda
    
    // constructors
	Memory(String frequency, String memorySize, String supportsCuda) {
		this.frequency = frequency;
		this.memorySize = memorySize;
		this.supportsCuda = supportsCuda;
	}
    
    //Constructor 
    Memory() {
    }

    // getter and setter
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    public String getFrequency() {
        return frequency;
    }
    
    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }
    public String getMemorySize() {
        return memorySize;
    }
    
    public void setSupportsCuda(String supportsCuda) {
        this.supportsCuda = supportsCuda;
    }
    public String getSupportsCuda() {
        return supportsCuda;
        
    }

    public void Output() {
		System.out.println("Id Product : " + this.getidProduct());
		System.out.println("Price : " + this.getPrice());
		System.out.println("Brand : " + this.getBrand());
		System.out.println("Model : " + this.getModel());
		System.out.println("Frequency Memory : " + this.getFrequency());
		System.out.println("Memory Size : " + this.getMemorySize());
		System.out.println("Support Cuda : " + this.getSupportsCuda());
	}
    
    
}