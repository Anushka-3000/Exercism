public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualTimeInOven)
    {
        return (40 - actualTimeInOven);
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers)
    {
        return (2 * numberOfLayers);
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutesInOven)
    {
        return ((numberOfLayers * 2) + numberOfMinutesInOven);
    }
}