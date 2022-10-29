package ui;

import model.TypeEnemy;
import model.VideoGameController;
import java.util.Scanner;
import java.util.Random;

public class VideoGameManager {
	public static Scanner sc = new Scanner(System.in);
	public static VideoGameController videoGameController = new VideoGameController();
	public static boolean exit = false;

	public static void main(String[] args) {
		menu();
        createdLevel();
	}

	/**
	 * 
	 */
	public static void menu() {
		System.out.println("Bienvenidos al juego");
		while (!exit) {
			System.out.println(
					"Digite una de las opcinones\n 1. created player  \n 2.register level enemy  \n 3. register level treasure \n 4. modifiy score ");
			int opcinion = sc.nextInt();
			sc.nextLine();
			switch (opcinion) {
			case 1:
				createdPlayer();
				break;
			case 2:
				registerLeverEnemy1();
				break;
			case 3:
				registerLevelTreasure1();
				break;
			case 4:
				modifyScore();
				break;
			case 5:
				enemyConsonants();
				break;
			default:
				System.out.println("Digite correctamente la opcion 1, 2, 3,  4 y 5");
				break;
			}
		}
	}

	/**
	 * 
	 */
	private static void createdPlayer() {
		System.out.println("ingrese el nickname");

		String nickName = sc.nextLine();

		System.out.println("ingrese el nombre");

		String name = sc.nextLine();

		int initialScore = 10;

		int NumberofLives = 5;

		if (videoGameController.registerPlayer(nickName, name, initialScore, NumberofLives)) {
			
            System.out.println("jugador registrado correctamente");
		}else{
			
            System.out.println("jugador no registrado correctamente");

		}
	}

	/**
	 * 
	 */
	private static void createdLevel() {

		for (int i = 0; i < 9; i++);
		Random random = new Random();
		int max = 2560;
		int min = 1440;
		int rage = (max - min) + 1;
		int numRandom = (int) (Math.random()) * (max - min);

	}

	/**
	 * 
	 */
	private static void registerLeverEnemy1() {
		System.out.println("registre  el enemigo");

		System.out.println("registre el nombre del enemigo ");

		String nameId = sc.nextLine();

		System.out.println("registre el tipo de enemigo ");

		TypeEnemy enemiess = null;

		///// hacer switch case
		while (!exit) {
			System.out.println("digite el tipo de enemigos \n1. ogros \n2. bosses  \n 3. magic\n 4. abstracts");
			int opcinion = sc.nextInt();
			sc.nextLine();
			switch (opcinion) {
			case 1:
				enemiess = TypeEnemy.OGROS;
				exit = true;
				break;
			case 2:
				enemiess = TypeEnemy.BOSSES;
				exit = true;
				break;
			case 3:
				enemiess = TypeEnemy.MAGIC;
				exit = true;
				break;
			case 4:
				enemiess = TypeEnemy.ABSTRACTS;
				exit = true;
				break;
			default:
				System.out.println("digite correctamente las opciones");
				break;
			}
		}

		System.out.println("registre la posicion de x");

		double x = sc.nextDouble();

		System.out.println("registre la posicion de y");

		double y = sc.nextDouble();

		System.out.println("el nivel que se encontro el enemigo ");
		
        int level = sc.nextInt();

		if (videoGameController.registerLeverEnemy(level, nameId, x, y, enemiess)) {
			System.out.println("enemigo registrado correctamente");
		} else {
			System.out.println("Digite correctamente las opciones");
		}
	}

	/**
	 * 
	 */
	private static void registerLevelTreasure1() {
	    System.out.println("Digite el tesosro ");
		
        System.out.println("Digite el nombre");
		String name = sc.nextLine();
		
        System.out.println("ingese imagen");
		String urlImagen = sc.nextLine();
		
        System.out.println("ingrese la posicion de x");
		double x = sc.nextInt();
		
        System.out.println("ingrese la posicion de y");
		double y = sc.nextInt();
		
        System.out.println("register el nivel en el que se encontro el tesoro");
		int level = sc.nextInt();
		if (videoGameController.registerLevelTreasure(level, name, urlImagen, x, y)) {
			System.out.println("tesoro registrado correctamente");
		} else {
			System.out.println("Digite correctamente las opciones");
		}

	}

	/**
	 * 
	 */
	private static void modifyScore() {
		System.out.println("Digite su nombre");
		
		String name=sc.nextLine();

		System.out.println("Digite el valor que va modificar");

		int value=sc.nextInt();


		///// controladora
		//// BUSCAR EL USUARIO DADO UN NOMBRE
		/// CON EL USUARIO ENCONTRADO, AHI SI USAR EL GETSCORE PARA DESPUES MODIFICARLO USANDO EL SETSCORE 
		

		if(value<=10){
			
			System.out.println("tiene que ser un valor mayor a 10");
		
		}else{
			videoGameController.modifyScore(name, value);
			System.out.println("se ha modificado correctamenta el puntaje ");
		}

		/**
		 * 
		 * p.setInitialScore=sc.nextInt(); if(){ System.out.println("se ha modificado
		 * correctamente"); }else{ System.out.println("no se puede hacer esta"); }
		 * 
		 */
	}
	private static void enemyConsonants(){
		
		char[] consonantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		
		String typeEnemy="OGROS, ABSTRACTS, BOSSES, MAGIC"; 

		System.out.println("las consonates de los enemigos son"+typeEnemy);
		

	}
}