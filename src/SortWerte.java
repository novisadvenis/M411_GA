import java.util.HashMap;
import java.util.Map;

public abstract class SortWerte implements SortInterface {

    private Map<String, Double> messWerte;
    private String name;
    private double schleifen = 0;
    private double vergleiche = 0;

    SortWerte() {
        messWerte = new HashMap<>();
    }

    private void setZeitInNanosekunde(double dauerInSekunde) {
        messWerte.put("Dauer in Nanosekunden", dauerInSekunde);
    }

    private void setMemoryUsage(double memoryUsage) {
        messWerte.put("Speicherplatz in Kilobyte: ", memoryUsage / 1000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void incrementAnzahleSchliefe() {
        messWerte.put("Anzahl Schleifendurchläufe: ", schleifen++);
    }

    public final void incrementAnzahlVergleiche() {
        messWerte.put("Anzahl Vergleiche: ", vergleiche++);
    }


    public final SortWerte sort(int[] arr, int length) {
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        //System.out.println("Used Memory before" + usedMemoryBefore);
        long start = System.nanoTime();
        logic(arr, length);
        long end = System.nanoTime();
        setZeitInNanosekunde((end - start));
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        setMemoryUsage(usedMemoryAfter - usedMemoryBefore);
        return this;
    }

    ;

    @Override
    public abstract void logic(int[] arr, int length);

    public void print() {
        System.out.println(getName() + " Messwerte: ");
        for (String key : messWerte.keySet()) {
            System.out.println(key + " : " + messWerte.get(key));
        }
        System.out.println("----------------------------");
    }
}
