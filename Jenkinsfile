import groovy.json.JsonSlurperClassic

def jsonParse(def json){
  new groovy.json.JsonSlurperClassic().parseText(json)
}
pipeline{
  agent any
  eviroment{
    appName = "variable"
    GRADLE_HOME = tool 'Gradle'
  }
  Stages{
    stage("Build"){
      steps{
        script{
          bat "${GRADLE_HOME}\\gradle build"
        }
      }
    }
  }
  post{
    always{
      echo "fase always"
    }
     success{
      echo "fase success"
    }
     failure{
      echo "fase failure"
    }
  }
}

