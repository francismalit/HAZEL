package test;

/**
 * Created by hazel on 1/29/14.
 */
public class Iphone5s extends Phone{
    String appleID;
    int cameraResolution;
    String phoneColor;
    int memory;

    public Iphone5s(){

    }

    public Iphone5s(String appleID, String phoneColor, int cameraResolution, int memory) {
        this.appleID = appleID;
        this.phoneColor = phoneColor;
        this.cameraResolution = cameraResolution;
        this.memory = memory;
    }

    public Iphone5s(String appleID, String phoneColor, int cameraResolution, int memory, int cellNumber, int price) {
        super(cellNumber,price);
        this.appleID = appleID;
        this.phoneColor = phoneColor;
        this.cameraResolution = cameraResolution;
        this.memory = memory;
    }

    public Iphone5s(String appleID, String phoneColor, int cameraResolution, int memory, int cellNumber, int screenHeight, int screenWidth) {
        super(cellNumber, screenHeight, screenWidth);
        this.appleID = appleID;
        this.phoneColor = phoneColor;
        this.cameraResolution = cameraResolution;
        this.memory = memory;
    }

    public void setAppleID(String appleID) {this.appleID = appleID;}

    public void setCameraResolution(int cameraResolution) {this.cameraResolution = cameraResolution;}

    public void setPhoneColor(String phoneColor) {this.phoneColor = phoneColor;}

    public void setMemory(int memory) {this.memory = memory;}

    public String getAppleID() {return appleID;}

    public int getCameraResolution() {return cameraResolution;}

    public String getPhoneColor() {return phoneColor;}

    public int getMemory() {return memory;}

    public String get5sSpecs(){
        return "Phone Color: " + this.phoneColor + " Camera Resolution:" + this.cameraResolution + " Memory:" + this.memory;
    }
}

