package testapp.jccolumbres.dependecyinjectionexample;

public class War {

    private Starks starks;
    private Boltons boltons;


    public War(){
        starks = new Starks();
        boltons = new Boltons();

        starks.prepareForWar();
        starks.reportForWar();

        boltons.prepareForWar();
        boltons.reportForWar();
    }
}
