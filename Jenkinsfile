pipeline {
    agent any

    stages {
        stage('BUILD') {
            steps {
                def rtGradle = Artifactory.newGradleBuild()
                rtGradle.useWrapper = true
                rtGradle.usesPlugin = true
                rtGradle.run buildFile: "build.gradle", tasks: "build"
            }
        }
    }
}
