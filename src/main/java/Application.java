import generic.GenericMethod;
import abstraction.AbstracSubClass;
import abstraction.AbstractClass;
import stream.User;

import java.util.*;
import java.util.stream.*;

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



        /*
        * AbstractClass subClass = new AbstracSubClass();
        subClass.method();
        subClass.sayHello(12);
        Integer a = 13;
        GenericMethod.genericMethod(a);

        Runnable runnable = System.out::println;*/


        /*ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(4);
        integerArrayList.add(7);
        integerArrayList.add(6);



        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(2);
        integerLinkedList.add(5);


        Iterator<Integer> iteratorArray = integerArrayList.iterator();
        Iterator<Integer> iterator = integerLinkedList.iterator();
        while (iteratorArray.hasNext()){
            System.out.println(iteratorArray.next());
        }*/


        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"example@gmail.com","ahmet"));
        userList.add(new User(2,"example2@gmail.com","mehmet"));
        userList.add(new User(3,"example3@gmail.com","osman"));
        userList.add(new User(4,"example4@gmail.com","william"));
        userList.add(new User(7,"example5@gmail.com","Bridget"));
        userList.add(new User(6,"example6@gmail.com","Adam"));
        userList.add(new User(9,"example7@gmail.com","Abraham"));
        userList.add(new User(8,"example8@gmail.com","Tarek"));

        userList.stream().forEach(users -> System.out.println(users.toString()));
//        userList.stream().forEach(User::toString);
//        userList.stream().forEach(User::talk);
        userList.stream().forEach(user -> user.talk());


        List<User> filteredList = userList.stream().filter(user -> user.getId()>5).collect(Collectors.toList());
        filteredList.stream().forEach(user -> System.out.println(user));

        









    }


}
