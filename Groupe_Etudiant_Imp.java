
package sn.supinfo.javapoo.mini_projet.Imp;

import java.util.ArrayList;
import java.util.List;
import sn.supinfo.javapoo.mini_projet.Etudiant;
import sn.supinfo.javapoo.mini_projet.Groupe;
import sn.supinfo.javapoo.mini_projet.Interface.IGroupe_Etudiant;


public class Groupe_Etudiant_Imp implements IGroupe_Etudiant {
    private Groupe groupe;
    
    Etudiant_Imp etudiant= new Etudiant_Imp();
    List<Groupe> groupes=new ArrayList<Groupe>();
    Groupe_Imp allGroupe;
    List<Etudiant> etudiants= new ArrayList<Etudiant>();
    List<Etudiant> etudiantGroupe= new ArrayList<Etudiant>();
    public Groupe_Etudiant_Imp(Groupe groupe, List<Etudiant> etudiant) {
        this.groupe=groupe;
        this.etudiantGroupe=groupe.getEtudiantGroupe();
        this.groupes= allGroupe.getAllGroupe();
    }
    
    @Override
    public void addEtudiantGroupe(int id) {
        Etudiant_Imp etudiant=new Etudiant_Imp();
     Etudiant et=etudiant.getEtudiantById(id);
        for(Etudiant etud:etudiant.getEtudiants()){
            if(etud==et){
                etudiantGroupe.add(et);
            }
        }
    }

    @Override
    public void deleteEtudiantGroupe(int id) {
         Etudiant_Imp etudiant=new Etudiant_Imp();
     Etudiant et=etudiant.getEtudiantById(id);
        for(Etudiant etud:etudiant.getEtudiants()){
            if(etud==et){
                etudiantGroupe.remove(etudiantGroupe.indexOf(et));
            }
        }
    }

    @Override
    public void showEtudiantGroupe() {
        for(Etudiant etud:etudiant.getEtudiants()){
            System.out.println("Nom: " +etud.getNom());
        }
    }
    
}

