public class Main {
    public static void main(String[] args) {
        BienService bienService = new BienService(...); // Initialiser avec EntityManager
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Ajouter un bien");
        System.out.println("2. Afficher tous les biens");
        System.out.println("3. Quitter");
        
        int choix = scanner.nextInt();
        
        switch (choix) {
            case 1:
                // Ajouter un bien
                break;
            case 2:
                // Afficher les biens
                break;
            case 3:
                System.out.println("Au revoir!");
                break;
        }
    }
}
