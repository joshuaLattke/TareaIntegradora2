package model; 
public class Enemy{
    private String nameId;
    private Enemy TypeEnemy;
    private double  x;
    private double y;
    
    public Enemy(String nameId, Enemy typeEnemy, double x, double y) {
        this.nameId = nameId;
        TypeEnemy = typeEnemy;
        this.x = x;
        this.y = y;
    }
    public String getNameId() {
        return nameId;
    }
    public void setNameId(String nameId) {
        this.nameId = nameId;
    }
    public Enemy getTypeEnemy() {
        return TypeEnemy;
    }
    public void setTypeEnemy(Enemy typeEnemy) {
        TypeEnemy = typeEnemy;
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
        return "nameID"+nameId+"typeEnemy"+TypeEnemy+"x"+x+"y"+y;
    }
}