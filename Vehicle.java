package abstractInJava;

public  abstract class Vehicle  implements Transport{
    private int noOfTires;
    public abstract  void  makeStartSound();
    public void getSetGo(){
        System.out.println("going to place");
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void commute(){
        System.out.println(" vrooommmm...");
    }
}
