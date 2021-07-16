job("First_MAVEN_DSL_JOB")
{
description("this mavan job created by JobDsl plugin")
scm{
 git("https://github.com/surajsherudevops/hello-world.git",master)
}
triggers{
scm('* * * * *')

      }
steps{
     maven('clean install package','hello-world/pom.xml')
     }
publishers
{
archiveArtifacts '**/*.war'
}
}
