import stream.Gender;
import stream.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Application {
    public static void main(String[] args) {


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
        userList.add(new User(1, "example@gmail.com", "ahmet", Gender.MALE));
        userList.add(new User(2, "example2@gmail.com", "mehmet", Gender.MALE));
        userList.add(new User(3, "example3@gmail.com", "osman", Gender.MALE));
        userList.add(new User(4, "example4@gmail.com", "william", Gender.MALE));
        userList.add(new User(7, "example5@gmail.com", "Bridget", Gender.FEMALE));
        userList.add(new User(6, "example6@gmail.com", "Adam", Gender.MALE));
        userList.add(new User(9, "example7@gmail.com", "Abraham", Gender.MALE));
        userList.add(new User(8, "example8@gmail.com", "Serkan", Gender.FEMALE));


//        Filter
        userList.stream().filter(user -> user.getGender().equals(Gender.FEMALE)).forEach(user -> System.out.println(user));
        List<User> femaleUsers =
                userList.stream().filter(user -> user.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        femaleUsers.stream().forEach(user -> System.out.println(user));
        System.out.println("---------------------------\n------------------------");

//        Sort
        List<User> sortedByIdList = userList.stream().sorted(Comparator.comparing(User::getId))
                .collect(Collectors.toList());

        List<User> sortedReverseByIdList = userList.stream().sorted(Comparator.comparing(User::getId).reversed())
                .collect(Collectors.toList());


        sortedByIdList.stream().forEach(user -> System.out.println(user));
        System.out.println("---------------------------\n------------------------");
        sortedReverseByIdList.stream().forEach(user -> System.out.println(user));

//        All match
        boolean allMatch = userList.stream().allMatch(user -> user.getId() > 5);
        System.out.println(allMatch); /*False*/

//        Any match
        boolean anyMatch = userList.stream().anyMatch(user -> user.getId() > 5);
        System.out.println(anyMatch); /*True*/

//        None match
        boolean noneMatch = userList.stream().noneMatch(user -> user.getId() > 5);
        System.out.println(noneMatch); /*False*/

//        Max
        Optional<User> max = userList.stream().max(Comparator.comparing(User::getId));
        System.out.println(max);

//        Min
        Optional<User> min = userList.stream().min(Comparator.comparing(User::getId));
        System.out.println(min);

        int sumId = userList.stream().filter(x -> x.getId()<5).mapToInt(x -> x.getId()).sum();
        System.out.println("Total id ---> " + sumId);

       //        Min
        Optional<User> min = userList.stream().min(Comparator.comparing(User::getId));
        System.out.println(min);

        int sumId = userList.stream().filter(x -> x.getId()<5).mapToInt(x -> x.getId()).sum();
        System.out.println("Total id ---> " + sumId);
        System.out.println(userList.stream().filter(x -> x.getId() > 5).count());
        userList.stream().filter(Comparator.comparing(userList1))
        List<User> nullPointerList = new ArrayList<>();
        nullPointerList.add(new User(1, "biyikmehmetemin@gmail.com", "Mehmet", Gender.MALE));
        nullPointerList.add(new User(3, "ahmetakahs@gmail.com", "Ahmet", Gender.MALE));
        nullPointerList.add(new User(2, "sskhan@gmail.com", "Samet", Gender.MALE));
        nullPointerList.add(new User(4, "anilmirap@gmail.com", null, Gender.FEMALE));
        nullPointerList.add(new User(5, "serkantok@gmail.com", null, null));

//Find max value
        userList.stream().mapToInt(x -> x.getId).max().orElseThrow(NoSuchElementException::new);

    }


}
