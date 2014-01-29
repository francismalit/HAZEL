/**
 * Created by hazel on 1/29/14.
 */
import test. *;

public class Main {
    public static void main(String[] args) {
    Iphone5s micaPhone = new Iphone5s("Mica02","silver",8,16,4002689,320,480);
    Iphone5s christinePhone = new Iphone5s("kainis", "gold", 8,32, 8004279,37000);
    Gadgets phone = new Gadgets(21343, "Battery", 1000);
    Phone samsung = new Phone(4002649,320,480,42342, "Battery", 36000);
    Gadgets S4 = new Phone(8465290,32754, "Battery", 25000 );

    System.out.println("USING CLASS GADGETS ALONE for display");
    System.out.println(phone.getGadgetsDetails());
    System.out.println();
    System.out.println("USING CLASS PHONE ALONE for display");
    System.out.println(samsung.getPhoneCharacteristics());
    System.out.println();
    System.out.println("USING CLASS IPHONE5S ALONE for display");
    System.out.println("Iphone 5s Specs: ");
    System.out.println(micaPhone.get5sSpecs());
    System.out.println();
    System.out.println("GADGETS AND PHONE MANIPULATION:");
    System.out.println(S4.getPrice());
    System.out.println();
    System.out.println("ALL CLASS USED:");
    System.out.println("Current Price:");
    System.out.println(christinePhone.getPrice());
    System.out.println("Number:");
    System.out.println(christinePhone.getCellNumber());
    System.out.println();
    christinePhone.setPrice(27000);
    System.out.println("New Price:");
    System.out.println(christinePhone.getPrice());

    //System.out.println(micaPhone.getPhoneCharacteristics());
    }
}
