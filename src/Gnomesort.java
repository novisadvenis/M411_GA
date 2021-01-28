/**
 * Algorithmus Beschreibung:
 * 1. Falls man sich bei index 0 befindet, dann gehe zum nächsten Element
 * 2. Falls das aktuelle Element grösser oder gleich das vorherige Element ist,
 *    dann gehe ein index weiter
 * 3. Sonst vertausche diese zwei Elemente und gehe ein Schritt zurück
 * 4. Schritt 2 und 3 wiederholen, bis man am Ende des Arrays angekommen ist
 * 5. Sobald man am Ende angekommen ist, beende das Sortieren
 *
 * - Best-Case:	    n
 * - Average-Case:	n^2
 * - Worst-Case:	n^2
 * - Stabil:		Ja
 *
 * - Quellenangabe:   https://www.geeksforgeeks.org/java-program-for-gnome-sort/
 *
 * @author Lakisha Jeyarajah
 * @version 1.0
 * @date 2021-01-21
 */
public class Gnomesort extends SortWerte {
    private String name = "Gnomesort";

    public Gnomesort() {
        super.setName(name);
    }

    /**
     * Array mit Gnomesort sortieren
     *
     * @param arr    Zahlen zu sortieren
     * @param length Anzahl zu sortierende Zahlen
     */
    @Override
    public void logic(int[] arr, int length) {
        int index = 0;

        while (index < length) {
            //Anzahl Vergleiche hochzählen
            incrementAnzahlVergleiche();
            if (index == 0) {
                index++;
                //Anzahl Schleifen hochzählen
                incrementAnzahlSchleifen();
            }
            incrementAnzahlVergleiche();
            if (arr[index] >= arr[index - 1]) {
                index++;
                incrementAnzahlSchleifen();
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
                incrementAnzahlSchleifen();
            }
            incrementAnzahlVergleiche();
            incrementAnzahlSchleifen();
        }
        //Anzahl zu sortierende Zahlen setzen
        setAnzahlZahlen(length);
    }
}