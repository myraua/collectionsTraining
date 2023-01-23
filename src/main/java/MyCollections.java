import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MyCollections {

    //swap keys and values in Map
    public static <K, V> Map<V, Collection<K>> inverse(Map<? extends K, ? extends V> map) {
        Map<V, Collection<K>> resultMap = new HashMap<>();
        Set<K> keys = (Set<K>) map.keySet(); //why here cast??
        for(K key : keys) {
            V value = map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if(ks==null){
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }
        return resultMap;
    }
    //iterator for two-dimentional array[][]
    public void arrayTwoD() {
        int ar[][] = { {1,2,3}, {4,5,6}};
        for(int i[] : ar) {
            for(int j : i) {
                System.out.println(j + "");
            }
            System.out.println("");
        }
        }
    public void duplicatesInArray(){
        String arr[] = {"apple", "kiwi","banana","peach","kiwi"};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element is: " + arr[i]);
                }
            }
        }
    }
    public void duplicatesHash(){ //doesn't take duplicates
    }
    public void arrayToList() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many elements you want to add to the array");
        int n = Integer.parseInt(br.readLine());
        String name[] = new String[n];

        for(int i=0; i< n;i++) {
            name[i] = br.readLine();
        }
        List<String> list = Arrays.asList(name);

        for(String str : list){
            // String str1 = str; //why???
            System.out.print(str + " ");
        }
    }
    public void compareElementsInCollection() {
    }
    public void buildDictionaryWithMap(String text) {
        text = text.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                map.compute(ch, (character, integer) -> integer == null ? 1 : integer + 1);
                ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
                entries.sort(((o1, o2) -> Character.compare(o1.getKey(), o2.getKey())));
                for (Map.Entry<Character, Integer> entry : entries) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
            }
        }
    }
    public void buildDictionaryWithMap1(String str){
        str = str.toLowerCase();

        int[] result = new int['z' - 'a' + 1]; //why primitive data not Integer>?
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result[ch - 'a']++;
            }
        }
        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + 'a') + " = " + result[i]);
        }
    }
}
