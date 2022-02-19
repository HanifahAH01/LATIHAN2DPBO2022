public class Memory extends Hardware 
{   
    private String frequency; //deklarasi atribut frequency
    private String memorySize; //deklarasi atribut memori
    private String supportsCuda; //dekarasi atribut cuda
    
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

    //Output Method
    public void output_memory(){
        System.out.println("Frequency Memory : "+ this.getFrequency());
        System.out.println("Memory Size : "+ this.getMemorySize());
        System.out.println("Supports Cuda : "+ this.getSupportsCuda());
    }
    
    
}