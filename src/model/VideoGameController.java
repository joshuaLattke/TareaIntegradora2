package model;

public class VideoGameController{
    private Player[]players;
	private Level[]levels;
	
	
	public VideoGameController(){
		this.players= new Player[20];
		this.levels= new Level[10];
	}

    public boolean registerPlayer(String nickName, String name, int initialScore, int numberofLives) {
		Player newPlayer = new Player( nickName,  name,  initialScore, numberofLives);

		for (int i = 0; i < players.length; i++) {
			if (players[i] == null) {
				players[i] = newPlayer;
				return true;
			}
		}

		return false;
	}

	public boolean isTheLevelCreated(int position ){
		
		if (levels[position-1] == null) {
			return false;
		}
		return true;
	}


	public boolean registerLeverEnemy(int level, String nameId, Enemy typeEnemy, double x, double y ){
		Enemy newEnemyLevel =new Enemy( nameId,  typeEnemy,  x, y);

		if(isTheLevelCreated(level)){ 
			levels[level].setEnemy(newEnemyLevel);
			return true;
		}

		return false;	
	}


	public boolean registerLevelTreasure(int level, String name, String urlImagen, double x, double y,Treasure typeTreasure){
	Treasure newTreasure =new Treasure ( name,  urlImagen,  x,  y, typeTreasure);
		if(isTheLevelCreated(level)){
			levels[level].setTreasure(newTreasure);
			return true;

		}
		return false;
}


}
