import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    
    Map<String, Map<String, Integer>> typerCarAcepted;
    ArrayList<String> seatsMaterial;
    
    public UberVan(String license, Account driver,
    Map<String, Map<String, Integer>> typerCarAcepted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typerCarAcepted = typerCarAcepted;
        this.seatsMaterial = seatsMaterial;

    }

}
