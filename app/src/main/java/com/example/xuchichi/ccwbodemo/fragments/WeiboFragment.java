package com.example.xuchichi.ccwbodemo.fragments;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.chichi.ccwbodemo.R;
import com.example.xuchichi.ccwbodemo.base.*;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * A fragment with a Google +1 button.
 */
public class WeiboFragment extends com.example.xuchichi.ccwbodemo.base.BaseFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_weibo;
    }

    @Override
    protected void initView(View view) {

    }
}
