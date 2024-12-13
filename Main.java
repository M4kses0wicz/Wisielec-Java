import java.util.*;

public class Main {
    private static String [] slowa = {"java","programowanie", "obiekt", "pietruszka", "sok", "ul", "wisielec", "github", "telefon","komputer"};

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String slowoDoZgadniecia = slowa[random.nextInt(slowa.length)];
        char [] slowoOdgadniete = new char[slowoDoZgadniecia.length()];
        Arrays.fill(slowoOdgadniete, '_');
        Set<Character> zgadywaneLitery = new HashSet<>();
        int pozostaleProby = 6;
        System.out.println(">================================<");
        System.out.println(">=========={ Wisielec }==========<");
        System.out.println(">================================<");

        while (pozostaleProby > 0){
            System.out.println("Słowo:" + String.valueOf(slowoOdgadniete));
            System.out.println("Pozostałe próby:" + pozostaleProby);
            System.out.println("Zdgazywane litery:" + zgadywaneLitery);
            System.out.print("Podaj literę:");
            String wejscie = scanner.nextLine().toLowerCase();
            if(wejscie.length() !=1){
                System.out.println("Podaj jedną literę!");
                continue;
            }
            char litera = wejscie.charAt(0);
            if(zgadywaneLitery.contains(litera)){
                System.out.println("Było!");
                continue;
            }
            zgadywaneLitery.add(litera);
            if(slowoDoZgadniecia.indexOf(litera) >=0){
                System.out.println("Dobrze!");
                for(int i = 0; i < slowoDoZgadniecia.length(); i++){
                    if(slowoDoZgadniecia.charAt(i) == litera) {
                        slowoOdgadniete[i] = litera;
                    }
                }
                if(String.valueOf(slowoOdgadniete).equals(slowoDoZgadniecia)){
                    System.out.println("Dobrze! Oto słowo: " + slowoDoZgadniecia);
                    break;
                }
            }else {
                System.out.println("Żle!");
                pozostaleProby--;
                rysuj(pozostaleProby);
            }
        }
        if(pozostaleProby == 0){
            System.out.println("Przegrałeś! Oto słowo: " + slowoDoZgadniecia);
        }
        scanner.close();
    }
    private static void rysuj(int pozostaleProby){
        if (pozostaleProby == 5){
            System.out.println("===========================");
            System.out.println("||                       ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      ^                ||");
            System.out.println("===========================");
        }
        if (pozostaleProby == 4){
            System.out.println("===========================");
            System.out.println("||                       ||");
            System.out.println("||      |--------        ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      ^                ||");
            System.out.println("===========================");
        }
        if (pozostaleProby == 3){
            System.out.println("===========================");
            System.out.println("||                       ||");
            System.out.println("||      |--------|       ||");
            System.out.println("||      |        |       ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      ^                ||");
            System.out.println("===========================");
        }
        if (pozostaleProby == 2){
            System.out.println("===========================");
            System.out.println("||                       ||");
            System.out.println("||      |--------|       ||");
            System.out.println("||      |        |       ||");
            System.out.println("||      |        O       ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      ^                ||");
            System.out.println("===========================");
        }
        if (pozostaleProby == 1){
            System.out.println("===========================");
            System.out.println("||                       ||");
            System.out.println("||      |--------|       ||");
            System.out.println("||      |        |       ||");
            System.out.println("||      |        O       ||");
            System.out.println("||      |       /|\\      ||");
            System.out.println("||      |                ||");
            System.out.println("||      |                ||");
            System.out.println("||      ^                ||");
            System.out.println("===========================");
        }
        if (pozostaleProby == 0){
            System.out.println("===========================");
            System.out.println("||                       ||");
            System.out.println("||      |--------|       ||");
            System.out.println("||      |        |       ||");
            System.out.println("||      |        O       ||");
            System.out.println("||      |       /|\\      ||");
            System.out.println("||      |       / \\      ||");
            System.out.println("||      |                ||");
            System.out.println("||      ^                ||");
            System.out.println("===========================");
        }
    }
}
