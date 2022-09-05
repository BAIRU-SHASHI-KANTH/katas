package kata;

public class LightsMatrix {

     private int [][] lightsGrid = new int[1000][1000];

    public void applyInstruction(LightChanger instruction, Area area) {
        for (int x = area.getX1(); x <= area.getX2(); x++) {
            for (int y = area.getY1(); y <= area.getY2(); y++) {
                lightsGrid[x][y] = instruction.execute(lightsGrid[x][y]);
            }
        }
    }

    public int[][] getLightsGrid() {
        return lightsGrid;
    }
}
