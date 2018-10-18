package com.find.pet.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.find.pet.BR;
import com.find.pet.R;
import com.find.pet.vm.MainHomeViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;
import com.find.pet.databinding.FragmentMainHomeBinding;


/**
 * @author Administrator
 * @product Pet
 * @class describe
 * @time 2018/10/18/018 17:03
 */
public class MainHomeFragment extends BaseFragment<FragmentMainHomeBinding, MainHomeViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_main_home;
    }

    @Override
    public int initVariableId() {
        return BR.home;
    }

    @Override
    public MainHomeViewModel initViewModel() {
        return new MainHomeViewModel(getActivity(), binding);
    }
}
