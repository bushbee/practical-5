pipeline {
  agent any
  stages {
    stage("Build") {
      steps {
        git url: 'https://github.com/bushbee/practical-5/'
        withMaven {
          sh "mvn clean install"
        } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
      }
    }
  }
}
