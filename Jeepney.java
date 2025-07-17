public class Jeepney extends Vehicle implements Public{

    private int fare;

    public Jeepney (String startPoint, String endPoint, int capacity)
    {
        super(startPoint, endPoint, capacity);
        this.fare = 7;
    }

    public int computeFare(int d){
        if (d > 4){
            return this.fare += d-4;
        }
        else
            return this.fare;
    }

    @Override
    public void display(){
        System.out.println("Vehicle: Jeepney");
        super.display();
        System.out.println(this.fare);
    }
}
