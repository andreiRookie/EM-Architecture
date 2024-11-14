package com.andreirookie.api

import com.andreirookie.api.di.ApplicationProvider
import com.andreirookie.api.di.NetworkProvider

interface AppDependenciesFacade :
        ApplicationProvider,
        NetworkProvider