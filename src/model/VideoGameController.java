package model;

public class VideoGameController{
    private Player[]players;
	private Level[]levels;
	private Enemy[]enemys;
	private Treasure[]treasures;
	
	public VideoGameController(){
		this.players= new Player[20];
		this.levels= new Level[10];
		this.enemys= new Enemy[25];
		this.treasures =new Treasure[50];
			
		
		
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
	public static boolean registerLeverEnemy(String nameId, Enemy typeEnemy, double x, double y ){
		Enemy newEnemyLevel =new Enemy( nameId,  typeEnemy,  x, y);

		for (int i = 0; i < enemys.length; i++) {

			if (enemys[i] == null) {

				enemys[i] = newEnemyLevel;
				return true;

			}
		}
		return false;	
	}
	public boolean registerLevelTreasure(String name, String urlImagen, double x, double y,Treasure typeTreasure){
	Treasure newTreasure =new Treasure ( name,  urlImagen,  x,  y, typeTreasure);
		
	for (int i = 0; i < levels.length; i++) {

		if (levels[i] == null) {

			levels[i] = newTreasure;
			return true;

		}
	}
	return false;
}

}
