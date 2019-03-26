keywords{
  message = "Starting My Pipeline, with governance"
}

pipeline_template = "standard"

steps{
  build_source{
    stage = "Build Code"
    image = "gradle:jdk8"
    command = "./gradlew clean build"
    stash{
      name = "workspace"
//      includes = "./build"
//      excludes = "./src"
      useDefaultExcludes = false
      allowEmpty = true
    }
  }
}
