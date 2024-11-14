package com.andreirookie.impl.external_api

import androidx.fragment.app.Fragment
import com.andreirookie.api.UserListDependenciesProvider
import com.andreirookie.impl.presentation.UserListFragment

internal class UserListDependenciesProviderImpl : UserListDependenciesProvider {
    override fun usersListFragment(): Fragment {
        return UserListFragment()
    }
}