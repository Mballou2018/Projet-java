
package sn.supinfo.javapoo.mini_projet.Imp;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.javapoo.mini_projet.Etudiant;
import sn.supinfo.javapoo.mini_projet.Interface.IEtudiant;
import sn.supinfo.javapoo.mini_projet.Interface.IProfesseur;
import sn.supinfo.javapoo.mini_projet.Professeur;


public class Professeur_Imp implements IProfesseur{
    
    ArrayList<Professeur> professeurs = new ArrayList<>(); 
        
    @Override
    public void addProfesseur(Professeur professeur){
        professeurs.add(professeur);
    
    }
    
    @Override
     public void updateProfesseur(Professeur professeur){
        
         for(Professeur professeur2:professeurs){
         
             if(professeur2.getId()==professeur.getId()){
                 professeur2.setMatricule(professeur.getMatricule());
                 professeur2.setPrenom(professeur.getPrenom());
                 professeur2.setNom(professeur.getNom());
                 professeur2.setDateNaissance(professeur.getDateNaissance());
                 professeur2.setLieuNaissance(professeur.getLieuNaissance());
                 professeur2.setEmail(professeur.getEmail());
                 professeur2.setNationalite(professeur.getNationalite());
                 professeur2.setGenre(professeur.getGenre());
                 professeur2.setAdresse(professeur.getAdresse());
                 professeur2.setTelephone(professeur.getTelephone());
                 professeur2.setSituationMatrimoniale(professeur.getSituationMatrimoniale());
                 professeur2.setSpecialite(professeur.getSpecialite());
                 
                 
             }
         
         }
    
    }
    
    @Override
     public void deleteProfesseur(Professeur professeur){
         professeurs.remove(professeur);
    
    }
     
    @Override
     public Professeur getProfesseurByid(int i){
        for(Professeur professeur:professeurs){
             if(professeur.getId()==i){
                      return professeur;
             }
         }
         return null;
     }
     
     
   
     
     
     
     
    @Override
     public List<Professeur> getAllProfesseur(){
        return professeurs;
     
     }
    

}
