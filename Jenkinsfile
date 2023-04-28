pipeline {
    agent any

    stages {
        stage('BUILD') {
            steps {

                rtGradleRun(
                        useWrapper: true,
                        usesPlugin: true,
                        tasks: '--no-daemon  -S  build -x test'
                )
            }
        }
    }
}
