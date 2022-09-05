package kata;

import java.util.Arrays;

public class ChristmasLights {
    public static void main(String[] args) {
        LightsMatrix lights = new LightsMatrix();
        TurnOn turnOn = new TurnOn();
        TurnOff turnOff = new TurnOff();
        Toggle toggle =new Toggle();

        lights.applyInstruction(turnOn, new Area(887, 9, 959, 629));
        lights.applyInstruction(turnOn, new Area(454, 398, 844, 448));

        lights.applyInstruction(turnOff, new Area(539, 243, 559, 965));
        lights.applyInstruction(turnOff, new Area(370, 819, 676, 868));
        lights.applyInstruction(turnOff, new Area(145, 40, 370, 997));
        lights.applyInstruction(turnOff, new Area(301, 3, 808, 453));

        lights.applyInstruction(turnOn, new Area(351, 678, 951, 908));

        lights.applyInstruction(toggle, new Area(720, 196, 897, 994));
        lights.applyInstruction(toggle,  new Area(831, 394, 904, 860));

        System.out.print("totalBrightnessLevel : "+Arrays.stream(lights.getLightsGrid())
                .flatMapToInt(Arrays::stream)
                .sum());

    }
}
