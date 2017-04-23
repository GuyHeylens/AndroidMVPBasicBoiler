package be.kotlin.androidmvpbasicboiler.base

/**
 * Created by guyheylens on 23/04/17.
 */
interface PresenterBase<T> {

    fun addView(view:T)
    fun removeView()

}