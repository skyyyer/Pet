package com.find.pet.vm;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.find.pet.ui.activity.DetailActivity;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import com.find.pet.databinding.FragmentMainHomeBinding;


/**
 * @author Administrator
 * @product Pet
 * @class describe
 * @time 2018/10/18/018 17:06
 */
public class MainHomeViewModel extends BaseViewModel {

    public FragmentMainHomeBinding binding;

    public String imgUrl = "https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1539833420&di=4bd7313e84813aaa112d0b59058a5676&src=http://img1.3lian.com/2015/a1/113/d/189.jpg";


    public MainHomeViewModel(Context context, FragmentMainHomeBinding binding) {
        super(context);
        this.binding = binding;
    }


    public BindingCommand OnClickCommand = new BindingCommand(new BindingAction() {
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void call() {
            startActivityWithShare(DetailActivity.class,
                    ActivityOptions.makeSceneTransitionAnimation((Activity) context, binding.imageView7, "item").toBundle());
        }
    });

}
