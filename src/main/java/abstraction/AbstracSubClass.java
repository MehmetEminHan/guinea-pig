package abstraction;



public class AbstracSubClass extends AbstractClass implements Comparable<String>  {


    @Override
    public int sayHello(int a){
        int b =a;
        return b;
    }

    @Override
    public String method() {
        return "Abstract method from abstrac subclass";
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
