package com.example.myapplicationbyjava.utils;

import android.content.Context;

public class Utils {

    // 根据手机分辨率，从dp 的单位转换为 px
    public static int dip2px(Context context, int dpValue) {
        // 获取当前手机的像素密度比 1dp 有几个像素
        float scale = context.getResources().getDisplayMetrics().density;
        // 四舍五入取整
        return  (int)(dpValue*scale+0.5f);
    }
}
