class CompteEpargne extends Compte {
    private double benefice;

    public CompteEpargne(String titulaire, double solde, double benefice) {
        super(titulaire, solde);
        this.benefice = benefice;
    }

    public double getBenefice() {
        return benefice;
    }

    public void setBenefice(double benefice) {
        this.benefice = benefice;
    }

    @Override
    public String toString() {
        return "CompteEpargne [titulaire=" + getTitulaire() + ", solde=" + getSolde() + ", benefice=" + benefice + "]";
    }
}