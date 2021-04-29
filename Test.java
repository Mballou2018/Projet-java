
package sn.supinfo.javapoo.mini_projet;

import java.util.List;
import java.util.Scanner;
import sn.supinfo.javapoo.mini_projet.Etudiant;
import sn.supinfo.javapoo.mini_projet.Groupe;
import sn.supinfo.javapoo.mini_projet.Imp.Etudiant_Imp;
import sn.supinfo.javapoo.mini_projet.Imp.Groupe_Imp;
import sn.supinfo.javapoo.mini_projet.Imp.Professeur_Imp;
import sn.supinfo.javapoo.mini_projet.Professeur;
import sn.supinfo.javapoo.mini_projet.Imp.Groupe_Etudiant_Imp;



public class Test {
    public static void main(String args[]){
                        Groupe_Imp groupe_Imp = new Groupe_Imp();
                        Etudiant_Imp etudiant_Imp = new Etudiant_Imp();
                        Professeur_Imp professeur_Imp = new Professeur_Imp();
                        Groupe_Imp gi = new Groupe_Imp();
                        Groupe_Etudiant_Imp groupe_Etudiant_Imp;

        
        boolean var = true;
        
        while(var){
            
        System.out.println("Menu Principal");
  
        System.out.println("1-Gestion Groupe");
        System.out.println("2-Gestion Etudiant");
        System.out.println("3-Gestion Professeur");
        System.out.println("4-Gestion Groupe_Etudiant");
        System.out.println("5-Quitter");
        System.out.println("");
        System.out.println("Entrez votre choix: ");
        Scanner scanner= new Scanner(System.in);
        int choix = scanner.nextInt();
        switch(choix){
            case 1:
                boolean var1 = true;
                while(var1){
                System.out.println("Gestion Groupe");
                System.out.println("1-Creer un Groupe");
                System.out.println("2-Modifier un Groupe");
                System.out.println("3-Voir les details d'un Groupe");
                System.out.println("4-Supprimer un Groupe");
                System.out.println("5-Afficher tous les Groupes");
                System.out.println("6-Quitter");
                System.out.println("");
                System.out.println("Entrez votre choix: ");
                int choixGroupe = scanner.nextInt();
        switch(choixGroupe){
            case 1:
                System.out.println("1-Creer un Groupe");
                System.out.println(" Entrer l'Id:");
                int id = scanner.nextInt();
                System.out.println("Entrer  le Nom du Groupe:");
                String nomGroupe = scanner.next();
                System.out.println("Entrer la Date de Creation:");
                String dateCreation = scanner.next();
                Groupe groupe = new Groupe(id,nomGroupe,dateCreation);
                groupe_Imp.addGroupe(groupe);
                System.out.println("Groupe creer avec succès");
                break; 
                
            case 2:
                System.out.println("2-Modifier un Groupe");
                System.out.println("Entrer l'Id: ");
                int idMod = scanner.nextInt();
                Groupe groupe2 = groupe_Imp.getGroupeByid(idMod);
                groupe_Imp.updateGroupe(groupe2);
                System.out.println("Entrer le Nom du Groupe:");
                String nomGroupeG = scanner.next();
                groupe2.setNomGroupe(nomGroupeG);
                System.out.println("Entrer la Date de Creation:");
                String dateCreationG= scanner.next();
                groupe2.setDateCreation(dateCreationG);
                System.out.println("Groupe modifié avec succès");
                break;
                
            case 3:
                System.out.println("3-Voir les details d'un Groupe");
                System.out.println("Entrer l'Id: ");
                int idG = scanner.nextInt();
                Groupe groupe3 = groupe_Imp.getGroupeByid(idG);
                System.out.println(groupe3.getNomGroupe());
                System.out.println(groupe3.getDateCreation());
                System.out.println("Details du Groupe");
                
                break;
                
            case 4:
                System.out.println("4-Supprimer un Groupe");
                System.out.println("Entrer l'Id: ");
                int Id = scanner.nextInt();
                Groupe groupe4 = groupe_Imp.getGroupeByid(Id);
                groupe_Imp.deleteGroupe(groupe4);
                System.out.println("Groupe Supprimé avec succès");
               
                break;

                
            case 5:
                System.out.println("5-Afficher tous les Groupes");
                List<Groupe> groupes = groupe_Imp.getAllGroupe();
                for(Groupe groupe5:groupes){
                    System.out.println(groupe5.getId());
                    System.out.println(groupe5.getNomGroupe());
                    System.out.println(groupe5.getDateCreation());

                }
                
                break;
                
            case 6:
                System.out.println("6-Quitter");
                
                var1 = false;
                var = true;
                break;
           
            default:
                System.out.println("Choix invalid");
        }}      break;
        
     
        
            case 2:
                
                boolean var2 = true;
        
                while(var2){
                System.out.println("Gestion Etudiant");
                System.out.println("1-Ajouter un Etudiant");
                System.out.println("2-Modifier un Etudiant");
                System.out.println("3-Voir les details d'un Etudiant");
                System.out.println("4-Supprimer un Etudiant");
                System.out.println("5-Afficher tous les Etudiants");
                System.out.println("6-Quitter");
                System.out.println("");
                System.out.println("Entrez votre choix: ");
                int choixEtudiant = scanner.nextInt();
        switch(choixEtudiant){
            case 1:
                System.out.println("1-Ajouter un Etudiant");
                System.out.println("Entrer l'Id:");
                int id = scanner.nextInt();
                System.out.println("Entrer le Matricule:");
                String matricule = scanner.next();
                System.out.println("Entrer le Nom:");
                String nom = scanner.next();
                System.out.println("Entrer Prenom:");
                String prenom = scanner.next();
                System.out.println("Entrer la Date de Naissance:");
                String dateNaissance = scanner.next();
                System.out.println("Entrer le Lieu de Naissance:");
                String lieuNaissance = scanner.next();
                System.out.println("Entrer l'Email:");
                String email = scanner.next();
                System.out.println("Entrer la Nationalite:");
                String nationalite = scanner.next();
                System.out.println("Entrer le Genre:");
                String genre = scanner.next();
                System.out.println("Entrer l'Adresse:");
                String adresse = scanner.next();
                System.out.println("Entrer le Numero de Telephone:");
                String telephone = scanner.next();
                System.out.println("Quelle est la Situation Matrimoniale:");
                String situationMatrimoniale = scanner.next();
                System.out.println("Entrer le Groupe Sanguin:");
                String groupeSanguin = scanner.next();

                Etudiant etudiant = new Etudiant(id, matricule,prenom,nom,dateNaissance,lieuNaissance,adresse,telephone,email,nationalite,genre,situationMatrimoniale,groupeSanguin);
                
                etudiant_Imp.addEtudiant(etudiant);
                
                System.out.println("Ajout Etudiant effectuer avec succès");
                break; 
                
            case 2:
                System.out.println("2-Modifier un Etudiant");
                System.out.println("Id: ");
                int idMod = scanner.nextInt();
                                
                Etudiant etudiant2 = etudiant_Imp.getEtudiantByid(idMod);
                
                etudiant_Imp.updateEtudiant(etudiant2);
                
                System.out.println("Entrer le Matricule:");
                String matriculeE = scanner.next();
                etudiant2.setMatricule(matriculeE);
                System.out.println("Entrer le Nom:");
                String nomE = scanner.next();
                etudiant2.setNom(nomE);
                System.out.println("Entrer Prenom:");
                String prenomE = scanner.next();
                etudiant2.setPrenom(prenomE);
                System.out.println("Entrer la Date de Naissance:");
                String dateNaissanceE = scanner.next();
                etudiant2.setDateNaissance(dateNaissanceE);
                System.out.println("Entrer le Lieu de Naissance:");
                String lieuNaissanceE = scanner.next();
                etudiant2.setLieuNaissance(lieuNaissanceE);
                System.out.println("Entrer l'Email:");
                String emailE = scanner.next();
                etudiant2.setEmail(emailE);
                System.out.println("Entrer la Nationalite:");
                String nationaliteE = scanner.next();
                etudiant2.setNationalite(nationaliteE);
                System.out.println("Entrer le Genre:");
                String genreE = scanner.next();
                etudiant2.setGenre(genreE);
                System.out.println("Entrer l'Adresse:");
                String adresseE = scanner.next();
                etudiant2.setAdresse(adresseE);
                System.out.println("Entrer le Numero de Telephone:");
                String telephoneE= scanner.next();
                etudiant2.setTelephone(telephoneE);
                System.out.println("Quelle est la Situation Matrimoniale:");
                String situationMatrimonialeE = scanner.next();
                etudiant2.setSituationMatrimoniale(situationMatrimonialeE);
                System.out.println("Entrer le Groupe Sanguin:");
                String groupeSanguinE = scanner.next();
                etudiant2.setGroupeSanguin(groupeSanguinE);
                System.out.println("Etudiant modifié avec succès");
       
                break;
                
            case 3:
                System.out.println("3-Voir les details d'un Etudiant");
                System.out.println("Entrer l'Id: ");
                int idE = scanner.nextInt();
                
                Etudiant etudiant3 = etudiant_Imp.getEtudiantByid(idE);
                System.out.println(etudiant3.getMatricule());
                System.out.println(etudiant3.getNom());
                System.out.println(etudiant3.getPrenom());
                System.out.println(etudiant3.getDateNaissance());
                System.out.println(etudiant3.getLieuNaissance());
                System.out.println(etudiant3.getEmail());
                System.out.println(etudiant3.getNationalite());
                System.out.println(etudiant3.getGenre());
                System.out.println(etudiant3.getAdresse());
                System.out.println(etudiant3.getTelephone());
                System.out.println(etudiant3.getSituationMatrimoniale());
                System.out.println(etudiant3.getGroupeSanguin());
                System.out.println("Details de l'Etudiant");
                
                break;
                
            case 4:
                System.out.println("4-Supprimer un Etudiant");
                System.out.println("Entre l'Id: ");
                int Id = scanner.nextInt();
                Etudiant etudiant4 = etudiant_Imp.getEtudiantByid(Id);
                
                etudiant_Imp.deleteEtudiant(etudiant4);
                System.out.println("Etudiant Supprimé avec succès");
                break;
                
            case 5:
                System.out.println("5-Afficher tous les Etudiants");
                
                List<Etudiant> etudiants = etudiant_Imp.getAllEtudiant();
                for(Etudiant etudiant5:etudiants){
                    System.out.println(etudiant5.getId());
                    System.out.println(etudiant5.getMatricule());
                    System.out.println(etudiant5.getPrenom());
                    System.out.println(etudiant5.getNom());
                    System.out.println(etudiant5.getDateNaissance());
                    System.out.println(etudiant5.getLieuNaissance());
                    System.out.println(etudiant5.getAdresse());
                    System.out.println(etudiant5.getTelephone());
                    System.out.println(etudiant5.getEmail());
                    System.out.println(etudiant5.getNationalite());
                    System.out.println(etudiant5.getGenre());
                    System.out.println(etudiant5.getSituationMatrimoniale());
                    System.out.println(etudiant5.getGroupeSanguin());   
                   
                }
                break;
                
                
                
                
                
            case 6:
                System.out.println("6-Quitter");
                
                var2 = false;
                var = true;
                break;
                
            default:
                System.out.println("Choix invalid");
        }}      break;
        
        
            case 3:
                
                boolean var3 = true;
        
                while(var3){
                System.out.println("Gestion Professeur");
                System.out.println("1-Ajouter un Professeur");
                System.out.println("2-Modifier un Professeur");
                System.out.println("3-Voir les details d'un Professeur");
                System.out.println("4-Supprimer un Professeur");
                System.out.println("5-Afficher tous les Professeurs");
                System.out.println("6-Quitter");
                System.out.println("");
                System.out.println("Entrez votre choix: ");
                int choixProfesseur = scanner.nextInt();
        switch(choixProfesseur){
            case 1:
                System.out.println("1-Ajouter un Etudiant");
                System.out.println("Entrer l'Id:");
                int id = scanner.nextInt();
                System.out.println("Entrer le Matricule:");
                String matricule = scanner.next();
                System.out.println("Entrer le Nom:");
                String nom = scanner.next();
                System.out.println("Entrer Prenom:");
                String prenom = scanner.next();
                System.out.println("Entrer la Date de Naissance:");
                String dateNaissance = scanner.next();
                System.out.println("Entrer le Lieu de Naissance:");
                String lieuNaissance = scanner.next();
                System.out.println("Entrer l'Email:");
                String email = scanner.next();
                System.out.println("Entrer la Nationalite:");
                String nationalite = scanner.next();
                System.out.println("Entrer le Genre:");
                String genre = scanner.next();
                System.out.println("Entrer l'Adresse:");
                String adresse = scanner.next();
                System.out.println("Entrer le Numero de Telephone:");
                String telephone = scanner.next();
                System.out.println("Quelle est la Situation Matrimoniale:");
                String situationMatrimoniale = scanner.next();
                System.out.println("Entrer la Specialite:");
                String Specialite = scanner.next();
                System.out.println("Ajout Professeur effectuer avec succès");
                break; 
                
                
            case 2:
                System.out.println("2-Modifier un Professeur");
                System.out.println("Entrer l'Id: ");
                int idMod1 = scanner.nextInt();
                Professeur professeur2 = professeur_Imp.getProfesseurByid(idMod1);
                professeur_Imp.updateProfesseur(professeur2);
                System.out.println("Entrer le Matricule:");
                String matriculeP = scanner.next();
                professeur2.setMatricule(matriculeP);
                System.out.println("Entrer le Nom:");
                String nomP = scanner.next();
                professeur2.setNom(nomP);
                System.out.println("Entrer Prenom:");
                String prenomP = scanner.next();
                professeur2.setPrenom(prenomP);
                System.out.println("Entrer la Date de Naissance:");
                String dateNaissanceP = scanner.next();
                professeur2.setDateNaissance(dateNaissanceP);
                System.out.println("Entrer le Lieu de Naissance:");
                String lieuNaissanceP = scanner.next();
                professeur2.setLieuNaissance(lieuNaissanceP);
                System.out.println("Entrer l'Email:");
                String emailP = scanner.next();
                professeur2.setEmail(emailP);
                System.out.println("Entrer la Nationalite:");
                String nationaliteP = scanner.next();
                professeur2.setNationalite(nationaliteP);
                System.out.println("Entrer le Genre:");
                String genreP = scanner.next();
                professeur2.setGenre(genreP);
                System.out.println("Entrer l'Adresse:");
                String adresseP = scanner.next();
                professeur2.setAdresse(adresseP);
                System.out.println("Entrer le Numero de Telephone:");
                String telephoneP= scanner.next();
                professeur2.setTelephone(telephoneP);
                System.out.println("Quelle est la Situation Matrimoniale:");
                String situationMatrimonialeP = scanner.next();
                professeur2.setSituationMatrimoniale(situationMatrimonialeP);
                System.out.println("Specialite:");
                String specialiteP = scanner.next();
                professeur2.setSpecialite(specialiteP);
                System.out.println("Professeur modifié avec succès");
                
                break;
                
            case 3:
                System.out.println("3-Voir les details d'un Professeur");
                
                System.out.println("Entrer l'Id: ");
                int idP = scanner.nextInt();
                
                Professeur professeur3 = professeur_Imp.getProfesseurByid(idP);
                System.out.println(professeur3.getMatricule());
                System.out.println(professeur3.getNom());
                System.out.println(professeur3.getPrenom());
                System.out.println(professeur3.getDateNaissance());
                System.out.println(professeur3.getLieuNaissance());
                System.out.println(professeur3.getEmail());
                System.out.println(professeur3.getNationalite());
                System.out.println(professeur3.getGenre());
                System.out.println(professeur3.getAdresse());
                System.out.println(professeur3.getTelephone());
                System.out.println(professeur3.getSituationMatrimoniale());
                System.out.println(professeur3.getSpecialite());
                System.out.println("Details du Professeur");
                
                
                break;
                
            case 4:
                System.out.println("4-Supprimer un Professeur");
                
                System.out.println("Entrer l'Id: ");
                int Id = scanner.nextInt();
                
                Professeur professeur4 = professeur_Imp.getProfesseurByid(Id);
                
                professeur_Imp.deleteProfesseur(professeur4);
                System.out.println("Professeur Supprimé avec succès");
                
                break;
                
            case 5:
                System.out.println("5-Afficher tous les Professeurs");
                
                List<Professeur> professeurs = professeur_Imp.getAllProfesseur();
                for(Professeur professeur5:professeurs){
                    System.out.println(professeur5.getId());
                    System.out.println(professeur5.getMatricule());
                    System.out.println(professeur5.getPrenom());
                    System.out.println(professeur5.getNom());
                    System.out.println(professeur5.getDateNaissance());
                    System.out.println(professeur5.getLieuNaissance());
                    System.out.println(professeur5.getAdresse());
                    System.out.println(professeur5.getTelephone());
                    System.out.println(professeur5.getEmail());
                    System.out.println(professeur5.getNationalite());
                    System.out.println(professeur5.getGenre());
                    System.out.println(professeur5.getSituationMatrimoniale());
                    System.out.println(professeur5.getSpecialite());   
                   
                }
                
                break;
                
            case 6:
                System.out.println("6-Quitter");
                
                var3 = false;
                var = true;
                break;
                
            default:
                System.out.println("Choix invalid");
        }}      break;
        
            case 4:
                
                boolean var4 = true;
        
                while(var4){
                System.out.println("*****************Gestion Groupe_Etudiant*******************");
                
                System.out.println("1-Ajouter un Etudiant dans un Groupe");
                System.out.println("2-Supprimer un Etudiant dans un Groupe");
                System.out.println("5-Afficher tous etudiants dans un Groupe");
                System.out.println("6-Quitter");
                
                System.out.println("");
                System.out.println("Entrez votre choix: ");
                
                int choixGE = scanner.nextInt();
        
        switch(choixGE){
            case 1:
                System.out.println("1-Ajouter un Etudiant dans un Groupe");
                System.out.println("Entrer l'Id:");
                int id = scanner.nextInt();
                Groupe gp = gi.getGroupeByid(id);
                groupe_Etudiant_Imp = new Groupe_Etudiant_Imp(gp,etudiant_Imp.getAllEtudiant());
                System.out.println("Etudiant ajoute dans un Groupe avec succes");

                break;
            case 2:
                System.out.println("");
                break; 
            case 3:
                System.out.println("2-Afficher tous etudiants dans un Groupe");
                break; 
            case 4:
                System.out.println("3-Afficher tous etudiants dans un Groupe");
                break;
            case 5:
                System.out.println("4-Quitter");
                
                var4 = false;
                var4 = true;
                break;
            default:
                System.out.println("5-Choix Invalid");
                //groupeEtudiantImp.showEtudiantGroupe();
        }}
                break;
            
            case 5:
                System.out.println("Byyyyyyyyyyyyyyyyy");
                System.exit(0);
                break;
                
            default:
                System.out.println("Choix invalid"); 
                break;
        
        } 
    } }
}
