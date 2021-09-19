pipeline {
  agent any
  stages {
    stage('Maven Compile'){
        steps{
            echo 'Project compile stage'
            bat label: 'Compilation running', script: '''mvn compile'''
            }
    }
    
    stage('Unit Test') {
       steps {
            echo 'Project Testing stage'
            bat label: 'Test running', script: '''mvn test'''
            
            }
    }
    
    stage('Jacoco Coverage Report') {
            steps{
                    jacoco()
        }
     }
     
     stage('SonarQube'){
         steps{
                 bat label: '', script: '''mvn sonar:sonar \
                 -Dsonar.host.url=http://localhost:9000 \
                 -Dsonar.login=20bf62149f4dd9694a4c903f5490bb3005f187bf'''
              }
         }
     
     stage('Maven Package'){
         steps{
             echo 'Project packaging stage'
             bat label: 'Project packaging', script: '''mvn package'''
         }
     }
     
  }
}