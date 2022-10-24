package ui;
import model.VideoGameController;
import java.util.Scanner;
import java.util.Random;

public class VideoGameManager{
    public static Scanner sc = new Scanner(System.in);
    public static VideoGameController videoGameController=new VideoGameController();
    public static boolean exit=false;
    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        System.out.println("Bienvenidos al juego");
        while(!exit){
            System.out.println("Digite una de las opcinones\n ");
            int opcinion=sc.nextInt();
            switch(opcinion){
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
                
                default:
                System.out.println("Digite correctamente la opcion 1, 2 y 3");
                break;
                }
            }
        }
        private static void createdPlayer(){
            System.out.println("ingrese el nickname");
            String nickName=sc.nextLine();
            System.out.println("ingrese el nombre");
            String name=sc.nextLine();
            int initialScore=10;
            int NumberofLives=5;
            if(videoGameController.registerPlayer( nickName,  name, initialScore,NumberofLives)){
            System.out.println("jugador registrado correctamente");
            }else{
                System.out.println("jugador no registrado correctamente");

            }
        }
        public static void Random(){
             Random random= new Random();
            int max=2560;
            int min=1440;
            int rage=(max-min)+1;   
            int numRandom=(int)(Math.Random)(max-min);
        }
        private static void createdLevel(){
            
            for (int=0;i<9;i++);
          System.out.println("ingrese en el nivel que esta ");
          int number=sc.nextInt();
           if(videoGameController.registerLevel(number))  {
            System.out.println(" level registrado correctamente");
          }else{
            System.out.println("level mal registrado ");
          }
        }
        private static void  registerLeverEnemy1(){
            System.out.println("registre  el enemigo");
            System.out.println("registre el nombre del enemigo ");
            String nameId=sc.nextLine(); 
            System.out.println("registre el tipo de enemigo ");

            ///// hacer switch case
            while(!exit){
            int opcinion=sc.nextInt();
            TypeEnemy enemiess;
            switch(opcinion){
                case 1:
                    enemiess=TypeEnemy.OGROS;
                    break;
                case 2:
                    enemiess=TypeEnemy.BOSSES;
                    break;
                case 3:
                    enemiess=TypeEnemy.MAGIC;
                    break;
                case 4:
                    enemiess=TypeEnemy.ABSTRACTS;
                    break;
                    default:
                    System.out.println("digite correctamente las opciones");
                    break;  
            }
        } 


            System.out.println("registre la posicion de x");
            double x=sc.nextDouble(); 
            System.out.println();
            double y=sc.nextDouble();
            System.out.println("registre el nivel que le quiera asignar al enemigo ");
            int level=sc.nextInt();
                    if(videoGameController.registerLeverEnemy(level,nameId, enemiess,x,y)){
                    System.out.println("enemigo registrado correctamente");
                    }else{
                    System.out.println("Digite correctamente las opciones");
                    }
                }   
            
            private static void  registerLevelTreasure1(){
                System.out.println("Digite el tesosro ");
                    System.out.println("Digite el nombre");
                    String name=sc.nextLine();
                    System.out.println("ingese imagen");
                    String urlImagen=sc.nextLine();
                    System.out.println("ingrese la posicion de x");
                    double x=sc.nextInt();
                    System.out.println("ingrese la posicion de y");
                    double  y=sc.nextInt();
                    System.out.println("register el nivel para asignar al tesosro");
                    int  level=sc.nextInt();
                    if(VideoGameController.registerLevelTreasure(level.name,urlImagen,x,y)){
                        System.out.println("tesoro registrado correctamente");
                    }else{
                        System.out.println("Digite correctamente las opciones");
                    }

                }       
            
            private static  void modifyScore(){
                System.out.println("Digite el valor que va modificar");
                p.setInitialScore=sc.nextInt();
                if(){
                    System.out.println("se ha modificado correctamente");
                }else{
                    System.out.println("no se puede hacer esta");
                }
                            
            }




        }
    
