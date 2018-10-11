package com.find.pet.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.find.pet.BR;
import com.find.pet.R;
import com.find.pet.databinding.FragmentRegisterBinding;
import com.find.pet.vm.RegisterViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * @author Administrator
 * @product Pet
 * @class 注册
 * @time 2018/10/9/009 14:16
 */
public class RegisterFragment extends BaseFragment<FragmentRegisterBinding, RegisterViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_register;
    }

    @Override
    public int initVariableId() {
        return BR.register;
    }


    @Override
    public RegisterViewModel initViewModel() {
        return new RegisterViewModel();
    }
}
