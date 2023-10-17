package factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class GenerateCharge {
    public static void main(String[] args) throws IOException {
        GetCarPurpose carPurpose = new GetCarPurpose();
        System.out.print(" Enter purpose for hiring car: ¨");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String purpose = reader.readLine();
        System.out.print("Enter distance of place: ");

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in)) ;
        double distance = reader1.read();

        CareForHire careForHire = carPurpose.getPurpose(purpose);
        System.out.println(purpose);
        BigDecimal rate = careForHire.getRate();
        BigDecimal charge = careForHire.calculateCharge(distance, rate);
        System.out.println(careForHire.getRate());

        System.out.println("For the purpose of "+ purpose + " with a distance of "+ distance+ "Km the charge is $"+ charge);






    }
}
