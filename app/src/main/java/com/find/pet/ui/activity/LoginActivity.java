package com.find.pet.ui.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.find.pet.BR;
import com.find.pet.R;
import com.find.pet.databinding.ActivityLoginBinding;
import com.find.pet.ui.fragment.LoginFragment;
import com.find.pet.ui.fragment.RegisterFragment;
import com.find.pet.vm.LoginViewModel;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;
import java.util.List;

import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;



/**
 * @author Administrator
 * @product Pet
 * @class describe
 * @time 2018/10/9/009 9:56
 */
public class LoginActivity extends BaseActivity<ActivityLoginBinding, BaseViewModel> {

    String[] titles = {
            "登陆", "注册"
    };
    List<BaseFragment> fragments = new ArrayList<>();


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_login;
    }

    @Override
    public int initVariableId() {
        return BR.loginMain;
    }

    @Override
    public BaseViewModel initViewModel() {
        return new BaseViewModel();
    }

    @Override
    public void initData() {
        super.initData();
        initTab();

    }


    /**
     * 初始化tab
     */
    public void initTab() {

        fragments.add(new LoginFragment());
        fragments.add(new RegisterFragment());
        binding.vpContainer.setAdapter(new tabAdapter(getSupportFragmentManager()));
        binding.tlTab.setViewPager(binding.vpContainer);
        binding.tlTab.setCurrentTab(0);

    }

    private class tabAdapter extends FragmentPagerAdapter {
        public tabAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return fragments.get(position);
        }
    }


}
