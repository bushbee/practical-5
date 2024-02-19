pipeline {
  agent any
  stages {
    stage("Build") {
      steps {
        withMaven(maven: 'prac4maven') {
          sh "mvn clean install -f pom.xml"
        }
      }
    },
    stage("Test") {
      steps {
        withMaven(maven: 'prac4maven') {
          sh "mvn test -f pom.xml"
        }
      }
    }
  }
}
