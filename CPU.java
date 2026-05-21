class CPU{
    int price;
    CPU(int price){
        this.price=price;
    }
    void displayCPU(){
    System.out.println("the price is "+price);
    }
    class processor{
    int cores;
    String manufacture;
    processor(int cores, String manufacture){
        this.cores=cores;
        this.manufacture=manufacture;
    }
    void displayprocessor(){
    System.out.println("the cores is "+cores);
        System.out.println("the manufacture is "+manufacture);
    }
}
static class RAM {
        int memory;
    String manufacture;
    RAM(int memory, String manufacture){
        this.memory=memory;
        this.manufacture=manufacture;
    }
    void displayRAM(){
    System.out.println("the memory is "+memory);
        System.out.println("the manufacture is "+manufacture);
    }
}
public static void main(String args[]){
    CPU cpu=new CPU(23000);
    CPU.processor p=cpu.new processor(8,"intel");
    CPU.RAM r=new CPU.RAM(16,"crucial");
    cpu.displayCPU();
    p.displayprocessor();
    r.displayRAM();

}

}

