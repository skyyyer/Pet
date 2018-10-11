package com.find.pet.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.find.pet.BR;
import com.find.pet.R;
import com.find.pet.databinding.FragmentLoginBinding;
import com.find.pet.vm.LoginViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * @author Administrator
 * @product Pet
 * @class 登陆fragment
 * @time 2018/10/8/008 18:11
 */
public class LoginFragment extends BaseFragment<FragmentLoginBinding, LoginViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_login;
    }

    @Override
    public int initVariableId() {
        return BR.login;
    }

    @Override
    public LoginViewModel initViewModel() {
        return new LoginViewModel(getContext());
    }
}
