package model;
public class Level{
    private  int Number;
    private  TypeComplexity complexity;
    private Enemy[] enemies;
    private Treasure[]treasures;
   

    public Level(int number, TypeComplexity complexity) {
        Number = number;
        this.complexity = complexity;
        this.enemies=new Enemy[5];
        this.treasures= new Treasure[10];
    }

    public void setEnemies(Enemy[] enemies) {
        this.enemies = enemies;
    }


    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }


    public int getNumber() {
        return Number;
    }


    public void setNumber(int number) {
        Number = number;
    }


    public TypeComplexity getComplexity() {
        return complexity;
    }


    public void setComplexity(TypeComplexity complexity) {
        this.complexity = complexity;
    }
    public Enemy[] getEnemies() {
        return enemies;
    }


    public void setEnemy(Enemy enemy) {
        boolean out=false;
        for(int i=0;i<enemies.length && !out;i++){
            if(enemies[i] == null){
                enemies[i]=enemy;
                out=true;
            }
        }
    }


    public Treasure[] getTreasures() {
        return treasures;
    }


    public void setTreasure(Treasure treasure) {
        boolean out=false;
        for(int i=0;i<treasures.length && !out;i++){
            if(treasures[i]==null){
                treasures[i]=treasure;
                out=true;
            }
        }
    }
   

    @Override
    public String toString(){
        return "number"+Number+"complexity"+complexity;
    }
}