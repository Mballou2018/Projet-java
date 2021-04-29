
package sn.supinfo.javapoo.mini_projet.Imp;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.javapoo.mini_projet.Etudiant;
import sn.supinfo.javapoo.mini_projet.Interface.IEtudiant;

public class Etudiant_Imp implements IEtudiant{
    
    ArrayList<Etudiant> etudiants = new ArrayList<>();
        
    @Override
    public void addEtudiant(Etudiant etudiant){
        etudiants.add(etudiant);
    
    }
    
    @Override
     public void updateEtudiant(Etudiant etudiant){
        
         for(Etudiant etudiant2:etudiants){
         
             if(etudiant2.getId()==etudiant.getId()){
                 etudiant2.setMatricule(etudiant.getMatricule());
                 etudiant2.setPrenom(etudiant.getPrenom());
                 etudiant2.setNom(etudiant.getNom());
                 etudiant2.setDateNaissance(etudiant.getDateNaissance());
                 etudiant2.setLieuNaissance(etudiant.getLieuNaissance());
                 etudiant2.setEmail(etudiant.getEmail());
                 etudiant2.setNationalite(etudiant.getNationalite());
                 etudiant2.setGenre(etudiant.getGenre());
                 etudiant2.setAdresse(etudiant.getAdresse());
                 etudiant2.setTelephone(etudiant.getTelephone());
                 etudiant2.setSituationMatrimoniale(etudiant.getSituationMatrimoniale());
                 etudiant2.setGroupeSanguin(etudiant.getGroupeSanguin());
                 
                 
             }
         
         }
    
    }
    
    @Override
     public void deleteEtudiant(Etudiant etudiant){
         etudiants.remove(etudiant);
    
    }
     
    @Override
     public Etudiant getEtudiantByid(int i){
        for(Etudiant etudiant:etudiants){
             if(etudiant.getId()==i){
                      return etudiant;
             }
         }
         return null;
     }
      
     
    @Override
     public List<Etudiant> getAllEtudiant(){
        return etudiants;
    }

    Etudiant getEtudiantById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Iterable<Etudiant> getEtudiants() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
}
