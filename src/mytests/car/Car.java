package mytests.car;

public class Car
{
    public static Door createDoor()
    {
        return new Door();
    }

    public static class Door
    {
        int width, height;
    }
}
