from fastapi import FastAPI, Header, HTTPException
from prometheus_fastapi_instrumentator import Instrumentator

app = FastAPI(title="Cloud Sim Bank API")

# -------------------------
# Monitoring setup
# -------------------------
Instrumentator().instrument(app).expose(app)

# -------------------------
# Routes
# -------------------------
@app.get("/")
def root():
    return {
        "message": "Banking backend running behind Kong",
        "observability": "Prometheus metrics enabled"
    }

@app.get("/accounts")
def get_accounts(x_role: str = Header(default="user")):
    if x_role != "admin":
        raise HTTPException(status_code=403, detail="Admin role required")

    return {
        "accounts": [
            {"id": 1, "balance": 5000},
            {"id": 2, "balance": 12000}
        ]
    }
