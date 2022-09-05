package kata;

public class TurnOff implements LightChanger{
    @Override
    public int execute(int value) {
        //for scenario 1 -> return 0;

        //for scenario 2  (Brightness)
        if(value==0) {
            return 0;
        }
        return value-1;
    }
}
