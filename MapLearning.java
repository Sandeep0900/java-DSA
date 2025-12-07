import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class MapLearning{
    public static void main(String[] arr) {
        Map<Integer, Boolean> NewMap = new HashMap<>();

        System.out.println("HII");
        NewMap.put(1,true);
        NewMap.put(2,NewMap.containsKey(4));

        Set<Integer> s = new HashSet<>();
        s = NewMap.keySet();

        for(int at:s ) {
            if(NewMap.get(at) == true) {
                System.out.println(at+" --->"+NewMap.get(at));
            }
        }

    }
} 