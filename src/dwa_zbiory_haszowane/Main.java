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

    }
}
