package com.tencent.shadow.sample.host.lib;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.GenericDraweeView;

/**
 * Created by madong on 2019-12-31.
 */
public class FrescoImageView extends GenericDraweeView {

    public FrescoImageView(Context context, GenericDraweeHierarchy hierarchy) {
        super(context, hierarchy);
    }

    public FrescoImageView(Context context) {
        super(context);
    }

    public FrescoImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FrescoImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public FrescoImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
