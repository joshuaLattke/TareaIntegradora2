package ui;
import model.Enemy;
import model.VideoGameController;
import java.util.Scanner;

public class VideoGameManager{
    public static Scanner sc = new Scanner(System.in);
    public static VideoGameController videoGameController=new VideoGameController();

    public static void main(String[] args){
        menu();
    }
    public static void menu(){
        System.out.println("Bienvenidos al juego");

        boolean exit=false;
        while(!exit){
            System.out.println("Digite una de las opcinones\n ");
            int opcinion=sc.nextInt();
            switch(opcinion){
            case 1:
            registerPlayer1();
                break;
            case 2: 
                registerLeverEnemy1();
                break;
            case 3: 
                registerLevelTreasure1();
                break;
                case 4:
                modifyScore();
                default:
                System.out.println("Digite correctamente la opcion 1, 2 y 3");
                break;
            }
            }
        }
        private static void registerPlayer1(){
            System.out.println("ingrese el nickname");
            String nickName=sc.nextLine();
            System.out.println("ingrese el nombre");
            String name=sc.nextLine();
            int initialScore=10;
            int NumberofLives=5;
            if(videoGameController.registerPlayer( nickName,  name, initialScore,NumberofLives){
            System.out.println("jugador registrado correctamente");
            }else{
                System.out.println("jugador no registrado correctamente");

            }
        }
        private static void  registerLeverEnemy1(){
            System.out.println("registre  el enemigo");
            System.out.println("registre el nombre del enemigo ");
            String nameId=sc.nextLine(); 
            System.out.println("registre el tipo de enemigo ");

            ///// hacer switch case

            Enemy  typeEnemy; 
            switch(Enemy)

            System.out.println("registre la posicion de x");
            double x; 
            System.out.println();
            double y; 
            System.out.println("registre el nivel que le quiera asignar al enemigo ");
            int level=sc.nextInt();
                    if(videoGameController.registerLeverEnemy(level,nameId, typeEnemy,x,y)){
                    System.out.println("enemigo registrado correctamente");
                    }else{
                    System.out.println("Digite correctamente las opciones");
                    }
                }   
            
            private static void  registerLevelTreasure1(){
                System.out.println("Digite el tesoro");
                    System.out.println("Digite el nombre");
                    String name=sc.nextLine();
                    System.out.println("");
                    
                    if(VideoGameController.registerLevelTreasure(name,urlImagen,x,y,level)){
                        System.out.println("tesoro registrado correctamente");
                    }else{
                        System.out.println("Digite correctamente las opciones");
                    }

                }       
            
            private static  void modifyScore(){
                            
            }




        }
    
