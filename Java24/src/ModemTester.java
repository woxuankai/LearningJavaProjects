public class ModemTester {
    public static void main(String[] args) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.speed = 60000;
        gateway.speed = 50000;
        System.out.println("Try the cable modem:");
        surfBoard.displaySpeed();
        surfBoard.connection();
        System.out.println("T  ry the DSL modem:");
        gateway.displaySpeed();
        gateway.connection();
    }
}