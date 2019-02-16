/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.settings.display;

import android.content.Context;
import android.support.v7.preference.Preference;

import com.android.settings.R;
import com.android.settings.core.PreferenceControllerMixin;
import com.android.settingslib.core.AbstractPreferenceController;

import com.asylum.utils.PackageManagerUtils;

public class AmbientDisplayCustomPreferenceController extends AbstractPreferenceController implements
        PreferenceControllerMixin {

    private static final String KEY_AMBIENT_DISPLAY_CUSTOM = "ambient_display_custom";
    private static final String PACKAGE_CUSTOM_DOZE = "com.custom.ambient.display";

    public AmbientDisplayCustomPreferenceController(Context context) {
        super(context);
    }

    @Override
    public String getPreferenceKey() {
        return KEY_AMBIENT_DISPLAY_CUSTOM;
    }

    @Override
    public boolean handlePreferenceTreeClick(Preference preference) {
        return false;
    }

    @Override
    public boolean isAvailable() {
        return PackageManagerUtils.isAppInstalled(mContext.getApplicationContext(), PACKAGE_CUSTOM_DOZE);
    }
}
