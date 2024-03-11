<h1>Historico de Peso para Pets!</h1>
 <p>Bem-vindo ao README da minha aplicação! Esta é uma aplicação Java monolítica que foi dockerizada e está pronta para ser executada em contêineres Docker.</p>
    <h2>Tecnologias Utilizadas</h2>
    <ul>
        <li>Java</li>
        <li>PostgreSQL</li>
        <li>MapStruct</li>
        <li>Swagger</li>
        <li>Docker</li>
    </ul>
    <h2>Pré-requisitos</h2>
    <ul>
        <li><a href="https://www.oracle.com/java/">Java Development Kit (JDK)</a> - Versão 18 ou superior</li>
        <li><a href="https://www.docker.com/">Docker</a></li>
    </ul>
    <h2>Como executar</h2>
    <ol>
        <li>Clone este repositório em sua máquina local.</li>
        <li>Navegue até o diretório raiz do projeto.</li>
        <li>Construa a imagem Docker executando o seguinte comando:<br><code>docker build -t minha-aplicacao .</code></li>
        <li>Após a conclusão da construção da imagem, execute o contêiner com o seguinte comando:<br><code>docker run -d -p 8080:8080 minha-aplicacao</code></li>
        <li>Agora sua aplicação estará sendo executada em segundo plano. Você pode acessá-la em seu navegador web em <a href="http://localhost:8080">http://localhost:8080</a>.</li>
    </ol>
    <h2>Como executar localmente</h2>
    <p>Se você deseja executar a aplicação localmente sem usar Docker, siga as instruções abaixo:</p>
    <ol>
        <li>Clone este repositório em sua máquina local.</li>
        <li>Assegure-se de que o JDK 18 ou superior esteja instalado em sua máquina.</li>
        <li>Navegue até o diretório raiz do projeto.</li>
        <li>Execute o seguinte comando para compilar a aplicação:<br><code>javac -d target src/*.java</code></li>
        <li>Execute o seguinte comando para executar a aplicação:<br><code>java -cp target MinhaAplicacao</code></li>
        <li>Agora sua aplicação estará sendo executada localmente. Você pode acessá-la em seu navegador web em <a href="http://localhost:8080">http://localhost:8080</a>.</li>
    </ol>
    <h2>Documentação da API Swagger</h2>
    <p>A documentação da API Swagger pode ser acessada em <a href="http://localhost:8080/swagger-ui/index.html#/">http://localhost:8080/swagger-ui/index.html</a>. Lá você encontrará informações sobre todos os endpoints da API, bem como exemplos de uso.</p>
    <h2>Contribuindo</h2>
    <p>Se você gostaria de contribuir com este projeto, sinta-se à vontade para abrir uma nova issue ou enviar uma pull request.</p>
    <h2>Licença</h2>
    <p>Este projeto está licenciado sob a MIT License - veja o arquivo <a href="LICENSE">LICENSE</a> para mais detalhes.</p>
