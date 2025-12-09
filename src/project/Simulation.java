package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
	
     private ArrayList<AbstractRobot> robot;
	 private ArrayList<Position> obstacle;
     
	 
     public Simulation() {
    	 
    	 this.robot=new ArrayList<>();
    	 this.obstacle=new ArrayList<>();
    	 
     }
	
     
	public void addRobot(AbstractRobot robot1) {
		this.robot.add(robot1);
	}
	
	
	public void addObstacle(int x, int y) {
		this.obstacle.add(new Position(x,y));
	}
	
	
	public ArrayList<AbstractRobot> getRobot() {
		return this.robot;
	}
	
	
	public ArrayList<Position> getObstacle() {
		return this.obstacle;
	}
	
	
	public void step() {
		System.out.println("\n numbre of stepes = 1");
		
		for (AbstractRobot robot : robot) {
			robot.avance();
			robot.afficher();
        }		
	}
	
	
	public void setp(int nb) {
		System.out.println("\n numbre of stepes = "+nb);
		
		for (int i=0 ; i<nb ;i++) {
			this.step();
			
		}
		
	}
	
	
	
	// text animation and colours 
	public static final String RESET = "\033[0m";
	public static final String RED = "\033[0;31m";
	public static final String GREEN = "\033[0;32m";
	public static final String YELLOW = "\033[0;33m";
	public static final String BLUE = "\033[0;34m";
	public static final String PURPLE = "\033[0;35m";
	public static final String CYAN = "\033[0;36m";
	public static final String WHITE = "\033[0;37m";
	
	public static final String BOLD = "\033[1m";
	public static final String UNDERLINE = "\033[4m";
	
	public static final String BG_BLUE = "\033[44m";
	public static final String BG_GREEN = "\033[42m";
	public static final String BG_RED = "\033[41m";
	
	
	private static void afficherMenuAnime() {
		try {
			// Nettoyer l'écran (optionnel)
			// System.out.print("\033[H\033[2J");
			// System.out.flush();
			
			System.out.println();
			
			// Animation de la bordure supérieure
			String ligne1 = "╔═══════════════════════════════════════╗";
			for (char c : ligne1.toCharArray()) {
				System.out.print(BLUE + BOLD + c + RESET);
				Thread.sleep(10);
			}
			System.out.println();
			
			// Titre avec animation
			String titre = "║       SIMULATION MENU                 ║";
			for (char c : titre.toCharArray()) {
				System.out.print(CYAN + BOLD + c + RESET);
				Thread.sleep(10);
			}
			System.out.println();
			
			// Bordure inférieure
			String ligne2 = "╚═══════════════════════════════════════╝";
			for (char c : ligne2.toCharArray()) {
				System.out.print(BLUE + BOLD + c + RESET);
				Thread.sleep(10);
			}
			System.out.println();
			System.out.println();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	private static void afficherOption(String numero, String texte, String emoji, String couleur) {
		System.out.println(couleur + numero + RESET + "  " + emoji + "  " + WHITE + texte + RESET);
	}
		

	
	
	
	
	
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		Simulation simu=new Simulation();

		
		try {
			System.out.println(YELLOW + BOLD);
			String welcome = "🌟 WELCOME TO ROBOT SIMULATION 🌟";
			for (char c : welcome.toCharArray()) {
				System.out.print(c);
				Thread.sleep(30);
			}
			System.out.println(RESET);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		int choice =-1;
		
		while(choice!=0) {
			
			afficherMenuAnime();
			afficherOption("1.  ", "exucute one step", "⏯️ ", GREEN);
			afficherOption("2.  ", "exucute many steps", "⏭️ ", GREEN);
			afficherOption("3.  ", "display only the SimpleRobot", "🤖", CYAN);
			afficherOption("4.  ", "display only the RobotNG", "🚀", CYAN);
			afficherOption("5.  ", "display all the  obstacles", "🚧", YELLOW);
			afficherOption("6.  ", "display all the  robots en turbo mode", "⚡", PURPLE);
			afficherOption("7.  ", "display all the  robots", "👥", CYAN);
			afficherOption("8.  ", "add SimpleRobot", "➕", GREEN);
			afficherOption("9.  ", "add RobotNG", "➕", GREEN);
			afficherOption("10. ", "add obstacle", "🔨", YELLOW);
			afficherOption("11. ", "turn droite for all robots", "↪️ ", BLUE);
			afficherOption("12. ", "turn gauche only for robotNG", "↩️ ", BLUE);
			afficherOption("13. ", "turn demitour only for robotNG", "🔄", BLUE);
			afficherOption("14. ", "diagonal movement only for robotNG ", "↗️ ", PURPLE);

			System.out.println();
			afficherOption("0.  ", "EXIT ❌", "", RED);

			System.out.println();
			System.out.print(YELLOW + "enter what do u want: " + RESET);

			
	        choice =scan.nextInt();
			
			switch (choice) {
			
			case 1 : simu.step();
			break;
			
			
			case 2 : System.out.println(CYAN + "enter numbre of steps u want : " + RESET);
			int ns=scan.nextInt();
			simu.setp(ns);
			break;
			
			case 3 : System.out.println(CYAN + " robot simple " + RESET);
			for(AbstractRobot robot : simu.getRobot()) {
				if (robot instanceof SimpleRobot) robot.afficher();
			}break;
			
			case 4: System.out.println(PURPLE + " robot NEW GEN " + RESET);
			for(AbstractRobot robot : simu.getRobot()) {
				if (robot instanceof RobotNG) robot.afficher();
			}break;
			
			
			case 5 : System.out.println(YELLOW + " all obstacles " + RESET);
			for (Position obs : simu.getObstacle())
				System.out.println(" obstacle = (X = "+obs.getX() + " , Y = "+obs.getY()+" ) ");
			break;
			
			case 6: System.out.println(PURPLE + " all the robot with turbo mode ON " + RESET);
			for(AbstractRobot robot : simu.getRobot())
				if (robot instanceof RobotNG && ((RobotNG) robot).getTurboMode()==true ) robot.afficher();
			break;
			
			case 7 : System.out.println(CYAN + " display all the robots " + RESET);
			for (AbstractRobot robot : simu.getRobot())
				robot.afficher();
			break;
			
			case 8: System.out.println(GREEN + " enter nom (char) : " + RESET);
			char nomm=scan.next().charAt(0);
			
			System.out.println(GREEN + " X =  " + RESET);
			int xx=scan.nextInt();
			
			System.out.println(GREEN + " Y =  " + RESET);
			int yy=scan.nextInt();
			
			System.out.println(GREEN + " direction (Nord,Sud ,Est, Ouest) : !!!!PLEASE ENTER THE FIRST LETTER IN UPPERCASE FORM !!!! " + RESET);
			
			String direc =scan.next();
			
			Direction dir = Direction.valueOf(direc);
			
			AbstractRobot robotsimple =new SimpleRobot(nomm,xx,yy,dir,simu);
			
			simu.addRobot(robotsimple);
			System.out.println(GREEN + "simple robot have been added to the list " + RESET);
			
			
			break;
			
			case 9 : System.out.println(GREEN + " enter nom (char) : " + RESET);
			char nomM=scan.next().charAt(0);
			
			System.out.println(GREEN + " X =  " + RESET);
			int xX=scan.nextInt();
			
			System.out.println(GREEN + " Y =  " + RESET);
			
			int yY=scan.nextInt();
			
			System.out.println(GREEN + " direction (Nord,Sud ,Est, Ouest) : !!!!PLEASE ENTER THE FIRST LETTER IN UPPERCASE FORM !!!!" + RESET);
			
			String direct =scan.next();
			
			Direction dirr = Direction.valueOf(direct);	
			
			System.out.println(GREEN + " turbo mode (true,false) = " + RESET);
			
			boolean turboo=scan.nextBoolean();
			
			
			AbstractRobot robotNG =new RobotNG(nomM,xX,yY,dirr,turboo,simu);
			simu.addRobot(robotNG);
			
			System.out.println(GREEN + "new gen robot have been added to the list " + RESET);
			
			break;
			
			case 10: System.out.println(YELLOW + " obstacle x :" + RESET);
			int obsX=scan.nextInt();
			 
			 System.out.println(YELLOW + " obstacle y :" + RESET);
			 int obsY=scan.nextInt();
			 simu.addObstacle(obsX, obsY);
			 
			 System.out.println(YELLOW + " obstacle have been added to the list " + RESET);
			 
			 break;
			 
			case 11 : System.out.println(BLUE + " turn right " + RESET);
			
			for(AbstractRobot robot : simu.getRobot())
				robot.droite();
			break;
			 
			case 12: System.out.println(BLUE + "turn left " + RESET);
			
			for (AbstractRobot robot : simu.getRobot())
				if (robot instanceof RobotNG robotng) robotng.gauche();
			break;
			
		
			case 13: System.out.println(BLUE + "turn demitour " + RESET);
			
			for (AbstractRobot robot: simu.getRobot())
				if (robot instanceof RobotNG robotng) robotng.demiTour();
			break;
			 
			case 14: System.out.println(PURPLE + " avanceDiagonale  " + RESET);
			
			for (AbstractRobot robot : simu.getRobot())
				if (robot instanceof RobotNG robotng) robotng.avanceDiagonale();
			break;
			 
			case 0 : System.out.println(RED + "exiting from the program ❌  ======> THANK U FOR USING MY PROGRAM " + RESET);
              break;
              
              default : System.out.println(RED + "invalid choice" + RESET);
              
			}
			
		}
		scan.close();
		
				
		
	}
}
