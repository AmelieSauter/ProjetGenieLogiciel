
package metro;


public class Station {
    
    private String nom;
    private boolean incident;
    private int x;
    private int y;
    
    public Station (String nom, int x, int y){
        this.nom=nom;
        this.incident=false;
        this.x=x;
        this.y=y;
    }
    
    public String getNom(){
        return nom;
    }
    
    public boolean getIncident(){
        return incident;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
    
    public void setIncident(boolean incident){
        this.incident=incident;
    }
}
