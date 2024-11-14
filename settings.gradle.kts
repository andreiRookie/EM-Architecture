pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "EM_Architecture"
include(":app")
include(":core:api")
include(":core:impl")
include(":users_list:api")
include(":users_list:impl")
include(":chat:api")
include(":chat:impl")
include(":authorization:api")
include(":authorization:impl")
include(":settings:api")
include(":settings:impl")
include(":registration:api")
include(":registration:impl")
include(":user_profile:api")
include(":user_profile:impl")
