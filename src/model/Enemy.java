package model; 
public class Enemy{
    private String nameId;
    private  TypeEnemy enemiess;
    private double  x;
    private double y;
   
    public Enemy(String nameId, TypeEnemy enemiess, double x, double y) {
        this.nameId = nameId;
        this.enemiess = enemiess;
        this.x = x;
        this.y = y;
    }
    
    public String getNameId() {
        return nameId;
    }
    public void setNameId(String nameId) {
        this.nameId = nameId;
    
    }
    public TypeEnemy getEnemiess() {
        return enemiess;
    }
    public void setEnemiess(TypeEnemy enemiess) {
        this.enemiess = enemiess;
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
        return "nameID"+nameId+"typeEnemy"+enemiess+"x"+x+"y"+y;
    }
} 
