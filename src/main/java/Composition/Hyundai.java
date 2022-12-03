package Composition;

public class Hyundai {
    String model = "Sonata";
    Engine hyundaiSonataEngine;



    @Override
    public String toString() {
        return "Hyundai{" +
                "model='" + model + '\'' +
                ",engine power=" + hyundaiSonataEngine.enginePower +
                '}';
    }
}
