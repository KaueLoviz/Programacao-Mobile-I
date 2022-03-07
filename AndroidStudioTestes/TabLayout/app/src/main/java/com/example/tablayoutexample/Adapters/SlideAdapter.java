package com.example.tablayoutexample.Adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SlideAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    private String[] titulos = new String[]{"LOGIN", "SIGN IN"};
    public SlideAdapter(FragmentManager fm, List<Fragment> fragmentList){

        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return titulos [position];
    }
}
