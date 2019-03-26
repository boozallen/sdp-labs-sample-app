keywords{
  message = "Starting My Pipeline, with governance"
}

pipeline_template = "standard"

steps{
  build_source2{
    stage = "Build Code"
    image = "gradle:jdk8"
    script = "./script/build_source.groovy"
  }
}
