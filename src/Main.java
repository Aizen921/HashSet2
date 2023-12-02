import java.util.HashSet;

public class Main {
    public static void main(String[]args){
        String gioco = "Sekiro";
        HashSet<String> giochi = creaHashSet();
        boolean ricerca = giochi.contains(gioco);
        System.out.println(ricerca);


    }
    public static HashSet<String> giochi;
    public static HashSet<String> creaHashSet(){
        HashSet<String> giochi = new HashSet<>();
        giochi.add("Dark Souls");
        giochi.add("Elden Ring");
        giochi.add("Bloodborne");
        giochi.add("Lies Of P");
        giochi.add("Sekiro");
        return giochi;
    }
}
