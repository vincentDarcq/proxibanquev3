package service;

import metier.Account;
import metier.Client;

public class TransferService {
	
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
