
package sn.supinfo.javapoo.mini_projet.Interface;

import java.util.List;
import sn.supinfo.javapoo.mini_projet.Etudiant;


public interface IEtudiant {
    
    public void addEtudiant(Etudiant etudiant);
    
    public void updateEtudiant(Etudiant etudiant);
    
    public void deleteEtudiant(Etudiant etudiant);
    
    public Etudiant getEtudiantByid(int i);
    
    public List<Etudiant> getAllEtudiant();
   
    
    
}
