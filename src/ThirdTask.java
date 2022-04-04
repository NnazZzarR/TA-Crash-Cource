import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdTask {
    public void firstItem() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the radius of circle :");
        String radius = br.readLine();
        int intRadius;
        try {
            intRadius = Integer.parseInt(radius);
            System.out.println("Perimeter : " + 2 * intRadius + " pi ");
            System.out.println("Area : " + Math.pow(intRadius, 2) + " pi ");
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
    }

    public void secondItem() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live, " + name + "?");
        String address = br.readLine();
        System.out.println("Information about you:");
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
    }

    public void thirdItem()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the prise of 1 minute of call in ");
        System.out.print("Canada : ");
        String CanadaPrise = br.readLine();
        System.out.print("England : ");
        String EnglandPrise = br.readLine();
        System.out.print("Turkey : ");
        String TurkeyPrise = br.readLine();
        System.out.println("How many you want to talk?");
        System.out.print("1 case : ");
        String firstValue = br.readLine();
        System.out.print("2 case : ");
        String secondValue = br.readLine();
        System.out.print("3 case : ");
        String thirdValue = br.readLine();
        try{
            int intCanadaPrise = Integer.parseInt(CanadaPrise);
            int intEnglandPrise = Integer.parseInt(EnglandPrise);
            int intTurkeyPrise = Integer.parseInt(TurkeyPrise);
            int intfirstValue = Integer.parseInt(firstValue);
            int intsecondValue = Integer.parseInt(secondValue);
            int intthirdValue = Integer.parseInt(thirdValue);
            System.out.println("Country | " + firstValue + " | " + secondValue + " | " + thirdValue);
            System.out.println("Canada  |" + intCanadaPrise * intfirstValue + " | " + intCanadaPrise * intsecondValue + " | " + intCanadaPrise * intthirdValue);
            System.out.println("England  |" + intEnglandPrise * intfirstValue + " | " + intEnglandPrise * intsecondValue + " | " + intEnglandPrise * intthirdValue);
            System.out.println("Turkey  |" + intTurkeyPrise * intfirstValue + " | " + intTurkeyPrise * intsecondValue + " | " + intTurkeyPrise * intthirdValue);
        }
        catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
    }
}
