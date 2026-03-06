# 📊 Sistema de Gestão de Projetos e Equipes

> Este projeto foi construído para centralizar a operação de eventos, eliminando gargalos de comunicação e garantindo rastreabilidade. A arquitetura foi projetada para proteger dados sensíveis e forçar o cumprimento de regras de negócios essenciais para o sucesso da operação.

## ⚙️ Principais Funcionalidades

- **Gestão de Acessos:** Perfis blindados (Administrador, Gerente e Colaborador).
- **Cadastro Estratégico de Projetos:** Inclusão de dados focados em marketing e organização (Título Inteiro, Título Abreviado, Texto Tema, Categoria Foco, Categoria Adicional e E-mail de Contato).
- **Trava de Responsabilidade:** Impossibilidade sistêmica de criar um projeto sem alocação de um Gestor Responsável (Regra de negócio aplicada via Construtor).
- **Alocação de Equipes:** Distribuição de colaboradores por projeto de forma organizada.

## 💻 Tecnologias e Padrões Utilizados

- **Linguagem:** Java (JDK 17+)
- **Arquitetura:** MVC (Model - View - Controller) + Repository
- **Paradigma:** Programação Orientada a Objetos (POO) - Encapsulamento, Construtores e Instanciação.
- **Versionamento:** Git e GitHub

## 📂 Estrutura do Projeto (Padrão MVC)

O código-fonte é rigorosamente organizado para separar a interface, as regras de negócio e o controle de dados:

* `model/`: Classes de negócio (`Usuario.java`, `Projeto.java`) com encapsulamento de dados.
* `repository/`: Conexão e simulação do Banco de Dados (`UsuarioRepository.java`, `ProjetoRepository.java`).
* `view/`: Interfaces de interação com o usuário (`SistemaView.java`).
* `controller/`: Lógica de conexão entre telas e dados (`GestaoController.java`).
* `Main.java`: Ponto de entrada e execução do sistema.

## 🚀 Como Executar o Projeto
1. Faça o download do arquivo `.zip` ou clone este repositório:
   `git clone https://github.com/KahLeVas777/sistema-gestao-projetos-java.git`
2. Abra a pasta do projeto em sua IDE de preferência (IntelliJ IDEA, Eclipse ou VS Code).
3. Navegue até a pasta `src` e localize o arquivo `Main.java`.
4. Execute o arquivo `Main.java` para visualizar a simulação do sistema no console.

---
*Projeto desenvolvido como requisito de avaliação para a disciplina de Soluções Computacionais.*
