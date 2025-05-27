import fri.shapesge.Obrazok;
import fri.shapesge.Manazer;
/**
 * Trieda vytvori zombika, ktory sa posuva
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class Zombik {
    private Obrazok zombik;
    private Obrazok gameOver;
    private int suradnicaX;
    private int suradnicaY;
    private Manazer manazer;
    private int pocitadlo;
    /**
     * Konstruktor vytvori zombika na potrebnej pozicii, prideli mu obrazok
     * taktiez vytvori obrazok, ktory sa zobrazi, ak sa splni urcita podmienka
     */
    public Zombik(int suradnicaX, int suradnicaY) {
        this.suradnicaX = suradnicaX;
        this.suradnicaY = suradnicaY;
        this.gameOver = new Obrazok("imgs/GameOver.png", 375, 75);
        this.zombik = new Obrazok("imgs/Zombik.png", this.suradnicaX, this.suradnicaY);
        this.zombik.zobraz();
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
        this.pocitadlo = 0;
    }

    /**
     * Metoda posuva zombika kazdych 70 ms o 1 pixel smerom dolava
     * Ak je suradnicaX mensia ako 200, zobrazi sa obrazok co znaci koniec hry
     */
    public void tick() {
        if (this.pocitadlo % 7 == 0 && this.suradnicaX > 199) {
            this.zombik.posunVodorovne(-1);
            this.suradnicaX--;
        }
        this.pocitadlo++;
        if (this.suradnicaX < 200) {
            this.gameOver.zobraz();
        }
        //this.kolizie();
    }
    
    /**
     * Metoda vrati suradnicuX Zombika
     */
    public int getSuradnicaX() {
        return this.suradnicaX;
    }
    
    /**
     * Metoda vymaze zombika
     */
    public void vymaz() {
        this.zombik.skry();
        this.zombik = null;
    }
    
    /**
     * nedokoncena metoda na suradnice
     */
    /*public void kolizie() {
        if(!hra.getHrasky()) {
            for (Hrasok hrasok : hra.getHrasky()) {
                if(!hrasok.getNaboje().isEmpty()) {
                    for (Naboj naboj : hrasok.getNaboje()) {
                        this.suradnicaNaboja = naboj.getSuradnicaX();
                    }
                }
            } 
            if(this.suradnicaNaboja == this.getSuradnicaX()) {
                this.zombik.vymaz();
            }
        }   
    }*/
}
