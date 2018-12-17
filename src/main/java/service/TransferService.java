package service;

import metier.Account;
import metier.Client;

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
		boolean transferOK = true;
        Client client = this.daoClient.read(clientId);
        Account compteDebite = client.getAccountById(debitId);
        Account compteCredite = client.getAccountById(creditId);
        if (compteDebite.getId() == compteCredite.getId()) {
            return transferOK;
        } else if (compteDebite.getBalance() - value < 0) {
            transferOK = false;
            return transferOK;
        } else {
            compteCredite.setBalance(compteCredite.getBalance() + value);
            this.daoAccount.update(compteCredite);

            compteDebite.setBalance(compteDebite.getBalance() - value);
            this.daoAccount.update(compteDebite);

            return transferOK;
        }
    }

}
