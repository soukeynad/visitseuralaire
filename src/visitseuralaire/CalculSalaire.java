package visitseuralaire;
import visitseuralaire.Directeur; 


public class CalculSalaire implements Ivisiteursalaire  {

	
	public double VisitDirecteur(Directeur d) {
		// TODO Auto-generated method stub
		return (1223);
	}


	@Override
	public double Visitcommercant(Commercant c) {
		// TODO Auto-generated method stub
		return 3345;
	}

	@Override
	public double Visitmanager(Manager m) {
		// TODO Auto-generated method stub
		return 4466;
	}

	@Override
	public double Visitouvrier(Ouvrier o) {
		// TODO Auto-generated method stub
		return 4455;
	}
	
}
