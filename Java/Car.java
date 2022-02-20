class Car {
    private Integer id;
    private String licence;
    private Account driver;
    private Integer passeInteger;

    public Car(String license, Account driver) {
        this.licence = license;
        this.driver = driver;
        //this.passeInteger = 4;
        //System.out.println("Passenger: " + passeInteger);
    }

    void printDataCar() {
        if(passeInteger != null) {
            System.out.println("License: " + licence + " Driver " + driver.name + " Passengers: " + passeInteger);
        }
        
    }

    public Integer getPasseInteger() {
        return passeInteger;
    }
    public void setPasseInteger(Integer passeInteger) {
        if(passeInteger==4) {
            this.passeInteger = passeInteger;
        } else {
            System.out.println("Necesitas asignar 4 passenger");
        }
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
