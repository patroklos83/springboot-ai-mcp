---

# MCP Sample – Spring Boot 3.5 Client/Server Integration

This repository contains a **sample Modular Communication Protocol (MCP)** integration built with **Spring Boot 4**, demonstrating a custom AI-enabled system using a standalone **MCP Server** and **MCP Client**.

---

## 📦 Project Structure

The project contains **two independent Spring Boot applications**:

```
/mcp-client
    └── src/main/java/.../McpClientApplication.java

/mcp-server
    └── src/main/java/.../McpServerApplication.java
```

### ✔️ **mcp-server**

A Spring Boot service that exposes MCP-compatible endpoints.
It acts as the backend system providing data, tools, or model responses.

### ✔️ **mcp-client**

A Spring Boot client application that connects to the MCP server.
It demonstrates AI-assisted interactions using your custom MCP protocol logic.

---

## ⚠️ Prerequisite (Very Important)

To run this application successfully, you **must have the Gemma 3 model downloaded and running via Docker Desktop**.

### Steps:

1. Open **Docker Desktop**
2. Go to **Extensions → Models** (or equivalent models section)
3. Search for **Google Gemma 3**
4. Download the model
5. Ensure it is **running locally** so the MCP client can access it

Without this model running, the AI interaction flow will not work.

---

## 🚀 Running the Applications

### 1. Start the MCP Server

Navigate to the **server** project and run:

```bash
./mvnw spring-boot:run
```

or run the main class directly:

```bash
McpServerApplication
```

The server will start on its configured port (commonly `8080` unless changed).

---

### 2. Start the MCP Client

Navigate to the **client** project and run:

```bash
./mvnw spring-boot:run
```

or run the main class directly:

```bash
McpClientApplication
```

The client will initialize, connect to the MCP server, and begin performing the AI integration logic defined in the project.

---

## 🧠 AI / MCP Integration Logic

This project demonstrates:

* Creating a **custom MCP protocol bridge** in Spring Boot
* Sending and receiving structured messages
* Integrating AI workflows with a custom tool system
* Using the client to query or manipulate data on the server

You can extend the protocol logic inside the client/server modules to connect with:

* LLMs
* Tooling APIs
* Internal services
* Workflow engines

---

## 🧪 Testing the Exposed API (Manual Developer Test)

Developers can test the MCP server's exposed API directly using **POST** requests.

### 🔹 Endpoint

```
POST http://localhost:8081/chat/ask
```

### 🔹 Request Body (raw text)

Send plain text as the request body.
Example:

```
[Postgres] give me some info on goku ?
```

### 🔹 Using cURL

```bash
curl -X POST \
  -H "Content-Type: text/plain" \
  --data "[Postgres] give me some info on goku ?" \
  http://localhost:8081/chat/ask
```

This lets developers quickly validate that the MCP server is receiving and processing requests correctly.

---

## ⚙️ Configuration

Common configuration files:

```
mcp-client/src/main/resources/application.yml
mcp-server/src/main/resources/application.properties
```

These may define:

* Server port
* Client target server URL
* Logging
* Credentials/tokens
* Model configuration

---

## 🧪 Running Tests

Run all tests:

```bash
./mvnw test
```

---

## 📚 Requirements

* Java 17+
* Maven 3.9+
* Spring Boot 4.x
* **Gemma 3 model downloaded and running from Docker Desktop (required)**
* (Optional) Any additional AI provider credentials you add later

---
