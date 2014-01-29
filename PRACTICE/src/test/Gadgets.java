package test;

/**
 * Created by hazel on 1/29/14.
 */
public class Gadgets {
    int serialNo;
    String sourceOfEnergy;
    int price;

    public Gadgets(int serialNo, String sourceOfEnergy, int price) {
        this.serialNo = serialNo;
        this.sourceOfEnergy = sourceOfEnergy;
        this.price = price;
    }

    public Gadgets(int price){
        this.price = price;
    }

    public Gadgets(){

    }

    public void setSourceOfEnergy(String sourceOfEnergy) {this.sourceOfEnergy = sourceOfEnergy;}

    public void setPrice(int price) {this.price = price;}

    public void setSerialNo(int serialNo) {this.serialNo = serialNo;}

    public int getPrice() {return price;}

    public String getSourceOfEnergy() {return sourceOfEnergy;}

    public int getSerialNo() {return serialNo;}

    public String getGadgetsDetails(){
        return "SerialNo: " + this.serialNo + " Price: " + this.price + " Source of Energy: " + this.sourceOfEnergy;
    }
}

