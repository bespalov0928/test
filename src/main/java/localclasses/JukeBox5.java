package localclasses;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JukeBox5 {

    ArrayList<Song> songArrayList = new ArrayList<>();

    public static void main(String[] args) {
        new JukeBox5().go();
    }

    public <T, E> void go() {
        getSong();
//        System.out.println(songArrayList);
        Collections.sort(songArrayList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songArrayList, artistCompare);

        Integer[] strings = new Integer[]{1, 2, 3};

//        int z = sum(1,2);
//        Predicate<Integer> predicate = x -> x > 1;
//        System.out.println(predicate.test(sum(1,2)));

        Consumer<Integer> consumer = x -> System.out.println(x * 10);
        consumer.accept(sum(1,2));


//        Function<Integer, String> function = x -> "x";
//        int z = sum(1,2);
//        Function<Integer, String> function = x -> "x";
//        System.out.println(function.apply(z));

        int x = 1;
        Supplier<Integer> supplier =()-> sum(1,2);
//        System.out.println(supplier.get());
//        System.out.println(supplier.get());
//        HashSet
//        TreeSet

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "1");
        hashMap.put("1", "2");
        hashMap.put("1", "3");
    }

    void getSong() {
        //
    }

    void addSong() {
        //
    }

    class ArtistCompare implements Comparator<Song> {

        @Override
        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }

    public Integer sum(int x, int y) {
        return x + y;
    }

}
