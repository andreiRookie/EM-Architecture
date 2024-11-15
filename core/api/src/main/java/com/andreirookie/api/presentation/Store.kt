package com.andreirookie.api.presentation

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

abstract class Store<S : State, E : Event, A : Action> (
    protected val initialState: S,
    protected val reducer: Reducer<S, E>,
    protected val actor: Actor<A, E>
) {
    abstract val currentState: StateFlow<S>
    protected abstract val events: Flow<E>
    protected abstract val actions: SharedFlow<A>

    abstract fun handleAction(action: A)
}