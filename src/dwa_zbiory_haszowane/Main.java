package dwa_zbiory_haszowane;
public class Main {
    public static void main(String[] args)
    {
        //tworzenie zbioru 1
        java.util.Set<String> zbior1 = new java.util.HashSet<>();

        //dodawanie imion do zbioru
        zbior1.add("Michał");
        zbior1.add("Iga");
        zbior1.add("Kamil");
        zbior1.add("Andrzej");

        System.out.println("\nzbior 1: " + zbior1 + ".");
        System.out.println("Liczba elementow w zbiorze 1: " + zbior1.size() + ".");

        //usuniecie jednego elementu ze zbiru
        zbior1.remove("Kamil");
        System.out.println("Ze zbioru 1 usunieto jeden element - Kamil.");
        System.out.println("\nzbior 1: " + zbior1);
        System.out.println("Liczba elementow w zbiorze 1: " + zbior1.size() + ".");

        //utworzenie zbioru zbior2
        java.util.Set<String> zbior2 = new java.util.HashSet<>();

        //dodawanie 3 nowych imion do zbioru 2
        zbior2.add("Maria");
        zbior2.add("Patrycja");
        zbior2.add("Marzena");

        System.out.println("\nzbior 2: " + zbior2);
        System.out.println("Liczba elementow w zbiorze 2: " + zbior2.size());

        System.out.println("Czy w zbiorze 2 znajduje się Dorota? " + zbior2.contains("Dorota"));

        zbior1.addAll(zbior2);
        System.out.println("Po dodaniu zbioru 2 do zbioru 1 zbior 1 zawiera: " + zbior1 + ".");
        zbior1.removeAll(zbior2);
        System.out.println("Po usunieciu zbioru 2 do zbioru 1 zbior 1 zawiera: " + zbior1 + ".");
        zbior1.retainAll(zbior2);
        System.out.println("Po zachowaniu wspolnych elementow zbiorow zbior 1 i zbior 2, zbior 1 zawiera: " + zbior1 + ".");
    }
}
