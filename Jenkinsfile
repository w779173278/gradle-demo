pipeline {
    agent any

    stages {
        stage('BUILD') {
            steps {
                def rtGradle = Artifactory.newGradleBuild()
                rtGradle.run buildFile: "build.gradle", tasks: "build"
            }
        }
    }
}
