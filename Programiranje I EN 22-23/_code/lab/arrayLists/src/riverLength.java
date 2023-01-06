import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class riverLength {
    public static void main(String[] args) {
        Rivers.printRivers();

    }
}

class Rivers{
    public static void printRivers(){
        String[] rivers = {"Volga", "Ottawa", "Danube", "Colorado"};
        Integer[] lengths = {3645, 1271, 2888, 2333};
        List<String> riverList = Arrays.asList(rivers);
        List<Integer> lengthList = Arrays.asList(lengths);
        List<Integer> temp_lengths = new ArrayList<>(lengthList);
        //copy elements from lengthlist to temp_list
        Collections.copy(temp_lengths, lengthList);
        Collections.sort(lengthList);
        //finallist is list bof sorted rivers by length
        ArrayList<String> finalList = new ArrayList<>();
        for (Integer elements : lengths) {
            finalList.add(riverList.get(temp_lengths.indexOf(elements)));
        }
        System.out.println(finalList);
    }
}