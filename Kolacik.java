import fri.shapesge.Obrazok;
/**
 * Trieda vytvori Kolacik na zadanych suradniciach
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class Kolacik {
    private Obrazok kolacik;
    private int suradnicaX;
    private int suradnicaY;
    /**
     * Konstruktor vytvori Kolacik na zadanych suradniciach a prideli mu obrazok
     * @param suradnicaX suradnica pre vytvorenie Kolacika na potrebnej pozicii
     * @param suradnicaY suradnica pre vytvorenie Kolacika na potrebnej pozicii
     */
    public Kolacik(int suradnicaX, int suradnicaY) {
        this.suradnicaX = suradnicaX;
        this.suradnicaY = suradnicaY;
        this.kolacik = new Obrazok("imgs/Rastlinky/Kolacik.png", this.suradnicaX, this.suradnicaY);
        this.kolacik.zobraz();
    }
    
    /**
     * Metoda vymaze Kolacik zo zadanych suradnic
     */
    public void vymaz(int suradnicaX, int suradnicaY) {
        this.kolacik.skry();
        this.kolacik = null;
    }
    
    /**
     * Metoda nam vrati suradnicuX Kolaciku
     */
    public int getSuradnicaX() {
        return this.suradnicaX;
    }
    
    /**
     * Metoda nam vrati suradnicuY Kolaciku
     */
    public int getSuradnicaY() {
        return this.suradnicaY;
    }
}