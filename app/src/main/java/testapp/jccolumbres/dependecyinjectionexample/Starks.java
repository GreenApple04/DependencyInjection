package testapp.jccolumbres.dependecyinjectionexample;

import android.util.Log;

import javax.inject.Inject;

public class Starks implements House {
    @Inject
    public Starks(){

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
