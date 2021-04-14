package ProjectDslNotPortable.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object ProjectDslNotPortable_HttpsGithubComIyankeProjectDslNotPortable : GitVcsRoot({
    uuid = "8cc8a2cf-ba4b-464f-90d5-7dd310ee5e92"
    name = "https://github.com/iyanke/Project-DSL-not-portable"
    url = "https://github.com/iyanke/Project-DSL-not-portable"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "iyanke"
        password = "zxx44d98d23331fedc49226423a85137700"
    }
})
