
package sn.supinfo.javapoo.mini_projet.Interface;

import java.util.List;
import sn.supinfo.javapoo.mini_projet.Groupe;
import sn.supinfo.javapoo.mini_projet.Professeur;


public interface IGroupe {
     public void addGroupe(Groupe groupe);
    
    public void updateGroupe(Groupe groupe);
    
    public void deleteGroupe(Groupe groupe);
    
    public Groupe getGroupeByid(int i);
    
    public List<Groupe> getAllGroupe();
}
