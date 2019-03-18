package io.android_architecture.base.util.extensions

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction



fun Activity.hideKeyboard() {
    var view = this.currentFocus
    if (view == null) {
        view = View(this)
    }
    val imm = this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(view.windowToken, 0)
}


fun AppCompatActivity.showKeyboard() {
    val imm = this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
}

fun AppCompatActivity.replaceFragmentInActivity(fragment: Fragment, view: ViewGroup) {
    supportFragmentManager.transact {
        replace(view.id, fragment)
    }
}

fun AppCompatActivity.addFragment(
    containerViewId: Int,
    fragment: androidx.fragment.app.Fragment,
    tag: String? = fragment.javaClass.name,
    addToBackStack: Boolean = false,
    enterAnim: Int = 0,
    exitAnim: Int = 0
) {
    supportFragmentManager.transact {
        setCustomAnimations(enterAnim, exitAnim, enterAnim, exitAnim)
        add(containerViewId, fragment, tag)
        if (addToBackStack) {
            addToBackStack(tag)
        }
    }

}


fun AppCompatActivity.replaceFragment(
    containerViewId: Int,
    fragment: androidx.fragment.app.Fragment,
    tag: String? = fragment.javaClass.name,
    addToBackStack: Boolean = false,
    enterAnim: Int = 0,
    exitAnim: Int = 0
) {
    supportFragmentManager.transact {
        setCustomAnimations(enterAnim, exitAnim, enterAnim, exitAnim)
        replace(containerViewId, fragment, tag)
        if (addToBackStack) {
            addToBackStack(tag)
        }

    }

}


fun AppCompatActivity.removeFragment(
    fragment: androidx.fragment.app.Fragment,
    enterAnim: Int = 0,
    exitAnim: Int = 0
) {
    supportFragmentManager.transact {
        setCustomAnimations(enterAnim, exitAnim, enterAnim, exitAnim)
        remove(fragment)
    }
}


fun AppCompatActivity.hideFragment(
    fragment: androidx.fragment.app.Fragment,
    enterAnim: Int = 0,
    exitAnim: Int = 0
) {
    supportFragmentManager.transact {
        setCustomAnimations(enterAnim, exitAnim, enterAnim, exitAnim)
        hide(fragment)
    }
}

fun AppCompatActivity.showFragment(
    fragment: androidx.fragment.app.Fragment,
    enterAnim: Int = 0,
    exitAnim: Int = 0
) {


    supportFragmentManager.transact {
        setCustomAnimations(enterAnim, exitAnim, enterAnim, exitAnim)
        show(fragment)
    }
}


private inline fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply {
        action()
    }.commit()
}
