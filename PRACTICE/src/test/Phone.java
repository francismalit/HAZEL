package test;

/**
 * Created by hazel on 1/29/14.
 */
public class Phone extends Gadgets{
    int cellNumber;
    int ScreenHeight;
    int ScreenWidth;


    public Phone(){

    }

    public Phone(int cellNumber, int screenHeight, int screenWidth) {
        this.cellNumber = cellNumber;
        this.ScreenHeight = screenHeight;
        this.ScreenWidth = screenWidth;
    }

    public Phone(int cellNumber,  int serialNo, String sourceOfEnergy, int price){
        super(serialNo, sourceOfEnergy, price);
        this.cellNumber = cellNumber;
    }

    public Phone(int cellNumber, int price){
    super(price);
    this.cellNumber = cellNumber;
    }

    public Phone(int cellNumber, int screenHeight, int screenWidth, int serialNo, String sourceOfEnergy, int price){
        super(serialNo, sourceOfEnergy, price);
        this.cellNumber = cellNumber;
        this.ScreenHeight = screenHeight;
        this.ScreenWidth = screenWidth;
    }

    public void setCellNumber(int cellNumber) {this.cellNumber = cellNumber;}

    public void setScreenHeight(int screenHeight) {ScreenHeight = screenHeight;}

    public void setScreenWidth(int screenWidth) {ScreenWidth = screenWidth;}

    public int getCellNumber() {return cellNumber;}

    public int getScreenHeight() {return ScreenHeight;}

    public int getScreenWidth() {return ScreenWidth;}

    public String getPhoneCharacteristics(){
        return "Phone Number: " + this.cellNumber + " ScreenHeight: " + this.ScreenHeight + " ScreenWidth: " + this.ScreenWidth;
    }
}

