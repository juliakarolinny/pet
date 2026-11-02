
# 🐾 Pet API - Módulo de Gestão de Animais

Aplicação Java desenvolvida com o framework **Spring Boot** para consulta de dados de animais (`Animal`). O projeto foi estruturado utilizando a arquitetura em camadas (**Controller-Service-Repository-Entity**) e conta com uma interface frontend estática (`index.html`).

---

## 📂 Estrutura de Arquivos

Abaixo está a árvore exata do projeto contida no pacote enviado, desconsiderando apenas a pasta oculta de versionamento (`.git/`):

```
pet/
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── seduc2/
    │   │           └── pet/
    │   │               ├── Controller/
    │   │               │   └── AnimalController.java
    │   │               ├── Entity/
    │   │               │   └── Animal.java
    │   │               ├── Repository/
    │   │               │   └── AnimalRepository.java
    │   │               ├── Service/
    │   │               │   └── AnimalService.java
    │   │               └── PetApplication.java
    │   └── resources/
    │       ├── application.properties
    │       └── static/
    │           └── index.html
    └── test/
        └── java/
            └── com/
                └── seduc2/
                    └── pet/
                        └── PetApplicationTests.java
```

---

## 🛠️ Tecnologias do Projeto

* **Linguagem:** Java 17+
* **Framework:** Spring Boot
  * **Spring Web:** Para disponibilidade das rotas e serviços HTTP.
  * **Spring Data JPA:** Para comunicação com a base de dados.
* **Automação/Build:** Apache Maven (`pom.xml` + Maven Wrapper)
* **Frontend Estático:** HTML / JS (`src/main/resources/static/index.html`)

---

## 📐 Estrutura do Código Existente

O projeto divide suas responsabilidades nos seguintes arquivos:

1. **`PetApplication.java`:** Classe principal responsável por inicializar a aplicação Spring Boot.
2. **`Animal.java` (`Entity`):** Classe de modelo de dados mapeada para persistência.
3. **`AnimalRepository.java` (`Repository`):** Interface que estende a persistência de dados JPA para a entidade `Animal`.
4. **`AnimalService.java` (`Service`):** Regras de negócio associadas às consultas da entidade.
5. **`AnimalController.java` (`Controller`):** Mapeamento das requisições HTTP para disponibilização da rota de consulta de animais.
6. **`index.html`:** Página estática servida pela aplicação.

---

## 📡 Endpoints Implementados

De acordo com o código-fonte enviado, os seguintes recursos estão ativos na aplicação:

| Método | Endpoint | Descrição | Status |
| :--- | :--- | :--- | :--- |
| `GET` | `/animais` | Retorna a lista de animais cadastrados no sistema | **Implementado** |
| `GET` | `/` ou `/index.html` | Interface estática da aplicação | **Implementado** |

> **Nota:** Operações de escrita ou exclusão (`POST`, `PUT`, `DELETE`) não estão presentes na versão atual do código.

---

## 🚀 Como Executar

### Pré-requisitos
* **Java Development Kit (JDK 17)** ou superior configurado.

### Passos de Execução

1. No terminal, acesse a pasta raiz do projeto:
   ```bash
   cd pet
   ```

2. Execute o comando do Maven Wrapper de acordo com o seu sistema operacional:

   * **Windows:**
     ```cmd
     .\mvnw.cmd spring-boot:run
     ```
   * **Linux / macOS:**
     ```bash
     ./mvnw spring-boot:run
     ```

3. Após a inicialização, acesse no navegador:
   * **Página principal:** `http://localhost:8080/`
   * **Endpoint REST:** `http://localhost:8080/animais`
