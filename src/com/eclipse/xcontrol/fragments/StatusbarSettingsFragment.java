package com.eclipse.xcontrol.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eclipse.xcontrol.R;
import com.eclipse.xcontrol.settings.BaseSetting.OnSettingChangedListener;
import com.eclipse.xcontrol.settings.CheckboxSetting;

public class StatusbarSettingsFragment extends Fragment {

    public StatusbarSettingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.statusbar_settings, container, false);

        return v;
    }
}
