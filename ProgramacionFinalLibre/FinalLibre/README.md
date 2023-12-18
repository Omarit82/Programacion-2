## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Contenido: Practicas para el Final libre de Programacion 2

`Guia 1`:

    Abstraccion de los datos.
    Funcionalidades y datos encapsulados en entidades fuertemente relacionadas.
    Correlacion directa entre las entidades del dominio: Brecha semantica - Separacion entre el dominio y el modelo.

    Objeto: componente de software almacenada en memoria que encapsula datos y comportamiento.
        
        Puede ser un objeto real -  una formula matematica - un evento(click).
        ENCAPSULAMIENTO: revela info que puede proporcionar y que pueden hacer. Pero no revela como lo hace o lo conoce
        Los objetos tienen RESPONSABILIDADES

        Metodos y Mensajes: 
            El mensaje es la señal que se le envia a un objeto para invocar un metodo.
            El metodo es el comportamiento de un objeto que se ejecuta cuando el objeto recibe el mensaje.
        -
    -

    Clase: Es un molde que define las instancias - Objetos - 

    Java es un lenguaje y una plataforma de desarrollo. Esta plataforma funciona en diversos sistemas operativos.
    Un compilador genera un Bytecode, que es un codigo intermedio para que ejecute cualquier maquina virtual de java VM.
    En windows es javac.exe el compilador que genera el Bytecode .class

        * Compilamos nuestra app a bytecode: 
            c:\> javac.exe miApp.java
        * Estp crea un archivo miApp.class. Se le indica a la VM que ejecute:
            c:\> java.exe miApp
