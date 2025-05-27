import fri.shapesge.Obrazok;
import fri.shapesge.Manazer;
/**
 * Trieda vytvori projektil triedy Hrasok na zadanych suradniciach, ktory sa pohybuje
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class Naboj {
    private Obrazok naboj;
    private int suradnicaX;
    private int suradnicaY;
    private Manazer manazer;
    private int pocitadlo;
    /**
     * Konstruktor vytvori Naboj na suradniciach a prideli mu obrazok
     */
    public Naboj(int suradnicaX, int suradnicaY) {
        this.suradnicaX = suradnicaX;
        this.suradnicaY = suradnicaY;
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
        this.naboj = new Obrazok("imgs/Naboj.png", this.suradnicaX, this.suradnicaY);
        this.naboj.zobraz();
    }
    
    /**
     * Metoda posunie Naboj kazdych 10 milisekund o 1 pixel smerom doprava
     */
    public void tick() {
        if (this.suradnicaX < 1100) {
            this.naboj.posunVodorovne(1);
            this.suradnicaX++;
        }
    }
    
    /**
     * Metoda vrati aktualnu suradnicuX Naboja
     */
    public int getSuradnicaX() {
        return this.suradnicaX;
    }
    
    /**
     * Metoda vymaze Naboj
     */
    public void vymaz() {
        this.naboj.skry();
    }
}