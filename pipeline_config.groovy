libraries{
  sdp{
    images{
      registry = "http://localhost:5000" // registry url
      cred = "sdp-docker-registry"// jenkins cred id to authenticate
      docker_args = "--network=try-it-out_sdp"  // docker runtime args
    }
  }
  github_enterprise
  sonarqube{
    enforce_quality_gate = true
  }
  docker{
    registry = "localhost:5000"
    cred = "sdp-docker-registry"
  }
}