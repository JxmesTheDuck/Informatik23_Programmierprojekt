
/**
 * Beschreiben Sie hier die Klasse STAUBSAUGER.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class STAUBSAUGER extends BILD
{
    // Attribute
    
    private double geschwindigkeit;
    private double deltaX;
    private double deltaY;
    private int winkele=nenneWinkel();
    // Konstruktor

    public STAUBSAUGER(int x,int y)
    {
        super(x,y,"robot.gif");
        this.setzeMittelpunkt(x, y);
        geschwindigkeit=10;
        deltaX=10;
    }
    public STAUBSAUGER()
    {
        this(400,300);
    }
    
    // Methoden
    void berechneNeuSchrittweite()
    {
        deltaX=geschwindigkeit*cos_Drehwinkel();
        deltaY=-geschwindigkeit*sin_Drehwinkel();
    }

    @Override
    public void setzeDrehwinkel(int winkel){
        super.setzeDrehwinkel(winkel);
        this.berechneNeuSchrittweite();
    }
    

    public void bewegen(){
        verschiebenUm(deltaX, deltaY);
    }
    public void setzeGeschwindigkeit(double vNeu){
        geschwindigkeit=vNeu;
    }
}
