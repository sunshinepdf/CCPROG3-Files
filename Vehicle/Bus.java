
public class Bus extends Vehicle implements Public {

    private final int FARE;

    public Bus (String startPoint, String endPoint, int capacity)
    {
        super(startPoint, endPoint, capacity);
        this.FARE = 30;
    }

    public int computeFare(int d){
        return this.FARE;
    }

    @Override
    public void display(){
        System.out.println("Vehicle: Bus");
        super.display();
        System.out.println(this.FARE);
    }

}
