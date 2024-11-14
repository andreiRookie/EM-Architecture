package com.andreirookie.api.presentation

interface IPresenter<V : BaseView> {
    fun attachView(view: V)
    fun detachView()
}