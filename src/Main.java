import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        Set<String> set = new TreeSet<>();
//        set.add("A");
//        set.add("C");  // "C".compareTo("A") = 1
//        set.add("B");
//
//        System.out.println(set);
//
//
//
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(5);
//        treeSet.add(3); // 3.compareTo(5) = -1
//        treeSet.add(8); // 8.compareTo(5) = 1
//        treeSet.add(2); // 2.compareTo(5) = -1 -> 2.compareTo(3) = -1
//        treeSet.add(4); // 4.compareTo(5) = -1 -> 4.compareTo(3) = 1
//        treeSet.add(4); // 4.compareTo(5) = -1 -> 4.compareTo(3) = 1 -> 4.compareTo(4) = 0


                        //               5
                       //           3        8
                      //        2      4

//        Person ion = new Person("Andrei", 20, 5678);
//        Person andrei = new Person("Andrei", 20, 5678);
//
//        Set<Person> personSet = new TreeSet<>();
//        personSet.add(ion);
//        personSet.add(andrei); // andrei.compareTo(ion) -> this.age - ion.age = 0
//
//        System.out.println(personSet); //

//        Person ion = new Person("Andrei", 20, 5678);
//        Person andrei = new Person("Andrei", 20, 5678);
//
//        Map<Person, Integer> map = new TreeMap<>();
//        map.put(ion, 10);
//        map.put(andrei, 10);
//
////        System.out.println(map);
//
//        Set<Person> treeSet = new TreeSet<>();
//        treeSet.add(ion);
//        treeSet.add(andrei); // andrei.compareTo(ion) -> this.age - ion.age = 0
//
//        Set<Person> hashSet = new HashSet<>();
//        hashSet.add(ion); // 5678
//        hashSet.add(andrei); // 5678 (ion, andrei) -> ion.equals(andrei) == true
//
//        System.out.println(hashSet); // hashCode() -> 22 == 33
//        System.out.println(treeSet); // compareTo(idnp)


//        System.out.println(treeSet);


//        Set<Automobil> automobilSet = new TreeSet<>((a, b) ->  a.getDenumire().compareTo(b.getDenumire()));
//        automobilSet.add(bmw);
//        automobilSet.add(mercedes);

//        System.out.println(automobilSet);

        Automobil bmw = new Automobil(2020, "A Klass");
        Automobil bmw2 = new Automobil(2020, "A Klass");
        Automobil mercedes = new Automobil(2019, "C Klass");
//        Automobil bmw2 = new Automobil(2019, "5 Series");

        List<Automobil> automobils = new ArrayList<>();
        automobils.add(bmw);
        automobils.add(bmw2);
        automobils.add(mercedes);

        List<Automobil> sorted =  automobils.stream()
                .sorted((a, b) ->  a.getDenumire().compareTo(b.getDenumire()))
                .distinct()
                .collect(Collectors.toList());

//        automobils.sort((a, b) -> a.getDenumire().compareTo(b.getDenumire()));

        System.out.println(sorted);

        Comparator<Person> comparatorAuto = Comparator.comparing(Person::getIdnp);

        Person ion = new Person("Ion", 19, 5678);
        Person andrei = new Person("Andrei", 25, 5678);

        Set<Person> treeSet = new TreeSet<>(comparatorAuto);
        treeSet.add(ion);
        treeSet.add(andrei);
        System.out.println(treeSet);


         int indx  = Collections.binarySearch(automobils, bmw2, Comparator.comparing(Automobil::getDenumire));
         Automobil a = automobils.get(indx);

    }
}