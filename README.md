# Projeto Gerenciador de tarefas (com base no livro Spring Boot: Microserviços na prática)

-Link repositório:

https://github.com/fpreviatti/TaskManager.git

-Link para acessar o banco H2:

http://localhost:8080/api/h2-console

root/root

-Script para criação da tabela no banco de dados H2:

```
DROP TABLE IF EXISTS task;

CREATE TABLE task(
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     name VARCHAR(250) NOT NULL,
                     description VARCHAR(250) NOT NULL
);

INSERT INTO task(name,description) VALUES
('name1', 'Primeira tarefa'),
('name2', 'Segunda tarefa'),
('name3', 'Terceira tarefa');
```

-Controller (GET)para listar todas as tarefas: http://localhost:8080/api/book/tasks

-Controller (GET)para listar tarefa por id: http://localhost:8080/api/book/task/1