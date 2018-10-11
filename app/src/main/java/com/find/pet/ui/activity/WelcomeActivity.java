package com.find.pet.ui.activity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;

import com.find.pet.R;
import com.find.pet.BR;

import com.find.pet.databinding.ActivityWelcomeBinding;
import com.find.pet.vm.WelcomeViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * 欢迎页面
 */

public class WelcomeActivity extends BaseActivity<ActivityWelcomeBinding, WelcomeViewModel> {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_welcome;
    }

    @Override
    public int initVariableId() {
        return BR.welcome;
    }

    @Override
    public WelcomeViewModel initViewModel() {
        return new WelcomeViewModel(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
