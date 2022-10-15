package model;
public class Level{
    private  int Number;
    private  TypeComplexity complexity;
    private Enemy[] level;
    private Treasure[]level1;
   
     public Level(int number, TypeComplexity complexity) {
        Number = number;
        this.complexity = complexity;
        this.level=new Enemy[5];
        this.level1= new Treasure[10];
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
    public Enemy[] getLevel() {
        return level;
    }


    public void setLevel(Enemy enemy) {
        boolean out=false;
        for(int i=0;i<level.length && !out;i++){
            if(level[i]==null){
                level[i]=enemy;
                out=true;
            }
        }
    }
    public Treasure[] getLevel1() {
        return level1;
    }


    public void setLevel1(Treasure treasures) {
        boolean out=false;
        for(int i=0;i<level1.length && !out;i++){
            if(level1[i]==null){
                level[i]=treasures;
                out=true;
            }
        }
    }
   

    @Override
    public String toString(){
        return "number"+Number+"complexity"+complexity;
    }
}