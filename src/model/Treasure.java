package model;
public class Treasure{
    private String name; 
    private String  urlImagen;
    private double x;
    private double  y;
    
    public Treasure(String name, String urlImagen, double x, double y) {
        this.name = name;
        this.urlImagen = urlImagen;
        this.x = x;
        this.y = y;
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrlImagen() {
        return urlImagen;
    }
    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
   
    
    @Override
    public String toString(){
        return "name"+name+"urlImagen"+urlImagen+"x"+x+"y"+y;
    }
}