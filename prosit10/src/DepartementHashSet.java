import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> listeDepartements;

    public DepartementHashSet() {
        listeDepartements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        listeDepartements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep : listeDepartements) {
            if (dep.getNomDepartement().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return listeDepartements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        listeDepartements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement dep : listeDepartements) {
            System.out.println(dep);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedDepartements = new TreeSet<>(listeDepartements);
        return sortedDepartements;
    }
}
