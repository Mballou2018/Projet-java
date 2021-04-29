
package sn.supinfo.javapoo.mini_projet.Imp;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.javapoo.mini_projet.Groupe;
import sn.supinfo.javapoo.mini_projet.Interface.IGroupe;


public class Groupe_Imp implements IGroupe {
    
    ArrayList<Groupe> groupes = new ArrayList<>();
    
    @Override
    public void addGroupe(Groupe groupe) {
        groupes.add(groupe);
    }

    @Override
    public void updateGroupe(Groupe groupe) {
        for(Groupe groupe2:groupes){
            if(groupe2.getId()==groupe.getId()){
                 groupe2.setNomGroupe(groupe.getNomGroupe());
                 groupe2.setDateCreation(groupe.getDateCreation());
                 }
         }
    }

    @Override
    public void deleteGroupe(Groupe groupe) {
        groupes.remove(groupe);
    }

    @Override
    public Groupe getGroupeByid(int i) {
        for(Groupe groupe:groupes){
             if(groupe.getId()==i){
                      return groupe;
             }
         }
         return null;
    }

    @Override
    public List<Groupe> getAllGroupe() {
        return groupes;
    }
    
    

}

    

