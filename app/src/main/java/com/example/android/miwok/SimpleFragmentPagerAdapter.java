package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final private int PAGE_COUNT = 4;
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new NumbersFragment();
        }else if (position == 1){
            return new FamilyFragment();
        }else if (position == 2){
            return new ColorsFragment();
        }else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.category_numbers);
        }else if (position == 1){
            return mContext.getString(R.string.category_family);
        }else if (position == 2){
            return mContext.getString(R.string.category_colors);
        }else {
            return mContext.getString(R.string.category_phrases);
        }
    }
}
