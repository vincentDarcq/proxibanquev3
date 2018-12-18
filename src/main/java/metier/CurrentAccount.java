package metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Classe représentant un compte courant. 
 * 
 * @author Adminl
 *
 */
@Entity
@DiscriminatorValue("CURRENT")
public class CurrentAccount extends Account {

}
