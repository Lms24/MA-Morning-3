package at.tugraz.ist.sw20.mam3.cook.ui.favourites

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavouritesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
//        value = "This is favourites Fragment"
    }
    val text: LiveData<String> = _text
}