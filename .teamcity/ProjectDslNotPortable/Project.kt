package ProjectDslNotPortable

import ProjectDslNotPortable.buildTypes.*
import ProjectDslNotPortable.vcsRoots.*
import ProjectDslNotPortable.vcsRoots.ProjectDslNotPortable_HttpsGithubComIyankeProjectDslNotPortable
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "7a77fa3e-e0bd-409d-bae2-1a1661940421"
    id("ProjectDslNotPortable")
    parentId("_Root")
    name = "Project DSL not portable"

    vcsRoot(ProjectDslNotPortable_HttpsGithubComIyankeBigdataRefsHeadsMaster)
    vcsRoot(ProjectDslNotPortable_HttpsGithubComIyankeProjectDslNotPortable)

    buildType(ProjectDslNotPortable_Build11)
    buildType(ProjectDslNotPortable_Build22)

    template(ProjectDslNotPortable_Temp)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${ProjectDslNotPortable_HttpsGithubComIyankeProjectDslNotPortable.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
