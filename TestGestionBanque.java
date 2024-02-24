
class TestGestionBanque {
    public static void main(String[] args) {
        Banque banque = new Banque("ATB");
        Compte compte1 = new Compte("IMEN", 1000);
        CompteEpargne compte2 = new CompteEpargne("HAMADA", 2000, 50);

        banque.ajoutCompte(compte1);
        banque.ajoutCompte(compte2);

        System.out.println(banque);

        try {
            compte1.debiter(1500);
            compte2.debiter(1000);
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(compte1);
        System.out.println(compte2);
    }
}
