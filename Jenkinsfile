pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        sh 'checkout scm'
      }
    }

    stage('Build') {
      steps {
        sh 'sh \'mvn clean install\''
      }
    }

    stage('Test') {
      steps {
        sh 'sh \'mvn test\''
      }
    }

    stage('Package') {
      steps {
        sh 'sh \'mvn package\''
      }
    }

    stage('Deploy') {
      steps {
        sh 'echo \'Deployed\''
      }
    }

  }
}