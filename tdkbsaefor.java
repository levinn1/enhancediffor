import java.util.ArrayList;

public class tdkbsaefor {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("apel");
        list.add("jeruk");
        list.add("mangga");

        
        for (String fruit : list) { //akses indeks elemen dalam koleksi dengan enhanced for loop tidak mungkin
            int index = list.indexOf(fruit); //tidak efisien dan bisa kasih hasil yang salah kalau ada duplikat
            System.out.println(fruit + " di list: " + index);
        }
    }
}       
