pipeline {

    agent any

    tools {
        maven 'Maven 3.8.4'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Execute dependency check') {
            steps {
                sh 'mvn dependency-check:check'
            }
        }
    }

    post {
        always {
            dependencyCheckPublisher pattern: 'target/dependency-check-report.xml'
        }
    }
}