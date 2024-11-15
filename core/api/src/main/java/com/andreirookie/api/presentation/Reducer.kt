package com.andreirookie.api.presentation

interface Reducer<S : State, E : Event> {
    fun reduce(state: S, event: E): S
}