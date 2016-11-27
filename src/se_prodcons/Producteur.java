package se_prodcons;

import jus.poc.prodcons.*;

public class Producteur extends Acteur implements _Producteur{

	
	public Producteur(int type, Observateur obs, int moy, int deviation) throws ControlException {
		super(type,obs,moy,deviation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int nombreDeMessages() {
		// TODO Auto-generated method stub
		return 0;
	}

}
