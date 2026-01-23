terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "3.6.2"  # matches lock file
    }
  }
}

provider "docker" {
	host = "tcp://localhost:2375"
}

resource "docker_image" "backend" {
  name = "banking-backend"

  build {
    # Use absolute path for Windows
    context    = "C:/Users/giles/Documents/Bank Simulation/cloud-banking-lab/backend"
    dockerfile = "Dockerfile"
  }
}

resource "docker_container" "backend" {
  name  = "banking-backend-container"
  image = docker_image.backend.name

  ports {
    internal = 8000
    external = 8000
  }
}

