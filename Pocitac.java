import fri.shapesge.Manazer;
import java.util.ArrayList;
import java.util.Random;
/**
 * Trieda ma na starost algoritmus na vytvaranie zombikov
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class Pocitac {
    private int pocitadlo;
    private ArrayList<Zombik> zombici;
    private Manazer manazer;
    private final int suradnicaX = 1100;
    private int suradnicaY;
    private int nahodneCislo;
    /**
     * Konstruktor vytvori zoznam zombikov, do ktoreho sa novi zombici budu pridavat
     */
    public Pocitac() {
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
        this.pocitadlo = 0;
        this.zombici = new ArrayList<Zombik>();
    }
    
    /**
     * Metoda na zaklade ziskaneho cisla vytvori zombika na potrebnej suradnici 
     * kazdych niekolko sekund v zavislosti od toho, kolko casu uz hra ide
     */
    public void tick() {
        this.getNahodneCislo();
        switch (this.getNahodneCislo()) {
            case 0:
                this.suradnicaY = 50;
                break;
            case 1:
                this.suradnicaY = 150;
                break;
            case 2:
                this.suradnicaY = 250;
                break;
            case 3:
                this.suradnicaY = 350;
                break;
            case 4:
                this.suradnicaY = 450;
                break;
        }
        if (this.pocitadlo % 200 == 0) {
            this.zombici.add(new Zombik(this.suradnicaX, this.suradnicaY));
        }
        if (this.pocitadlo > 200 && this.pocitadlo % 800 == 0) {
            this.zombici.add(new Zombik(this.suradnicaX, this.suradnicaY));
        }
        if (this.pocitadlo > 800 && this.pocitadlo % 1000 == 0) {
            this.zombici.add(new Zombik(this.suradnicaX, this.suradnicaY));
        }  
        if (this.pocitadlo > 1000 && this.pocitadlo % 2000 == 0) {
            this.zombici.add(new Zombik(this.suradnicaX, this.suradnicaY));
        } 
        if (this.pocitadlo > 2000 && this.pocitadlo % 3000 == 0) {
            this.zombici.add(new Zombik(this.suradnicaX, this.suradnicaY));
        } 
        if (this.pocitadlo > 3000 && this.pocitadlo % 4000 == 0) {
            this.zombici.add(new Zombik(this.suradnicaX, this.suradnicaY));
        } 
        if (this.pocitadlo > 4000 && this.pocitadlo % 5000 == 0) {
            this.zombici.add(new Zombik(this.suradnicaX, this.suradnicaY));
        } 
        this.pocitadlo++;
    }
    
    /**
     * Metoda generuje nahodne cislo medzi 0 - 4 a nasledne nam ho vrati
     */
    public int getNahodneCislo() {
        Random random = new Random();
        this.nahodneCislo = random.nextInt(5);
        return this.nahodneCislo;
    }
}
