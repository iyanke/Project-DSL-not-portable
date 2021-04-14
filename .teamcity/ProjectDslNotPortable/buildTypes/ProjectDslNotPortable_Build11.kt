package ProjectDslNotPortable.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.schedule
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object ProjectDslNotPortable_Build11 : BuildType({
    uuid = "d003037b-4dce-4adb-8acd-2dae4ff50d14"
    name = "Build11"
    paused = true

    params {
        param("build", "${ProjectDslNotPortable_Build22.depParamRefs["build22_param"]}")
        param("Build_param", "1")
    }

    vcs {
        root(ProjectDslNotPortable.vcsRoots.ProjectDslNotPortable_HttpsGithubComIyankeBigdataRefsHeadsMaster)
    }

    steps {
        script {
            scriptContent = "echo a"
        }
    }

    triggers {
        vcs {
        }
        schedule {
            triggerBuild = onWatchedBuildChange {
                buildType = "${ProjectDslNotPortable_Build22.id}"
            }
        }
    }

    dependencies {
        dependency(ProjectDslNotPortable_Build22) {
            snapshot {
            }

            artifacts {
                artifactRules = "**/*.*"
            }
        }
    }
})
