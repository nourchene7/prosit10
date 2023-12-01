public class main {
    public static void main(String[] args) {
        // Création de départements
        Departement dep1 = new Departement(1, "Département A", 10);
        Departement dep2 = new Departement(2, "Département B", 15);

        // Création de la liste des départements avec HashSet
        DepartementHashSet departementHashSet = new DepartementHashSet();

        // Ajout des départements
        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);

        // Affichage des départements
        System.out.println("Liste des départements:");
        departementHashSet.displayDepartement();

        // Recherche d'un département par nom
        String nomRecherche = "Département A";
        boolean trouve = departementHashSet.rechercherDepartement(nomRecherche);
        System.out.println("Département " + nomRecherche + " trouvé : " + trouve);

        // Suppression d'un département
        departementHashSet.supprimerDepartement(dep1);

        // Affichage mis à jour des départements
        System.out.println("Liste des départements après suppression:");
        departementHashSet.displayDepartement();

        // Tri des départements par id
        System.out.println("Liste des départements triés par id:");
        departementHashSet.trierDepartementById().forEach(System.out::println);
    }
}
