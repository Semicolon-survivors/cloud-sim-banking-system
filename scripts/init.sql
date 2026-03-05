CREATE DATABASE account_db;
CREATE DATABASE transactionsdb;

CREATE USER account_user WITH PASSWORD 'account_pass';
CREATE USER transaction_user WITH PASSWORD 'transaction_pass';

GRANT ALL PRIVILEGES ON DATABASE account_db TO account_user;
GRANT ALL PRIVILEGES ON DATABASE transactionsdb TO transaction_user;
