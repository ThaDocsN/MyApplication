import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.thadocizn.myapplication.PlantRepository;
import com.thadocizn.myapplication.classes.Plant;

import java.util.List;

public class PlantViewModel extends AndroidViewModel {

    private PlantRepository repo;
    private LiveData<List<Plant>> allPlants;

    public PlantViewModel(@NonNull Application application) {
        super(application);
        repo = new PlantRepository(application);
        allPlants = repo.getAllPlants();
    }

    LiveData<List<Plant>> getAllPlants(){return allPlants;}

    public void insert(Plant plant){repo.insert(plant);}
}
