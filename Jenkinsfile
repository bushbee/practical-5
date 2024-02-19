pipeline {
  agent any
  stages {
    stage("Build") {
      steps {
        withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'prac4maven', mavenSettingsConfig: '', traceability: true) {
          sh "mvn clean install"
        } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
      }
    }
  }
}
