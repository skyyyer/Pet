package com.find.pet.ui.activity;

import android.os.Bundle;

import com.find.pet.R;
import com.find.pet.BR;
import com.find.pet.databinding.ActivityMainBinding;
import com.find.pet.vm.MainViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.main;
    }

    @Override
    public MainViewModel initViewModel() {
        return new MainViewModel(this);
    }
}
