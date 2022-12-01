package Composition;

public class Hyundai {
    String model = "Sonata";
    Engine hyundaiSonataEngine = new Engine(2,198);

    @Override
    public String toString() {
        return "Hyundai{" +
                "model='" + model + '\'' +
                ",engine power=" + hyundaiSonataEngine.enginePower +
                '}';
    }
}
