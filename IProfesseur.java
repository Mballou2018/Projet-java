
package sn.supinfo.javapoo.mini_projet.Interface;

import java.util.List;
import sn.supinfo.javapoo.mini_projet.Etudiant;
import sn.supinfo.javapoo.mini_projet.Professeur;


public interface IProfesseur {
    
    public void addProfesseur(Professeur professeur);
    
    public void updateProfesseur(Professeur professeur);
    
    public void deleteProfesseur(Professeur professeur);
    
    public Professeur getProfesseurByid(int i);
    
    public List<Professeur> getAllProfesseur();
   
    

}
