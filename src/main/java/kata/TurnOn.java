package kata;

public class TurnOn implements LightChanger{
    @Override
    public int execute(int value) {

        //for both scenarios
        return value+1;
    }
}
