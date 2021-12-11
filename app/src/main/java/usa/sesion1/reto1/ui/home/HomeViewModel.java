package usa.sesion1.reto1.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenidos a ¡La mejor comida Colombiana! " );
    }

    public LiveData<String> getText() {
        return mText;
    }
}