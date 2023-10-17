package factoryMethod;

public class GetCarPurpose {

    public CareForHire getPurpose(String purpose){
        if ( purpose.equalsIgnoreCase("Wedding")){
            return  new HireForWedding();
        }
        if (purpose.equalsIgnoreCase("Funeral")){
            return new HireForBurial();
        }
        return null;
    }
}
