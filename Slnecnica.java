import fri.shapesge.Obrazok;
import fri.shapesge.Manazer;
/**
 * Trieda vytvori Slnecicu na zadanych suradniciach, ktora pridava body do PocitadlaSlniecok
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class Slnecnica {
    private Obrazok slnecnica;
    private int suradnicaX;
    private int suradnicaY;
    private int pocitadlo;
    private PocitadloSlniecok pocitadloSlniecok;
    private Manazer manazer;
    /**
     * Konstruktor vytvori Slnecnicu na zadanych suradniciach a prideli jej pocitadlo
     * do ktoreho ma pripocitavat body, prideli jej obrazok
     * @param suradnicaX suradnica pre vytvorenie Slnecnice na potrebnej pozicii
     * @param suradnicaY suradnica pre vytvorenie Slnecnice na potrebnej pozicii
     */
    public Slnecnica(int suradnicaX, int suradnicaY, PocitadloSlniecok pocitadloSlniecok) {
        this.suradnicaX = suradnicaX;
        this.suradnicaY = suradnicaY;
        this.pocitadloSlniecok = pocitadloSlniecok;
        this.slnecnica = new Obrazok("imgs/Rastlinky/Slnecnica.png", this.suradnicaX, this.suradnicaY);
        this.slnecnica.zobraz();
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
        this.pocitadlo = 0;
    }
    
    /**
     * Metoda vymaze Slnecnicu zo zadanych suradnic
     */
    public void vymaz(int suradnicaX, int suradnicaY) {
        this.slnecnica.skry();
        this.slnecnica = null;
    }
    
    /**
     * Metoda kazdych 24 sekund posle spravu pocitadlu, aby pridalo 25 bodov
     */
    public void tick() {
        if (this.pocitadlo % 2400 == 0) {
            this.pocitadloSlniecok.pridajSlniecka(25);
        }
        this.pocitadlo++;
    }
    
    /**
     * Metoda vrati suradnicuX Slnecnice
     */
    public int getSuradnicaX() {
        return this.suradnicaX;
    }
    
    /**
     * Metoda vrati suradnicuY Slnecnice
     */
    public int getSuradnicaY() {
        return this.suradnicaY;
    }
}
