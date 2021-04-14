package ProjectDslNotPortable.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object ProjectDslNotPortable_Temp : Template({
    uuid = "7fc3b4eb-0b3f-4f9e-91ab-c0f5a0eabf32"
    name = "temp"

    vcs {
        root(ProjectDslNotPortable.vcsRoots.ProjectDslNotPortable_HttpsGithubComIyankeBigdataRefsHeadsMaster)
    }

    steps {
        script {
            id = "RUNNER_110"
            scriptContent = "echo a"
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
