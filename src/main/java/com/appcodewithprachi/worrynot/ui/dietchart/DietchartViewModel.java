package com.appcodewithprachi.worrynot.ui.dietchart;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DietchartViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DietchartViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is dietchart fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}