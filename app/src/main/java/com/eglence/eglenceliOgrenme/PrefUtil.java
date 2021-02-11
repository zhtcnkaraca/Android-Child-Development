package com.eglence.eglenceliOgrenme;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.SyncStateContract;

public class PrefUtil {
    private  static SharedPreferences getPrefs(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
    public static void setCategory(Context context,String value)
    {
        getPrefs(context).edit().putString(Constants.PREF_CATEGORY_PARAMETER,value).apply();
    }
    public static String getCategory(Context context)
    {
        return getPrefs(context).getString(Constants.PREF_CATEGORY_PARAMETER,"");
    }
}
