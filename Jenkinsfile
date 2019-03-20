node{
  stage("Printing Message"){
   if (message) echo message 
  }
  sh './gradlew clean build'
  static_code_analysis()
  build()
}
