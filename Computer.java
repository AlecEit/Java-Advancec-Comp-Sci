public class Computer{
    private boolean isOn;
    private int battery;
    private String color;
    private boolean hasPictureOfLebron;
    private String pictureOfLebron;

    public void use(int minutesUsed){
        if(battery > 0){
            battery = battery - minutesUsed;
        }
    }
    public void charge(int minutesCharged){
        battery = 100;
        System.out.println("Computer is fully charged");
    }
    Computer(){
        isOn = false;
        battery = 80;
        color = "Black";        
        hasPictureOfLebron = true;
    };
    public void makeBackgroundLebron(String background) {
        if (hasPictureOfLebron) {
            background = pictureOfLebron;
        }
    }
}