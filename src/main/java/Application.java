import generic.GenericMethod;
import abstraction.AbstracSubClass;
import abstraction.AbstractClass;

public class Application {
    public static void main(String[] args) {
        /*
        int second = scan.nextint();
        int minute = second / 60;
        int minutemod = (second % 60) ;
        system.out.println(+minute +"."+minutemod);*/

/*
        Scanner scan = new Scanner(System.in);
        int firstValue = scan.nextInt();
        int secondValuse = scan.nextInt();

        int a = (firstValue > secondValuse) ? (1) : (0);
        System.out.println(a);
        Application application = new Application();
        System.out.println(application.addition(firstValue,secondValuse));
        TestClass testClass = new TestClass();
        TestPackageClass testPackageClass = new TestPackageClass();
        testPackageClass.defaultMethod();*/
/*      Hyundai hyundaiSonata = new Hyundai();
        System.out.println(hyundaiSonata.toString());*/

        AbstractClass subClass = new AbstracSubClass();
        subClass.method();
        subClass.sayHello(12);
        Integer a = 13;
        GenericMethod.genericMethod(a);



    }


}
