import java.util.*;

class Main {
  public static void main(String[] args) {
         //Declare two sets A and B and populate them with the values above.
        Set<Integer> A =new HashSet<>(Arrays.asList(24, 26, 28, 30, 32));
        Set<Integer> B =new HashSet<>(Arrays.asList(30, 32, 35, 40, 45, 50));

        // Then iterate through each set to print out each value in turn.
        System.out.println("Set - One");
        Iterator<Integer> iterator = A.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }

        System.out.println("Set - Two");
        Iterator<Integer> iterator2 = B.iterator();
        while (iterator2.hasNext()) {
            int number = iterator2.next();
            System.out.println(number);
        }
        //Add 34 to each set,

        A.add(34);
        B.add(34);

        //find the Union of the sets – print out the answer.

        Set<Integer> unionAB =new HashSet<>();
            unionAB.addAll(B);
            unionAB.addAll(A);
        System.out.println("Union of Set - A and Set - B\n" + unionAB);

  }
}