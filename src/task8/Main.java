package task8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//task 1
        List<Integer> integer1 = new ArrayList<>();
        integer1.add(140);
        integer1.add(210);
        integer1.add(130);
        integer1.add(210);
        integer1.add(140);
        integer1.add(600);
        System.out.println(integer1);
        System.out.println(showUnique(integer1));

        //task 2
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        chooseRandom(oneMillion(list1));
        chooseRandom(oneMillion(list2));//Linked list значительно дольше(именно при вызове случайного элемента) в силу его устройства,поскольку идет перебор элементов от первого, в поисках нужного.

// task3
        Map<User, Integer> gamePoints = new HashMap<>();
        gamePoints.put(new User("Ivan"), 7);
        gamePoints.put(new User("Larisa"), 6);
        gamePoints.put(new User("Masha"), 10);
        score(gamePoints);

    }

    // method task 1
    public static Set<Integer> showUnique(List<Integer> integers) {
        return new HashSet<>(integers);
        //method task 2

    }

    // method task 2
    public static List<Integer> oneMillion(List<Integer> integers) {
        for (int i = 0; i < 1000000; i++) {
            integers.add(i);
        }
        return integers;
    }

    public static void chooseRandom(List<Integer> integers) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            System.out.println(integers.get(random.nextInt(1000000)));
        }
    }

    //task 3
    public static void score(Map<User, Integer> gamePoints) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the player's name to know his score: ");
        String name = sc.next();
        for (Map.Entry<User, Integer> entry : gamePoints.entrySet()) {
            if (Objects.equals(entry.getKey().getName(), name)) {
                System.out.printf("Player %s has got %d points\n", name, entry.getValue());
            }

        }}}


