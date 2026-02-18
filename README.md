# 💳 Cloud Simulated Banking System

A cloud-native simulated banking system built to demonstrate modern backend development, microservices architecture, containerization, CI/CD automation, infrastructure as code, and monitoring practices.

This project is designed for learning and showcasing real-world DevOps and cloud engineering workflows.

---

## 📌 Table of Contents

- Project Overview
- Architecture
- Features
- Tech Stack
- Project Structure
- Installation & Setup
- Running the Application
- CI/CD Pipeline
- Infrastructure as Code
- Monitoring & Observability
- API Endpoints
- Development Guide
- Troubleshooting
- Future Improvements
- Contributing
- License
- Author

---

## 📖 Project Overview

The Cloud Simulated Banking System is a microservice-based backend application that simulates basic banking operations such as account management and transactions.

The project demonstrates:

- Microservice architecture
- Containerized deployment
- API gateway integration
- Automated CI/CD pipelines
- Infrastructure provisioning with Terraform
- Monitoring and observability
- Docker-based orchestration

It serves as a practical learning project for cloud-native application development.

---

## 🏗️ Architecture

The system is composed of the following components:

- Banking API service
- API Gateway for routing requests
- Containerized services using Docker
- Monitoring stack
- Infrastructure as Code configuration
- CI/CD automation pipeline

### High-Level Architecture

Client → API Gateway → Banking API Service → Database  
                        ↓  
                 Monitoring Stack

---

## 🚀 Features

- RESTful banking API
- Microservice architecture
- Docker containerization
- API gateway routing
- Automated CI/CD pipeline
- Infrastructure as Code (Terraform)
- Monitoring and metrics collection
- Scalable service structure
- Modular and maintainable codebase

---

## 🧰 Tech Stack

### Backend
- Python
- FastAPI

### DevOps & Infrastructure
- Docker
- Docker Compose
- Terraform

### CI/CD
- GitHub Actions

### Monitoring
- Prometheus
- Grafana (optional extension)

---

## 📂 Project Structure

cloud-sim-banking-system/

├── api/                     # Banking API service  
│   ├── main.py  
│   ├── models/  
│   ├── routes/  
│   ├── Dockerfile  
│   └── requirements.txt  
│  
├── gateway/                 # API gateway configuration  
│  
├── monitoring/              # Monitoring configuration  
│   └── prometheus.yml  
│  
├── iac/terraform/           # Infrastructure as Code  
│   ├── main.tf  
│   └── variables.tf  
│  
├── .github/workflows/       # CI/CD pipeline  
│   └── ci.yml  
│  
└── docker-compose.yml       # Service orchestration

---

## ⚙️ Installation & Setup

### Prerequisites

Ensure the following tools are installed:

- Docker
- Docker Compose
- Python 3.10+
- Git
- Terraform

### Clone the Repository

git clone https://github.com/your-username/cloud-sim-banking-system.git  
cd cloud-sim-banking-system

---

## ▶️ Running the Application

### Using Docker (Recommended)

docker-compose up --build

This command will:

- Build Docker images
- Start all services
- Connect containers via Docker network

### Access Services

- API Service: http://localhost:8000
- Monitoring Dashboard: http://localhost:9090

---

## 🔄 CI/CD Pipeline

The project includes an automated CI/CD workflow that:

- Builds Docker images
- Runs automated checks
- Validates configurations
- Prepares deployment artifacts

Pipeline configuration is located at:

.github/workflows/ci.yml

The pipeline runs automatically on push and pull requests.

---

## ☁️ Infrastructure as Code

Terraform scripts are located in:

iac/terraform/

### Initialize Terraform

cd iac/terraform  
terraform init

### Preview Infrastructure

terraform plan

### Apply Configuration

terraform apply

---

## 📊 Monitoring & Observability

The system uses Prometheus to collect performance metrics.

Monitoring configuration:

monitoring/prometheus.yml

Metrics include:

- API performance
- Service health
- Request statistics
- System resource usage

You can extend monitoring by integrating Grafana dashboards.

---

## 🔌 API Endpoints

### Health Check

GET /health

### Create Account

POST /accounts

### Get Account Details

GET /accounts/{id}

### Perform Transaction

POST /transactions

---

## 🧪 Development Guide

### Run API Locally (Without Docker)

cd api  
pip install -r requirements.txt  
python main.py

### Run Tests

pytest

---

## 🛠️ Troubleshooting

### Common Issues

Docker not starting services:

- Ensure Docker is running
- Check for port conflicts
- Restart Docker daemon

Terraform errors:

- Run terraform init again
- Verify provider configuration

API not reachable:

- Confirm containers are running
- Check docker-compose logs

docker-compose logs

---

## 🔮 Future Improvements

- Database integration (PostgreSQL)
- Authentication & authorization
- Kubernetes deployment
- Load balancing
- Advanced monitoring dashboards
- Cloud deployment (AWS/Azure/GCP)
- Security enhancements
- Automated testing suite

---

## 🤝 Contributing

Contributions are welcome.

Steps:

1. Fork the repository
2. Create a feature branch

git checkout -b feature-name

3. Commit changes

git commit -m "Add feature"

4. Push to your branch

git push origin feature-name

5. Open a pull request

---

## 📄 License

This project is for educational and demonstration purposes. Feel free to use and modify it for learning.

---

## 👩‍💻 Author

Developed as part of a cloud-native banking simulation project focused on:

- Microservices
- DevOps automation
- Cloud architecture
- Monitoring & observability

---

## ⭐ Support

If you found this project helpful:

- Star the repository
- Contribute improvements

