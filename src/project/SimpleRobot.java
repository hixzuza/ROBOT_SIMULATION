package project;

public class SimpleRobot extends AbstractRobot {

	
	public SimpleRobot (char nom,Simulation simulation) {  
		super(nom,simulation);  
		}
	
    public SimpleRobot (char nom,int x, int y,Direction direction,Simulation simulation) {
		super(nom,x,y,direction,simulation);
	         
    }

   
    
    
    public void avance() {
    	
    	int newX = super.getPosition().getX();
        int newY = super.getPosition().getY();
        
    	switch(super.direction) {
        case Nord:  newY=newY+1;   break;
        case Est:   newX=newX+1;   break;
        case Sud:   newY=newY-1;   break;  
        case Ouest: newX=newX-1;   break;
    }
    	
    	if(super.checkPosition(newX,newY) ) {	super.setPosition(newX,newY);
    		
    	}
    	
    	else System.out.println(" the next position is not avilable ");
    	
    	
    	
    }
    @Override
    public void droite() {
         	if ( super.getDirection()==Direction.Nord ) super.setDirection(Direction.Est);         //  nord -> est
    	else if( super.getDirection()==Direction.Est ) super.setDirection(Direction.Sud);          //  est -> sud 
    	else if ( super.getDirection()==Direction.Sud ) super.setDirection(Direction.Ouest);       //  sud -> ouest
    	else if ( super.getDirection()==Direction.Ouest ) super.setDirection(Direction.Nord);      //  ouest ->nord
  
    }
    
    
    
        @Override
    public String toString() {
    	return "nom : "+this.getNom() +
    		  " position ( x : "+super.getPosition().getX() + " / y : "+super.getPosition().getY() +" ) "+
    		  " direction : "+super.getDirection();
    	
    }

}
