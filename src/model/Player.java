package model;
public class Player{
private String nickName;
private  String  name;
private  int initialScore;
private  int numberofLives;


public Player(String nickName, String name, int initialScore, int numberofLives) {
    this.nickName = nickName;
    this.name = name;
    this.initialScore = initialScore;
    this.numberofLives = numberofLives;
}

public String getNickName() {
    return nickName;
}

public void setNickName(String nickName) {
    this.nickName = nickName;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

public int getInitialScore() {
    return initialScore;
}
public void setInitialScore(int initialScore) {
    this.initialScore = initialScore;
}
public int getNumberofLives() {
    return numberofLives;
}
public void setNumberofLives(int numberofLives) {
    this.numberofLives = numberofLives;
}
@Override
 public String toString(){
    return "nickname"+nickName+"name"+name+"initialScore"+initialScore+"numberofLives"+numberofLives ;
 }
} 