interface Vehicle
{
    int SPEED = 100;

    void start();

    default void stop()
    {
        System.out.println("Vehicle Stopped");
    }

    static void info()
    {
        System.out.println("Vehicle Interface");
    }
}

class Car implements Vehicle
{
    public void start()
    {
        System.out.println("Car Started");
    }
}

class InterfaceExample
{
    public static void main(String[] args)
    {
        Vehicle v = new Car();

        v.start();

        v.stop();

        System.out.println(Vehicle.SPEED);

        Vehicle.info();
    }
}