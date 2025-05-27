import fri.shapesge.Manazer;
import java.util.ArrayList;
/**
 * Trieda vytvori samotnu hru
 *
 * @author Matej Zachveja
 * @version 8.1.2023
 */
public class Hra {
    private Manazer manazer;
    private HraciaPlocha hraciaPlocha;
    private RamcekPanelu ramcekPanelu;
    private Pocitac pocitac;
    private PocitadloSlniecok pocitadloSlniecok;
    private ArrayList<Slnecnica> slnecnice;
    private ArrayList<Hrasok> hrasky;
    private ArrayList<Kolacik> kolaciky;
    /**
     * Konstruktor vytvori nove PocitadloSlniecok, HraciuPlochu, RamcekPanelu, Pocitac
     * a zoznami na slnecnice, hrasky a kolaciky
     */
    public Hra() {
        this.manazer = new Manazer();    
        this.manazer.spravujObjekt(this);
        this.pocitadloSlniecok = new PocitadloSlniecok();
        this.hraciaPlocha = new HraciaPlocha();
        this.ramcekPanelu = new RamcekPanelu();
        this.pocitac = new Pocitac();
        this.slnecnice = new ArrayList<Slnecnica>();
        this.kolaciky = new ArrayList<Kolacik>();
        this.hrasky = new ArrayList<Hrasok>();
    }
    
    /**
     * Metoda zisti, na ktorom indexe sa nachadza RamcekPanelu a pocet bodov
     * na zaklade suradnic kliku hraca sa vykona vybrana vec
     * suradnice kliku sa upravia aby boli rastlinky zarovnane
     * a pri vytvoreni rastliny sa posle sprava pocitadlu
     * aby odcitalo urcity pocet bodov
     */
    public void vyberSuradnice(int x, int y) {
        int index = this.ramcekPanelu.getIndex();
        int pocet = this.pocitadloSlniecok.getPocet();
        if (x >= 201 && x <= 300) {
            x = 200;
        } else if (x >= 301 && x <= 400) {
            x = 300;
        } else if (x >= 401 && x <= 500) {
            x = 400;
        } else if (x >= 501 && x <= 600) {
            x = 500;
        } else if (x >= 601 && x <= 700) {
            x = 600;
        } else if (x >= 701 && x <= 800) {
            x = 700;
        } else if (x >= 801 && x <= 900) {
            x = 800;
        } else if (x >= 901 && x <= 1000) {
            x = 900;
        } else if (x >= 1001 && x <= 1100) {
            x = 1000;
        } else {
            return;
        }
        if (y >= 50 && y <= 150) {
            y = 50;
        } else if (y >= 151 && y <= 250) {
            y = 150;
        } else if (y >= 251 && y <= 350) {
            y = 250;
        } else if (y >= 351 && y <= 450) {
            y = 350;
        } else if (y >= 451 && y <= 550) {
            y = 450;
        } else {
            return;
        }
        int e;
        int f;
        switch (index) {
            case 0: 
                if (!this.slnecnice.isEmpty()) {
                    for (Slnecnica slnecnica : this.slnecnice) {
                        e = slnecnica.getSuradnicaX();
                        f = slnecnica.getSuradnicaY();
                        if (e == x && f == y) {
                            slnecnica.vymaz(e, x);
                        }
                    }
                } else {
                    return;
                }
                break;
            case 1:
                if (!this.hrasky.isEmpty()) {
                    for (Hrasok hrasok : this.hrasky) {
                        e = hrasok.getSuradnicaX();
                        f = hrasok.getSuradnicaY();
                        if (e == x && f == y) {
                            hrasok.vymaz(e, x);
                        }
                    }
                } else {
                    return;
                }
                break;
            case 2:
                if (!this.kolaciky.isEmpty()) {
                    for (Kolacik kolacik : this.kolaciky) {
                        e = kolacik.getSuradnicaX();
                        f = kolacik.getSuradnicaY();
                        if (e == x && f == y) {
                            kolacik.vymaz(e, x);
                        }
                    }
                } else {
                    return;
                }
                break;
            case 3:
                if (pocet > 49) { 
                    this.slnecnice.add(new Slnecnica(x, y, this.pocitadloSlniecok));
                    this.pocitadloSlniecok.pridajSlniecka(-50);
                } else {
                    return;
                }
                break;
            case 4:
                if (pocet > 99) {
                    this.hrasky.add(new Hrasok(x, y));
                    this.pocitadloSlniecok.pridajSlniecka(-100);
                } else {
                    return;
                }
                break;
            case 5:
                if (pocet > 49) {
                    this.kolaciky.add(new Kolacik(x, y));
                    this.pocitadloSlniecok.pridajSlniecka(-50);
                } else {
                    return;
                }
                break;
        }
    }
    
    /*public ArrayList<Hrasok> getHrasky() {
        return this.hrasky;
    }*/
}