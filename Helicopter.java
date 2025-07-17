public class Helicopter extends Vehicle{

    public Helicopter (String startPoint, String endPoint, int capacity)
    {
        super(startPoint, endPoint, capacity);
    }

    @Override
    public void display(){
        System.out.println("Vehicle: Helicopter");
        super.display();
    }
}
