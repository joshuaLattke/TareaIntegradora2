package model;
public class Level{
    private  int Number;
    private Enemy[] enemies;
    private Treasure[]treasures;
 

    public Level(int number) {
        Number = number;
        
        this.enemies=new Enemy[25];
        this.treasures= new Treasure[50];
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
        return "number"+Number+"enemy"+enemies+"treasure"+treasures;
    }
}