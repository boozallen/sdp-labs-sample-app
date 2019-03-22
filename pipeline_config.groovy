keywords{
  message = "Starting My Pipeline, with governance"
}

steps{
  build_source{
    stage = "Build Code"
    image = "gradle:jdk8"
    command = "sh './gradlew clean build'"
    stash{
      name = "build-results"
      includes = "./build"
      excludes = "./src"
      useDefaultExcludes = false
      allowEmpty = true
    }
  }
}