import java.util.ArrayList;
import java.util.Map;
  
    class UberVan extends Car {
        Map<String, Map<String,Integer>> typeCarAccepted;
        ArrayList<String> seatMaterial;   
        private Integer passeInteger;

        public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted,ArrayList<String> seatMaterial) {
            super(license, driver);
            this.typeCarAccepted = typeCarAccepted;
            this.seatMaterial = seatMaterial;
        }

        @Override
        public void setPasseInteger(Integer passeInteger) {            
            //super.setPasseInteger(passeInteger);
            if(passeInteger==6) {
                this.passeInteger = passeInteger;
            } else {
                System.out.println("Necesitas asignar 6 passenger");
            }            
        }


    }

