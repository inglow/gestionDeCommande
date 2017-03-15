/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.mongodb.Mongo;
import com.mycompany.gestiondecommande.Person;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import services.GestionCommande;

/**
 *
 * @author inglow
 */
public class Main {
       private static final Log log = LogFactory.getLog(Main.class);
  public static void main(String[] args) {

		GestionCommande gestionCommande = new GestionCommande();
		int typeProduit = 1;
		int nombreProduits = 5;
		gestionCommande.creerCommande(typeProduit, nombreProduits);
		 try {
            MongoOperations mongoOps = new MongoTemplate(new Mongo(), "gestionDeCommande");
            mongoOps.insert(new Person("Joe", 36));
            log.info(mongoOps.findOne(new Query(Criteria.where("name").is("Joe")), Person.class));
            
        }
        catch(UnknownHostException ex) {
            log.error(ex.getMessage());
        }
	}  
}
