package ProjectDslNotPortable.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object ProjectDslNotPortable_HttpsGithubComIyankeBigdataRefsHeadsMaster : GitVcsRoot({
    uuid = "b7799b15-e6d0-41cd-bf2f-37ac07554577"
    name = "https://github.com/iyanke/bigdata#refs/heads/master"
    url = "https://github.com/iyanke/bigdata"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "iyanke"
        password = "zxx44d98d23331fedc49226423a85137700"
    }
})
