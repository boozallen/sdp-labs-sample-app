keywords{
  message = "Smoke testing with governance"
}

pipeline_template = "smoke"

steps{
  smoke_local{
    stage = "Smoke Local"
    image = "gradle:jdk8"
    command = "echo 'smoke'"
    stash{
      name = "smoke"
//      includes = "./build"
//      excludes = "./src"
      useDefaultExcludes = false
      allowEmpty = true
    }
  }
}
