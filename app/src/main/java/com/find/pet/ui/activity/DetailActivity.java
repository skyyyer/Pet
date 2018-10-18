package com.find.pet.ui.activity;

import android.os.Bundle;

import com.find.pet.BR;
import com.find.pet.R;
import com.find.pet.databinding.ActivityDetailBinding;
import com.find.pet.vm.DetailViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * @author Administrator
 * @product Pet
 * @class 详情页面
 * @time 2018/10/12/012 15:38
 */
public class DetailActivity extends BaseActivity<ActivityDetailBinding,DetailViewModel> {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_detail;
    }

    @Override
    public int initVariableId() {
        return BR.detail;
    }

    @Override
    public DetailViewModel initViewModel() {
        return new DetailViewModel();
    }
}
