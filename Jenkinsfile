pipeline {
    agent any

    stages {
        stage('BUILD') {
            steps {

                rtGradleRun(
                        useWrapper: true,
                        usesPlugin: true,
                        tasks: '--no-daemon --stop  build'
                )
            }
        }
    }
}
