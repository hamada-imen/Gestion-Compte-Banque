
class Compte {
    private String titulaire;
    private double solde;

    public Compte(String titulaire) {
        this.titulaire = titulaire;
        this.solde = 0;
    }

    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void debiter(double montant) throws SoldeInsuffisantException {
        if (solde < montant) {
            throw new SoldeInsuffisantException("Solde insuffisant pour débiter " + montant);
        }
        solde -= montant;
    }

    public void crediter(double montant) {
        solde += montant;
    }

    @Override
    public String toString() {
        return "Compte [titulaire=" + titulaire + ", solde=" + solde + "]";
    }
}




