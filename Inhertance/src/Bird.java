public class Bird extends Animal{
    private int wings;
    private String colour;

    public Bird (String type,double weight ,int wings, String colour){
        super(type, weight < 5 ? "small" : "big",weight);
        this.wings = wings;
        this.colour = colour;
    }

    private void flybird(){
        System.out.println("Flying");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println(type + " is chirping");
    }

    @Override
    public void move(String speed) {
        flybird();
        if (speed == "fast"){
        System.out.println(type + " is fast");
    }

    }

    @Override
    public String toString() {
        return "BIrd{" +
                "wings=" + wings +
                ", colour='" + colour + '\'' +
                "} " + super.toString();
    }
}
