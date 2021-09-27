## SOLID

SOLID é um conjunto de principios que ajudam no desenvolvimento de código em linguagens OO ( Orientada a Objeto ).<br/>

Esses principios servem para resolver problemas / paradigmas de programação que normalmente todo sofware ( sistema ) possui, esses princípios ajudam na criação de bons códigos, facilitando a evolução / manutenção do mesmo.<br/>

Cada letra da palavra SOLID significa um principio, abaixo iremos apresentar os 5 principios.<br/>

Para cada princípio será apresentado sua descrição, vantagens (contendo 3 [mesmo existindo mais]), possíveis erros causados pela falta do uso e o código criado para exemplificar o princípio.

### LETRA [S] - SRP - Single Responsiblity Principle

Cada letra forma outro conjunto de letras, o S = SRP ( Single Responsiblity Principle ) e significa Princípio da responsabilidade única. Este princípio prega que cada classe tenha apena um objetivo, trate apenas um assunto.

##### VANTAGEM

1 - Reuso do código;<br/>
2 - Evolução facilitada;<br/>
3 - Alto acoplamento.<br/>

##### POSSÍVEIS ERROS CAUSADOS PELA FALTA DE USO

1 - Classes "Monstras" / "Deuses";
2 - Alterações complicas;
3 - Falta de coesão;
4 - Código duplicado;

##### CÓDIGO FORA DO PRINCÍPIO

A classe LoginPage é responsável por efutar login e até cadastrar um usuário.

```
public class LoginPage {

    public void acessar(){
        System.out.println("Acessar pagina do sistema!");
    }

    public void logar(){
        System.out.println("Logar no sistema!");
    }

    public void cadastrarUsuario(){
        System.out.println("Erro - > Cadastrar Usuario");
    }

    public void acessarMenuUsuario(){
        System.out.println("Acessar Menu Usuario");
    }

}
```

##### CÓDIGO APLICANDO O PRINCÍPIO

Foram criar classes referentes ao Usuario e ao Menu, separando as responsabilidades e ações.<br/>

LoginPage
```
public class LoginPage {

    public void acessar(){
        System.out.println("Acessar pagina do sistema!");
    }

    public void logar(){
        System.out.println("Logar no sistema!");
    }

}
```

MenuPage
```
public class MenuPage {

    public void acessarMenuUsuario(){
        System.out.println("Acessar Menu Usuario");
    }

}
```

UsuarioPage
```
public class UsuarioPage {

    public void cadastrarUsuario(){
        System.out.println("Erro - > Cadastrar Usuario");
    }

}
```

### LETRA [O] - OCP - Open Closed Principle

Cada letra forma outro conjunto de letras, o 'O' = OCP ( Open Closed Principle ).<br/><br/>
Significa Princípio aberto / fechado. Este princípio prega que o código seja aberto para evolução / expansão, mas que não seja necessária (fechado) modificações para que as evoluções aconteçam.

##### VANTAGEM

1 - Velocidade ( custo e tempo ) nas evoluções;
2 - Manutenções facilidades;
3 - Reuso do código;

##### POSSÍVEIS ERROS CAUSADOS PELA FALTA DE USO

1 - Complexidade alta no código;
2 - Alterações complicas;
3 - Falta de coesão;
4 - Código duplicado;

##### CÓDIGO FORA DO PRINCÍPIO

Classe responsável em calcular juros
```
public class Calculadora {

    public double jurosBandeira(String nomeBandeira){

        double result = 0;

        if("VISA".equals(nomeBandeira)){
            result = new Visa().getTaxa();
        }else if("MASTERCARD".equals(nomeBandeira)){
            result = new MasterCard().getJuros();
        }

        result += 2;

        return result;
    }

}
```

##### CÓDIGO APLICANDO O PRINCÍPIO

Agora para calcular juros, é utilizado uma interface bandeira onde o comportamento de entregar o juro é solicitado, forçando qualquer bandeira implementar esse comportamento, facilitando a criação de outras, sem a necessidade de colocar mais um 'if'.

Classe Calculadora
```
public class Calculadora {

    public double jurosBandeira(Bandeira bandeira){
        return bandeira.getJuros() + 2;
    }

}
```

Interface Bandeira
```
public interface Bandeira {

    double getJuros();

}
```

Classes que implementam Bandeira

Classe MasterCard
```
public class MasterCard implements Bandeira {
    @Override
    public double getJuros() {
        return 0.8;
    }
}
```

### LETRA [L] - LSP - Liskov Substitution Principle

Cada letra forma outro conjunto de letras, o 'L' = LSP ( Liskov Substitution Principle ).<br/><br/>
Princípio criada por Barbara Liskov, e por isso o nome. Este princípio prega que uma classe derivada deve ser substituível por sua classe base.

##### VANTAGEM

1 - Utilização do conceito orientação a objeto;
2 - Tempo de manutenção;
3 - Abstração do código;

##### POSSÍVEIS ERROS CAUSADOS PELA FALTA DE USO

1 - Sobrescrever/implementar um método que não faz nada;
2 - Lançar uma exceção inesperada;
3 - Retornar valores de tipos diferentes da classe base;

##### CÓDIGO FORA DO PRINCÍPIO

Interface Ave
```
public interface Ave {

    void voar();
    void bicar();

}
```

Classe Pinguim ( forçado a implementar método[voar()], lugares que precisam de uma Ave não pode receber um PINGUIM )
```
public class Pinguim implements Ave{

    @Override
    public void voar() {
//        throw new RuntimeException("Pinguim não voa");
        System.out.println("----> ERRO <---- Pinguim não voa");
    }

    @Override
    public void bicar() {
        System.out.println("Pinguim bicando");
    }
    
}
```

##### CÓDIGO APLICANDO O PRINCÍPIO

Interface Ave não tem o comportamento de voar, a interface AveVoadora sim

```
public interface Ave {

    void bicar();

}
```

Interface AveVoadora
```
public interface AveVoadora extends Ave{

    void voar();

}
```

Classe Pinguim é uma Ave, não teve que impletar o metodo voar e agora pode substituir Ave em qualquer lugar.
```
public class Pinguim implements Ave {

    @Override
    public void bicar() {
        System.out.println("Pinguim bicando");
    }

}
```

### LETRA [I] - ISP - Interface Segregation Principle

Cada letra forma outro conjunto de letras, o 'I' = ISP ( Interface Segregation Principle ).<br/><br/>
Significa Princípio segregação da interface. Este princípio prega que nenhuma classe deve ser forçada a implementar um metodo que no contexto dela não faz sentido e/ou não será utilizada para nada.

##### VANTAGEM

1 - Aplicando conceito de orientação a objeto;
2 - Manutenção / encontro de bugs;
3 - Reuso do código

##### POSSÍVEIS ERROS CAUSADOS PELA FALTA DE USO

1 - Custo de implementar algo que não será utilizado;
2 - Falta de coesão;
3 - Tratamento de exceção desnecessário.

##### CÓDIGO FORA DO PRINCÍPIO

Interface Ave
```
public interface Ave {

    void voar();
    void bicar();

}
```

Classe Pinguim forçado a implementar o metodo 'voar()'
```
public class Pinguim implements Ave {

    @Override
    public void voar() {
        System.out.println("Como Pinguim não voa, vou tentar correr rapido.");
    }

    @Override
    public void bicar() {
        System.out.println("Pinguim bicando");
    }
}
```

##### CÓDIGO APLICANDO O PRINCÍPIO

Interface Ave não possui o metodo 'voar', e foi criada outra interface AveVoadora com esse comportamento.<br/>

Interface Ave
```
public interface Ave {

    void bicar();

}
```

Interface AveVoadora
```
public interface AveVoadora extends Ave {

    void voar();

}
```

Classe Pinguim
```
public class Pinguim implements Ave {

    @Override
    public void bicar() {
        System.out.println("Pinguim bicando");
    }

}
```

### LETRA [D] - DIP - Dependency Inversion Principle

Cada letra forma outro conjunto de letras, o 'D' = DIP ( Dependency Inversion Principle ).<br/><br/>
Significa Princípio inversão de dependência. Este princípio prega que nenhuma classe deva depender de uma implementação ( classe concreta ) e sim de uma interface, abstração de um comportamento.

##### VANTAGEM

1 - Reuso;
2 - Evolução / expansão facilitada;
3 - Não gera dependência;

##### POSSÍVEIS ERROS CAUSADOS PELA FALTA DE USO

1 - Alto acoplamento;
2 - Código duplicado;
3 - Entrar em desuso

##### CÓDIGO FORA DO PRINCÍPIO

Classe BandeiraService depende do banco de dados Mongo

```
public class BandeiraService {

    private Mongo mongo;

    public BandeiraService() {
        this.mongo = new Mongo();
    }

    public void inserirBandeira(String bandeira){
        mongo.inserir(bandeira);
    }

}
```

##### CÓDIGO APLICANDO O PRINCÍPIO

Classe BandeiraService depende de uma classe que implemente repositorio, facilitando a criação de novos bancos / repositorios.

```
public class BandeiraService {

    private Repositorio repositorio;

    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public BandeiraService(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void inserirBandeira(String bandeira){
        repositorio.inserir(bandeira);
    }

}
```

Interface Repositorio
```
public interface Repositorio {

    void inserir(String texto);

}
```

Classe Mongo implementar Repositorio
```
public class Mongo implements Repositorio {

    @Override
    public void inserir(String texto){
        System.out.printf("Estou inserindo este texto[%s] no banco MONGO.%n",texto);
    }

}
```

### REFERÊNCIAS


https://medium.com/desenvolvendo-com-paixao/o-que-%C3%A9-solid-o-guia-completo-para-voc%C3%AA-entender-os-5-princ%C3%ADpios-da-poo-2b937b3fc530