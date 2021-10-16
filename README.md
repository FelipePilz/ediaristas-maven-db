# Projeto TreinaWeb Multi-Stack < BACK-END /> 
Aplicativo feito durante o workshop multi-stack da TreinaWeb, que ocorreu no período de 6 a 13 de outubro de 2021, aonde foi proposto um site para contratar diaristas que estão na mesma cidade que o usuário e todas essas diaristas estariam registradas na parte back-end do aplicativo.

#### Tecnologias utilizadas no Back-end:
<div style="display: inline_block">
  <img align="center" title="Spring" alt="Felipe-Spring" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg">
  <img align="center" title="Java" alt="Felipe-Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">
  <img align="center" title="MySQL" alt="Felipe-MySQL" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg">
  <img align="center" title="DBeaver" alt="Felipe-DBeaver" height="40" width="40" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fserialkeygenpro.com%2Fwp-content%2Fuploads%2F2019%2F09%2FDBeaver_logo.png&f=1&nofb=1">
  <img align="center" title="Maven" alt="Felipe-Maven" height="40" width="40" src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fvscjava.gallerycdn.vsassets.io%2Fextensions%2Fvscjava%2Fvscode-maven%2F0.18.1%2F1563248098892%2FMicrosoft.VisualStudio.Services.Icons.Default&f=1&nofb=1">
  <img align="center" title="Insomnia" alt="Felipe-Insomnia" height="40" width="40" src="https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Ficons.iconarchive.com%2Ficons%2Fpapirus-team%2Fpapirus-apps%2F512%2Finsomnia-icon.png&f=1&nofb=1">
 
</div>

#### Tecnologias gerais:
<div style="display: inline_block">
  <img align="center" title="Visual Code" alt="Felipe-VsCode" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vscode/vscode-original.svg">
  <img align="center" title="Git" alt="Felipe-Git" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg">
  <img align="center" title="Linux" alt="Felipe-Linux" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/linux/linux-original.svg">
</div>
<br>

## Preparando o ambiente
### Caso você queira rodar a aplicação junto ao front-end, [clique aqui!](https://github.com/FelipePilz/ediaristas)
Primeiro, não esqueça de clonar ou baixar o meu projeto: <br>
![image](https://user-images.githubusercontent.com/67395760/137585913-8e5194a7-23dc-4228-93e4-5bf7aa1719b3.png)<br>
Caso você não tenha as dependências, recomendo você baixar  [MySQL](https://dev.mysql.com/downloads/installer/), [DBeaver](https://dbeaver.io/download/), [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) e [Maven](https://maven.apache.org/download.cgi)<br>
No VSCode, recomendo você baixar as extensões descritas [nesse video.](https://www.youtube.com/watch?v=orY9kC7Rs-c)<br>

## DBeaver
Para iniciar o banco, abra o DBeaver e clique em criar um novo banco de dados, representado pelo ![image](https://user-images.githubusercontent.com/67395760/137586296-a6b4d8de-7274-4de2-bfa9-1e4616ada3b4.png), após isso, selecione *MySQL*,<br> ![image](https://user-images.githubusercontent.com/67395760/137586342-a6aaac9c-02fb-4a64-aeff-5e1cf43ae53a.png)

Coloque a senha com base na senha que você colocou na instalação do MySQL, por padrão, ela vai ser root.
![image](https://user-images.githubusercontent.com/67395760/137586410-c7f72cbb-8c4c-4c28-8f7e-dff97b100471.png)

Em **Driver properties**, procure por duas propriedades<br>
![image](https://user-images.githubusercontent.com/67395760/137586481-e8485bb5-35c0-4e31-8201-a02ec8ca0c7f.png)
![image](https://user-images.githubusercontent.com/67395760/137586498-60d41ae8-8079-44d2-abe9-6a284c9fbb71.png)<br>
Modifique elas para:<br>
![image](https://user-images.githubusercontent.com/67395760/137586546-5012aa0f-ec83-4649-9858-d6d8df154ff2.png)
![image](https://user-images.githubusercontent.com/67395760/137586533-eaffbeff-89b0-48e7-a544-6261a8d50739.png)<br>
Após isso, vai aparecer no seu *Database Navigator* o localhost:3306, clique com o botão direito nele e selecione a primeira opção, criar um novo banco de dados, e coloque o nome e-diaristas.<br>
![image](https://user-images.githubusercontent.com/67395760/137586634-c3376610-5898-4f5c-8840-395ffb75f0bf.png)<br>

## Iniciando o servidor Maven e Spring
Observação, caso você tenha usado usuario(username) e senha(password) diferentes no DBeaver, altere ele no arquivo [application.properties](https://github.com/FelipePilz/ediaristas-maven-db/blob/master/src/main/resources/application.properties).<br>
Primeramente, após todas as dependências instaladas abra o terminal na pasta do arquivo e digite
```bash
mvn spring-boot:run
```
Espere um pouco e depois acesse [localhost:8000/admin/diaristas](http://localhost:8080/admin/diaristas)<br>
Agora está tudo pronto, só clicar em cadastrar clientes e se divertir :)

#

Caso ocorra qualquer erro relacionado a template-string, use esse comando no terminal do projeto:
```
mvn clean
mvn package
mvn spring-boot:run
```

##### Os erros nos getter e nos setters são normais devido ao Starter Lombok do Spring Initializr!
