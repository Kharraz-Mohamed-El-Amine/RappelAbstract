public enum Grade {
    MC(200),
    MCH(300),
    PES(500);

    private final int montantHeureSupp;

    Grade(int montantHeureSupp) {
        this.montantHeureSupp = montantHeureSupp;
    }

    public int getMontantHeureSupp() {
        return montantHeureSupp;
    }
}

