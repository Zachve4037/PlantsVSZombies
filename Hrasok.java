import fri.shapesge.Obrazok;
import fri.shapesge.Manazer;
import java.util.ArrayList;
/**
 * Trieda vytvori Hrasok na zadanych suradniciach, ktory striela naboje
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class Hrasok {
    private int suradnicaX;
    private int suradnicaY;
    private Obrazok hrasok;
    private Manazer manazer;
    private int pocitadlo;
    private ArrayList<Naboj> naboje;
    /**
     * Konstruktor vytvori Hrasok na zadanych suradniciach, prideli mu obrazok
     * a vytvori zoznam nabojov, do ktoreho svoje naboje pridava
     * @param suradnicaX suradnica pre vytvorenie Hraska na potrebnej pozicii 
     * @param suradnicaY suradnica pre vytvorenie Hraska na potrebnej pozicii 
     */
    public Hrasok(int suradnicaX, int suradnicaY) {
        this.suradnicaX = suradnicaX;
        this.suradnicaY = suradnicaY;
        this.hrasok = new Obrazok("imgs/Rastlinky/Hrasok.png", this.suradnicaX, this.suradnicaY);
        this.hrasok.zobraz();
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
        this.pocitadlo = 0;
        this.naboje = new ArrayList<Naboj>();
    }

    /**
     * Metoda vytvori instanciu Naboja kazdych 1.5 sekundy a skontroluje, ci je mimo platna
     * pokial ano, tak ho vymaze zo zoznamu
     */
    public void tick() {
        if (this.pocitadlo % 150 == 0) {
            this.naboje.add(new Naboj(this.suradnicaX + 80, this.suradnicaY + 15));
        }
        Naboj mimoPlatna = this.naboje.get(0).getSuradnicaX() >= 1100 ? this.naboje.get(0) : null;
        if (mimoPlatna != null) {
            mimoPlatna.vymaz();
            this.naboje.remove(mimoPlatna);
        }
        this.pocitadlo++;
    }
    
    /**
     * Metoda nam vrati suradnicuX Hrasku
     */
    public int getSuradnicaX() {
        return this.suradnicaX;
    }
    
    /**
     * Metoda nam vrati suradnicuY Hrasku
     */
    public int getSuradnicaY() {
        return this.suradnicaY;
    }
    
    /**
     * Metoda vymaze Hrasok zo zadanych suradnic
     */
    public void vymaz(int suradnicaX, int suradnicaY) {
        for (Naboj naboj : this.naboje) {
            naboj.vymaz();
        }
        this.hrasok.skry();
        this.hrasok = null;
    }
}