package project;

public class RobotNG extends AbstractRobot {
	private boolean turbo ;
	
	public RobotNG (char nom,boolean turbo,Simulation simulation) {  
		super(nom,simulation);  
		this.turbo=turbo;
		}
	
    public RobotNG (char nom,int x, int y,Direction direction,boolean turbo,Simulation simulation) {
		super(nom,x,y,direction,simulation);
		this.turbo=turbo;
    }
    
    
    
    
    @Override    
public void avance () {
    	
    	this.avance(1);
    }

    
    
// @overloading 
public void avance(int nombrePas) {
    
	int newX = super.getPosition().getX();
    int newY = super.getPosition().getY();

	
	if(turbo) {           //turbo mode (active) == nombrePas*3
		
    	if(super.getDirection()==Direction.Nord)         newY+= nombrePas *3; 
    	else if(super.getDirection()==Direction.Est)     newX+= nombrePas *3;
    	else if(super.getDirection()==Direction.Sud)     newY-= nombrePas *3;
    	else if(super.getDirection()==Direction.Ouest)   newX-=  nombrePas *3;
 }
		
    else {           //turbo mode (desactive) == nombrePas
    	
    	if(super.getDirection()==Direction.Nord)       newY+= nombrePas ;                
    	else if(super.getDirection()==Direction.Est)    newX+= nombrePas;          
    	else if(super.getDirection()==Direction.Sud)    newY-= nombrePas;    
    	else if(super.getDirection()==Direction.Ouest)  newX-=  nombrePas;     
    
    }
	
	if(super.checkPosition(newX,newY) ) {	super.setPosition(newX,newY);
	
	}
	
	else System.out.println(" the next position is not avilable ");
	
	
	
}


   @Override
    public void droite() {
		if ( super.getDirection()==Direction.Nord ) super.setDirection(Direction.Est);                //  nord -> est
    	else if( super.getDirection()==Direction.Est ) super.setDirection(Direction.Sud);            //  est -> sud 
    	else if ( super.getDirection()==Direction.Sud ) super.setDirection(Direction.Ouest);        //  sud -> ouest
    	else if ( super.getDirection()==Direction.Ouest ) super.setDirection(Direction.Nord);      //  ouest ->nord
    }
   
   
   
   
   public void gauche() {
	   if ( super.getDirection()==Direction.Nord ) super.setDirection(Direction.Ouest);          //  nord -> ouest
   	else if( super.getDirection()==Direction.Ouest ) super.setDirection(Direction.Sud);         //  ouest -> sud 
   	else if ( super.getDirection()==Direction.Sud ) super.setDirection(Direction.Est);         //  sud -> est
   	else if ( super.getDirection()==Direction.Est ) super.setDirection(Direction.Nord);       //  est ->nord
   }
    	
   
   
   public void demiTour() {
	   if ( super.getDirection()==Direction.Nord ) super.setDirection(Direction.Sud);               //  nord -> sud
	   	else if( super.getDirection()==Direction.Sud ) super.setDirection(Direction.Nord);         //  sud -> nord 
	   	else if ( super.getDirection()==Direction.Ouest ) super.setDirection(Direction.Est);      //  ouest -> est
	   	else if ( super.getDirection()==Direction.Est ) super.setDirection(Direction.Ouest);     //  est -> ouest

	   
	   
	   
   }
   
   
   public void avanceDiagonale() {
	                       // (0,0) nord  
	   this.avance();     // (0,1)  nord
	   this.droite();    // (0,1)   est
	   this.avance();   // (1,1)    est
	   this.gauche();  // (1,1)     nord direction principale
	   
	   
   }
   
  
   
   @Override
    public String toString() {
    	return "nom : "+this.getNom() +
      		  " position ( X : "+this.getPosition().getX() + " /  Y : "+this.getPosition().getY() +" ) "+
      		  " direction : "+this.getDirection()+
              " turbo : "+ (this.turbo ? "active" : "desactive");	 
    }
   
   public void activeTurbo() {
	    this.turbo = true;
	}

	public void desactiveTurbo() {
	    this.turbo = false;
	}

	public boolean getTurboMode() {
	    return this.turbo;
	}
    
}
