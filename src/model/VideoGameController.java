package model;

public class VideoGameController{
    private Player[]players;
	private Level[]levels;
	private Level[]scores;  
	
	
	public VideoGameController(){
		this.players= new Player[20];
		this.levels= new Level[10];
		this.scores =new Level[99999];
	}
	public void createdLevel(int number){
		
	
	}

    /**
     * @param nickName
     * @param name
     * @param initialScore
     * @param numberofLives
     * @return
     */
    public boolean registerPlayer(String nickName, String name, int initialScore, int numberofLives) {
		Player newPlayer = new Player( nickName,  name,  initialScore, numberofLives);

		for (int i = 0; i < players.length; i++) {
			if (players[i]	 == null) {
				players[i] = newPlayer;
				return true;
			}
		}

		return false;
	}

	/**
	 * @param position
	 * @return
	 */
	public boolean isTheLevelCreated(int position ){
		if (levels[position-1] == null) {
			return true;
		}
		return false;
	}


	/**
	 * @param number
	 * @return
	 */
	public  boolean registerLevel(int number ){
		Level newlevel  = new Level(number );
		for (int i= 0; i<levels.length; i++){
			if(levels[i]==null){
				levels[i]=newlevel;
				return true;
			}
		}

		return false;
	}


	/**
	 * @param level
	 * @param nameId
	 * @param x
	 * @param y
	 * @param enemiess
	 * @return
	 */
	public boolean registerLeverEnemy(int level, String nameId, double x, double y,TypeEnemy enemiess ){
		Enemy newEnemyLevel =new Enemy( nameId,   enemiess,  x, y);
		if(isTheLevelCreated(level)){ 
			levels[level-1].setEnemy(newEnemyLevel);
			return true;
		}
		return false;	
	}


	/**
	 * @param level
	 * @param name
	 * @param urlImagen
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean registerLevelTreasure(int level, String name, String urlImagen, double x, double y){
	Treasure newTreasure =new Treasure ( name,  urlImagen,  x,  y);
		if(isTheLevelCreated(level)){
			levels[level].setTreasure(newTreasure);
			return true;

		}
		return false;
	}
	///// controladora
		//// BUSCAR EL USUARIO DADO UN NOMBRE
		/// CON EL USUARIO ENCONTRADO, AHI SI USAR EL GETSCORE PARA DESPUES MODIFICARLO USANDO EL SETSCORE 
		
	public boolean  modifyScore(String name, int initialScore){
		
		for (int i= 0; i<players.length; i++){ 
			
		if((players[i].getName()).equals(name)){

		players[i].getInitialScore();
		
		int suma=
		
		return true;
		
		}

		return false;

	}
	

	public void  calculteComplexity(){
	}
}
