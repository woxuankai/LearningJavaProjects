class Root {
    public static void main(String[] arguments){
        int number =255;
        System.out.println("The square root of "
                + number
                +" is "
                + Math.sqrt(number));
        Modem device = new Modem();
        device.speed = 1324;
        device.displaySpeed();
    };
}