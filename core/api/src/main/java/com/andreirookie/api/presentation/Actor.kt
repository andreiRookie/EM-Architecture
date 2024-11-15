package com.andreirookie.api.presentation

interface Actor<A : Action, E : Event> {
    fun execute(action: A): E
}