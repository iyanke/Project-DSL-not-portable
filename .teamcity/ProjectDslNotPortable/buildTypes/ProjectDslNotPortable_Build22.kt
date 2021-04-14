package ProjectDslNotPortable.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object ProjectDslNotPortable_Build22 : BuildType({
    uuid = "b685fde7-3ad6-476a-9f26-6c71b49cace8"
    name = "Build22"
    paused = true

    params {
        param("build22_param", "2")
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
    }
})
