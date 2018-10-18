package com.find.pet.vm;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.find.pet.databinding.ActivityMainBinding;
import com.find.pet.ui.activity.DetailActivity;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

public class MainViewModel extends BaseViewModel {


    public String imgUrl = "https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1539833420&di=4bd7313e84813aaa112d0b59058a5676&src=http://img1.3lian.com/2015/a1/113/d/189.jpg";


    public MainViewModel(Context context) {
        super(context);
    }


}
