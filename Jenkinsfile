pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build') {
      steps {
        sh \'mvn clean install\'
      }
    }

    stage('Test') {
      steps {
        sh \'mvn test\'
      }
    }

    stage('Package') {
      steps {
        sh \'mvn package\'
      }
    }

    stage('Deploy') {
      steps {
        echo \'Deployed\'
      }
    }

  }
}
