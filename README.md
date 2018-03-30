# ForceAnimateAppBarLayout [![](https://jitpack.io/v/sjnyag/ForceAnimateAppBarLayout.svg)](https://jitpack.io/#sjnyag/ForceAnimateAppBarLayout)
Force animate and execute AppBarLayout#setExpanded().

Screenshots
-----------

![Demo Screenshot 1][1]

Usage
-----

1. Add ``ForceAnimateAppBarLayout`` widget to your layout.

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.design.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true"
    tools:context="com.github.sjnyag.forceanimateappbarlayout.ScrollingActivity">

    <com.github.sjnyag.forceanimateappbarlayout.ForceAnimateAppBarLayout
        android:id="@+id/app_bar"
        android:layout_width="match_parent"
        android:layout_height="@dimen/app_bar_height"
        android:fitsSystemWindows="true"
        android:theme="@style/AppTheme.AppBarOverlay">

        <android.support.design.widget.CollapsingToolbarLayout
            android:id="@+id/toolbar_layout"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:fitsSystemWindows="true"
            app:contentScrim="?attr/colorPrimary"
            app:layout_scrollFlags="scroll|exitUntilCollapsed"
            app:toolbarId="@+id/toolbar">

            <android.support.v7.widget.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                app:layout_collapseMode="pin"
                app:popupTheme="@style/AppTheme.PopupOverlay"/>

        </android.support.design.widget.CollapsingToolbarLayout>
    </com.github.sjnyag.forceanimateappbarlayout.ForceAnimateAppBarLayout>

    <include layout="@layout/content_scrolling"/>

    <android.support.design.widget.FloatingActionButton
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/fab_margin"
        app:layout_anchor="@id/content"
        app:layout_anchorGravity="bottom|end"
        app:srcCompat="@android:drawable/ic_media_play"/>

</android.support.design.widget.CoordinatorLayout>
```

2. Call ``animatedExpand()`` to feel the same way as AppBarLayout#setExpanded(true , true). 

```java
            findViewById<ForceAnimateAppBarLayout>(R.id.app_bar).run {
                animatedExpand()
            }
```

Import ForceAnimateAppBarLayout dependency
--------------------------------

your build.gradle
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```


```groovy
dependencies {
    implementation 'com.github.sjnyag:ForceAnimateAppBarLayout:0.4.0'
}
```

License
-------
```
   Copyright 2018 sjnyag

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

[1]: ./sample.gif
