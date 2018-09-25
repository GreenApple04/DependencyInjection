package testapp.jccolumbres.dependecyinjectionexample.houses;

import android.util.Log;

import javax.inject.Inject;

import testapp.jccolumbres.dependecyinjectionexample.House;

public class Boltons implements House {
    @Inject
    public Boltons(){

    }
    @Override
    public void prepareForWar() {
        Log.d("Battle" , this.getClass().getSimpleName() + " prepared For War");
    }

    @Override
    public void reportForWar() {
        Log.d("Battle" , this.getClass().getSimpleName()+ " reporting");
    }
}
