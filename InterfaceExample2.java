interface Vehicle
{
    int SPEED = 120;

    void start();

    default void stop()
    {
        System.out.println("Vehicle Is Stopped");
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
        System.out.println("Car IsStarted");
    }
}

class InterfaceExample2
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