# 🎮 API de Seguros — Checkpoint 2

API RESTful com **Spring Boot** para gerenciamento de seguros automóveis e residenciais.
Evolução do Checkpoint 1: agora com persistência de dados via **Spring Data JPA** e banco **MySQL**.


## 🐳 Subindo o Banco de Dados com Docker

### Opção 1 — Docker Compose (recomendado)

```bash
docker-compose up -d
```

### Opção 2 — Comando Docker direto

```bash
docker run -d \
    --name mysql \
    --rm \
    -e MYSQL_ROOT_PASSWORD=root_pwd \
    -e MYSQL_USER=new_user \
    -e MYSQL_PASSWORD=my_pwd \
    -p 3306:3306 \
    mysql
```

Aguarde alguns segundos para o MySQL inicializar antes de rodar a aplicação.

---

## ▶️ Como Rodar a Aplicação

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/fabiohnardella/cp-jogos-api
   cd cp-jogos-api
   ```

2. **Suba o banco de dados:**
   ```bash
   docker-compose up -d
   ```

3. **Execute a aplicação:**
   ```bash
   ./mvnw spring-boot:run
   ```

A aplicação estará disponível em: `http://localhost:8080`

Swagger UI: `http://localhost:8080`

---

## 👨‍💻 Autor

Fabio Henrique — Checkpoint 2 | FIAP 2026



