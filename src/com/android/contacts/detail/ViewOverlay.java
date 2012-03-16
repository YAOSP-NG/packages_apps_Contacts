/*
 * Copyright (C) 2011 The Android Open Source Project
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
 * limitations under the License
 */

package com.android.contacts.detail;

import android.view.View.OnClickListener;

/**
 * This is implemented by {@link View}s that contain an alpha layer and touch interceptor layer.
 * The alpha layer covers the entire fragment and has an alpha value which makes the fragment
 * contents appear "dimmed" out. The touch interceptor layer covers the entire fragment so that
 * when visible, it intercepts all touch events on the {@link View}.
 */
public interface ViewOverlay {

    /**
     * Sets the callback that will be invoked when the touch-interceptor tapped
     * while enabled.
     */
    public void setTouchInterceptorListener(OnClickListener listener);

    /**
     * Sets the alpha value on the alpha layer (if there is one).
     */
    public void setAlphaLayerValue(float alpha);

    /**
     * Enables the touch intercept layer on this fragment, so that it intercepts
     * and handles touch events.
     */
    public void enableTouchInterceptor();

    /**
     * Disables the touch intercept layer on this fragment; touch events are
     * handled normally by the view hierarchy under the overlay.
     */
    public void disableTouchInterceptor();
}
