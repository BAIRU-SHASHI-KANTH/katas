package kata;

public class Toggle implements LightChanger{
    @Override
    public int execute(int value) {
        //for scenario 1 ->  return (value==1)?0:1;

        //for scenario 2  (Brightness)
        return value+2;
    }
}
