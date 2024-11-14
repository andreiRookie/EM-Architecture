package com.andreirookie.api.presentation

abstract class BasePresenter<V : BaseView> : IPresenter<V> {
    var baseView: V? = null
    private set

    override fun attachView(view: V) {
        baseView = view
    }

    override fun detachView() {
        baseView = null
    }
}