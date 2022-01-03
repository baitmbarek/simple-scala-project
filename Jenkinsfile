pipeline {
  agent any
    stages {
      stage('Script') {
        steps {
        sh 'echo "Hello !"'
      }
      stage('Build') {
        steps {
        sbt clean compile
      }
      stage('Test') {
        steps {
        sbt test
      }
    }
  }
}
