public class Vehicle {

    protected String startPoint;
    protected String endPoint;
    protected int passengers;
    protected final int CAPACITY;

    public Vehicle(String startPoint, String endPoint, int capacity){
        this.passengers = 0;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.CAPACITY = capacity;

    };
    public void boardPassengers(int p){
        if(getPassengers() < getCapacity()) {
            this.passengers += p;
            System.out.println(getPassengers() + " boarded. There are currently " +
                    getPassengers() + "/" + getCapacity() + "on board.");
        } else
            System.out.println("Maximum capacity reached. Passengers not boarded.");

    }

    public int getCapacity(){
        return this.CAPACITY;
    }
    public int getPassengers(){
        return this.passengers;
    }

    public String getStartPoint(){
        return this.startPoint;
    }
    public String getEndPoint(){
        return this.endPoint;
    }

    public void display(){
        System.out.println( "\nCapacity: " + getCapacity()
                            + "\nStart Point: " + getStartPoint()
                            + "\nEnd Point: " + getEndPoint());
    }

}
