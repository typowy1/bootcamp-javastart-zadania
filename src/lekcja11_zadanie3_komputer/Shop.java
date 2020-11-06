package lekcja11_zadanie3_komputer;

public class Shop {
    public static void main(String[] args) {

        try {
            Processor processor1 = new Processor("Intel Core i3", "Intel",
                    "i3-10XXX", 3600, 90, 4);
            Memory memory1 = new Memory("HyperX DDR4", "Kingston", " HX421C14FB/16",
                    2133, 80, 16384);
            HardDrive hardDrive1 = new HardDrive(" SEAGATE", "BarraCuda", "X1123334",
                    1000);
            Computer computer = new Computer(processor1, memory1, hardDrive1);

            System.out.println(computer.toString());
            memory1.overclock();
            processor1.overclock();
            System.out.println(computer.toString());

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }
}
