class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");   
        UberX uberX = new UberX("246HYS",new Account("Angel Ardon","2398367230114"),"Toyota","Yaris");
        uberX.setPasseInteger(4);
        uberX.printDataCar();

        /*UberVan uberVan = new UberVan("617DQF",new Account("Lesli Jerez","234567890121"),);
        car2.passeInteger = 3;
        car2.printDataCar();*/

    }
}