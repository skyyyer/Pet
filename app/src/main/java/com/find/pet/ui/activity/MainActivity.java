package com.find.pet.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.find.pet.R;
import com.find.pet.BR;
import com.find.pet.databinding.ActivityMainBinding;
import com.find.pet.entity.TabEntity;
import com.find.pet.ui.fragment.MainHomeFragment;
import com.find.pet.vm.MainViewModel;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

import me.goldze.mvvmhabit.base.BaseActivity;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {

    private String[] mTitles = {"首页", "直播购", "消息", "更多"};
    private int[] mIconUnselectIds = {
            R.mipmap.test_baby, R.mipmap.test_baby,
            R.mipmap.test_baby, R.mipmap.test_baby};
    private int[] mIconSelectIds = {
            R.mipmap.main_header_bg, R.mipmap.main_header_bg,
            R.mipmap.main_header_bg, R.mipmap.main_header_bg};
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private ArrayList<Fragment> mFragments = new ArrayList<>();


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

    @Override
    public void initData() {
        super.initData();
        initTabLayout();
    }

    private void initTabLayout() {

        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }

        mFragments.add(new MainHomeFragment());
        mFragments.add(new MainHomeFragment());
        mFragments.add(new MainHomeFragment());
        mFragments.add(new MainHomeFragment());

        binding.vpContainer.setAdapter(new tabAdapter(getSupportFragmentManager()));
        binding.tlBottom.setTabData(mTabEntities);
        binding.tlBottom.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                binding.vpContainer.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {
                if (position == 0) {
                    binding.tlBottom.showMsg(0, 77);
//                    UnreadMsgUtils.show(mTabLayout_2.getMsgView(0), mRandom.nextInt(100) + 1);
                }
            }
        });
        binding.vpContainer.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                binding.tlBottom.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        binding.vpContainer.setCurrentItem(1);
    }

    private class tabAdapter extends FragmentPagerAdapter {
        public tabAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mFragments.get(position);
        }
    }

}
