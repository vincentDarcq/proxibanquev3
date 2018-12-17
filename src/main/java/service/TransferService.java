package service;



public class TransferService {
	
	/**	/**
	 * Permet de faire un virement entre deux comptes d'un m�me client. Cette
	 * m�thode ne fait pas de virement intra-compte ni de virement qui rendrait le
	 * compte d�bit� en solde n�gatif.
	 * 
	 * @param value         Le montant du virement � effectuer.
	 * @param compteDebite  Le compte � d�biter.
	 * @param compteCredite Le compte � cr�diter
	 * @return False si le virement aurait rendu le compte d�bit� en solde n�gatif.
	 *         True sinon.
	 *
	 * @return
	 */
	public boolean transfer(Float value, Integer debitId, Integer creditId, Integer clientId) {
<<<<<<< HEAD

		return false;


        }

=======
            return true;
        }
>>>>>>> 0cce6fda43deeb1bbaacfaf1407394a627d27cda
    }


