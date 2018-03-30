package com.github.sjnyag.forceanimateappbarlayout

import android.content.Context
import android.support.design.widget.AppBarLayout
import android.util.AttributeSet

class ForceAnimateAppBarLayout(context: Context, attrs: AttributeSet) : AppBarLayout(context, attrs), AppBarLayout.OnOffsetChangedListener {

    private var reserveExpandAnimation: Boolean = false

    init {
        addOnOffsetChangedListener(this@ForceAnimateAppBarLayout)
    }

    fun animatedExpand() {
        reserveExpandAnimation = true
        setExpanded(false, false)
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        when {
            verticalOffset == 0 -> {
                if (reserveExpandAnimation) {
                    reserveExpandAnimation = false
                }
            }
            Math.abs(verticalOffset) >= appBarLayout?.totalScrollRange ?: 0 -> {
                if (reserveExpandAnimation) {
                    setExpanded(true, true)
                }
            }
            else -> {
            }
        }
    }
}