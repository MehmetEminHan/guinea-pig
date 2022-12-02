import Composition.Hyundai;
import MethodOverriding.Subclass;
import objectClass.Test;
import testPackage.TestPackageClass;

import java.util.Scanner;

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
        Test test = new Test();
        Test test1 = new Test();
        System.out.println(test);
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
        System.out.println(test.getClass());

    }


}
