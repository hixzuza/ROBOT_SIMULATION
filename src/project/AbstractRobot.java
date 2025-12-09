package project;

public abstract class AbstractRobot  implements Movable{
	protected char nom;
	protected Position position;
	protected Direction direction;
	protected Simulation simulation;
	
	
	public AbstractRobot(char nom,Simulation simulation ) {
		this.nom=nom;
		this.position=new Position(0,0);
		this.direction=Direction.Est;
		this.simulation= simulation;
	}
	
	
	public AbstractRobot(char nom,int x, int y,Direction direction ,Simulation simulation) {
		
		this.nom=nom;
		this.position=new Position(x,y);
		this.direction=direction;
		this.simulation= simulation;
		
			}
	
	public abstract void avance();

	public abstract void droite();
	
	public abstract String toString();

	
    public final boolean checkPosition(int x, int y) {
	
	for ( Position obs : simulation.getObstacle()) {
	
		if (obs.getX()==x && obs.getY()==y)return false;
		
	}
	
	for (AbstractRobot robot1 : simulation.getRobot()) {
	
		if(robot1.getPosition().getX()==x && robot1.getPosition().getY()==y ) return false;
	}

	return true;

}
		
	
	public final char directionLetter() {
		switch (direction) {
        case Nord: return 'N';
        case Sud: return 'S';
        case Est:  return 'E';
        case Ouest:  return 'O';
        default:    return ' ';	    }
	}
	
	public final void afficher() {
	    System.out.println(this.toString());
	}
    
	public void setNom(char nom) {
		this.nom=nom;
	}
	
	
	public void setPosition(int x,int y) {
		this.position.setX(x);
		this.position.setY(y);
	}
	
	

	public void setDirection(Direction direction) {
		this.direction=direction;
	}
	
	
	
	public String getNom() {
		return this.nom + "(" + directionLetter() + ")";
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public Direction getDirection() {
		return this.direction;
	
	}



}
