# Cloud-Sim Bank – AWS Open-Source Simulation

## Project Overview

Cloud-Sim Bank is a cloud-native banking system simulation built using 100% open-source tools.  
It mirrors AWS Cloud Practitioner and Solutions Architect concepts using local infrastructure.

This project demonstrates:

- Microservices architecture
- API Gateway management
- Infrastructure as Code
- Container orchestration with Kubernetes
- Monitoring & observability

---

## Architecture

User → Kong Gateway → FastAPI  
User → Kong → Account Service  
User → Kong → Transaction Service  

Services communicate via REST.  
PostgreSQL provides persistence.  
Prometheus + Grafana provide monitoring.

---

## Tech Stack

- Java Spring Boot
- FastAPI
- PostgreSQL
- Docker
- Kubernetes (Minikube)
- Terraform
- Kong Gateway
- Prometheus
- Grafana

---

## How To Run (Docker)

```bash
docker compose up --build