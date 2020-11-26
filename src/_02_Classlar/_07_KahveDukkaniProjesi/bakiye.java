package _02_Classlar._07_KahveDukkaniProjesi;

public enum bakiye {

    MUSTERI1(10);

    private double bakiyem;


    bakiye(double bakiyem) {

        this.bakiyem = bakiyem;
    }

    public double getBakiyem(){
        return this.bakiyem;
    }


}
