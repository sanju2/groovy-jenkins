pipeline {
    agent any

    stages {

        stage('Deploy') {
            steps {
                script {
                    def deployScript = load 'scripts/deploy.groovy'

                    deployScript.deploy(
                        'dev',
                        'my-application',
                        '1.0.0'
                    )
                }
            }
        }
    }
}