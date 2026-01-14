from fastapi import FastAPI

app = FastAPI(title="Cloud Simulated Banking API")

@app.get("/")
def root():
    return {
        "message": "Cloud Simulation API running",
        "aws_simulation": {
            "api_gateway": "FastAPI",
            "database": "MongoDB",
            "object_storage": "MinIO"
        }
    }
