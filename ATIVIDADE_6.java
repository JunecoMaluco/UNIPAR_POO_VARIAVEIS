TEORICA 

1- O que é orientação a objetos e quais são seus princípios fundamentais? 
  
R: A programação orientada a objetos é uma abordagem na qual a estrutura do programa é baseada na representação de entidades do mundo real através de objetos. Seus pilares principais incluem:

Abstração
Encapsulamento
Herança
Polimorfismo 

 

2-Quais são as vantagens da orientação a objetos em comparação com paradigmas de programação procedural? 

R: A programação orientada a objetos traz benefícios significativos quando comparada à abordagem procedural:

Reutilização de código: Classes e objetos podem ser reaproveitados, reduzindo a duplicação de código.

Abstração: Concentra-se nos aspectos essenciais, simplificando a compreensão e a manutenção do código.

Encapsulamento: Protege os dados e regula o acesso a eles, aprimorando a segurança e a integridade do sistema.

Herança: Hierarquias de classes permitem a reutilização de código e a organização eficiente do sistema.

Polimorfismo: Permite tratar objetos de diferentes classes de maneira uniforme, o que amplia a flexibilidade e a escalabilidade do código.

Essas vantagens culminam em um software mais robusto, flexível e fácil de manter."

"A programação orientada a objetos oferece vantagens significativas em relação à abordagem procedural:

Reutilização de código: Classes e objetos podem ser reaproveitados em diferentes partes do programa, reduzindo a redundância e facilitando a manutenção.

Abstração: Ao focar nos aspectos essenciais do sistema, a programação orientada a objetos simplifica a compreensão do código, permitindo uma visão mais clara e concisa do funcionamento do programa.

Encapsulamento: O encapsulamento protege os dados ao esconder sua implementação e controlar o acesso a eles através de métodos específicos. Isso melhora a segurança e a integridade dos dados, evitando acessos não autorizados e garantindo a consistência do sistema.

Herança: A hierarquia de classes permite a criação de novas classes baseadas em classes existentes, aproveitando funcionalidades já implementadas e promovendo a reutilização de código. Isso facilita a organização do sistema e ajuda a manter uma estrutura consistente e coesa.

Polimorfismo: O polimorfismo permite tratar objetos de diferentes classes de maneira uniforme, possibilitando a criação de interfaces genéricas para manipulação de objetos diversos. Isso aumenta a flexibilidade do código e simplifica a adição de novas funcionalidades sem a necessidade de modificar o código existente.

Essas vantagens resultam em software mais robusto, flexível e fácil de manter, contribuindo para o desenvolvimento de sistemas de alta qualidade e com melhor desempenho.

 

3- Explique o conceito de encapsulamento e como ele é implementado em linguagens de programação orientadas a objetos. 

R: O encapsulamento na programação orientada a objetos vai além de simplesmente agrupar dados e métodos em objetos. Ele também implica em ocultar a implementação interna do objeto, expondo apenas uma interface pública consistente e bem definida para interagir com o objeto.

Além disso, o encapsulamento promove a modularidade e a manutenibilidade do código, uma vez que as mudanças internas em um objeto encapsulado não afetam diretamente outras partes do programa que dependem desse objeto. Isso permite que o desenvolvedor faça alterações internas no objeto sem impactar o restante do sistema.

Outra vantagem do encapsulamento é que ele facilita a validação e o controle dos dados. Ao restringir o acesso aos dados apenas através de métodos específicos, é possível aplicar validações e garantir que os dados estejam sempre em um estado consistente e válido.

Em resumo, o encapsulamento não apenas protege os dados dentro de um objeto, mas também promove a modularidade, a manutenibilidade, a validação e o controle dos dados, contribuindo para a construção de sistemas mais robustos e confiáveis.

 

4- Explique o conceito de classe e objeto em programação orientada a objetos, e como eles estão relacionados. 

R: Na programação orientada a objetos, uma classe serve como um modelo que especifica os atributos e métodos compartilhados por objetos individuais. Quando um objeto é criado a partir dessa classe, ele se torna uma instância única, possuindo seus próprios valores para os atributos e a habilidade de executar os métodos definidos na classe. Em essência, uma classe é como um projeto ou um molde, enquanto um objeto representa uma concretização desse projeto.
 

5- Qual é a importância dos construtores e métodos em uma classe em programação orientada a objetos? 

R: Os construtores são responsáveis por inicializar objetos com um estado inicial, definindo seus atributos iniciais. Por outro lado, os métodos determinam o comportamento e as operações que os objetos podem realizar durante a execução do programa. Ambos desempenham papéis fundamentais na estrutura e na funcionalidade da programação orientada a objetos.
 

6- Quais são as diferenças entre métodos estáticos e métodos de instância em uma classe? 

R: Os métodos estáticos são parte intrínseca da própria classe, podendo ser invocados sem a criação de uma instância específica da classe. Por outro lado, os métodos de instância estão vinculados a objetos específicos da classe, exigindo a criação de um objeto para sua chamada. Em síntese, os métodos estáticos são acessíveis diretamente pela classe, enquanto os métodos de instância requerem a existência de um objeto para serem utilizados.
 

7- Como são tratados os conceitos de acoplamento e coesão na orientação a objetos e por que são importantes? 

R: O acoplamento refere-se ao grau de interdependência entre módulos ou componentes de um sistema de software. Quando dois módulos estão fortemente acoplados, mudanças em um podem exigir alterações no outro, aumentando a complexidade e o risco de introduzir erros.

Por outro lado, a coesão diz respeito à medida em que os elementos dentro de um módulo estão relacionados e focados em realizar uma única tarefa ou responsabilidade. Módulos com alta coesão tendem a ser mais compreensíveis, reutilizáveis e fáceis de manter.

Na programação orientada a objetos, é fundamental buscar um equilíbrio entre acoplamento e coesão. Um acoplamento baixo proporciona flexibilidade, facilitando a modificação e a reutilização de componentes em diferentes contextos. Enquanto isso, uma alta coesão garante que os elementos dentro de uma classe ou módulo estejam intimamente relacionados, promovendo a clareza, a eficiência e a facilidade de manutenção do código.

Portanto, a busca por um acoplamento baixo e uma alta coesão é uma prática essencial para desenvolver sistemas de software robustos, flexíveis e de fácil manutenção
 

8- Qual é o objetivo do metodo main ? 

R: A função main é o ponto de entrada de um programa, onde a execução do código começa. Ela coordena as operações iniciais e frequentemente recebe argumentos de linha de comando. 

 

9- Como ocorre a passagem de parâmetros em métodos de uma classe em programação orientada a objetos? 

R: Na programação orientada a objetos, quando se passam parâmetros para métodos, pode-se fazer isso de duas formas: por valor, o que significa que é feita uma cópia do valor; ou por referência, onde é passada uma referência ao objeto em questão.

 

10- Qual é a diferença entre os modificadores de acesso "public", "private" e "protected" em uma classe? 

R: public: Permite acesso aos membros de qualquer classe.

private: Restringe o acesso ao interior da própria classe onde o membro está definido.

protected: Funciona como o "private", mas também permite acesso às subclasses da classe onde o membro está definido.

Essas definições ajudam a controlar quem pode visualizar ou modificar partes específicas de uma classe, o que é fundamental para garantir a segurança e a consistência do código.
  
11-Qual é a importância da palavra-chave "this" em programação orientada a objetos e como ela é utilizada? 

R: Em programação orientada a objetos, o uso da palavra-chave "this" é uma convenção que se refere explicitamente ao objeto atual em um método ou construtor. Além de distinguir entre variáveis locais e variáveis de instância com o mesmo nome, o "this" também é útil para acessar métodos e atributos do próprio objeto, o que pode ser especialmente útil em situações onde há sobrecarga de métodos ou quando é necessário passar o próprio objeto como argumento para outros métodos. Em resumo, o "this" desempenha um papel fundamental na clareza e na precisão do código, ajudando os desenvolvedores a escreverem e entenderem melhor seus programas em orientação a objetos. 

 

PRÁTICA 

1 - Você deve criar uma classe em Java para representar um carro. A classe deve conter atributos privados para armazenar a marca, o modelo, o ano e a cor do carro. Além disso, você deve implementar métodos públicos para acessar e modificar esses atributos, garantindo o encapsulamento da classe. Por fim, crie um método para exibir as informações do carro. 

Após criar a classe, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as informações dos carros criados. 

Lembre-se de utilizar o encapsulamento adequado para proteger os atributos da classe e garantir o acesso seguro aos mesmos através dos métodos públicos. 

R:  package carro;

class Produto {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Produto(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public static void main(String[] args) {
        Produto carro1 = new Produto("Toyota", "Corolla", 2020, "Prata");
        Produto carro2 = new Produto("Honda", "Civic", 2019, "Preto");

        carro1.exibirInformacoes();
        System.out.println(); // linha em branco
        carro2.exibirInformacoes();

        carro1.setAno(2021);
        carro1.setCor("Vermelho");

        System.out.println(); // linha em branco
        System.out.println("Informações atualizadas do Carro 1:");
        carro1.exibirInformacoes();
    }
}

2 - Desenvolva uma classe em Java para representar um objeto do tipo Produto. Essa classe deve possuir atributos privados para armazenar o nome, o preço e a quantidade em estoque do produto. Implemente métodos públicos para acessar e modificar esses atributos, garantindo o encapsulamento adequado da classe.

Após criar a classe Produto, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as informações dos produtos criados.

Certifique-se de utilizar o encapsulamento de forma correta, protegendo os atributos da classe e garantindo o acesso seguro a eles através dos métodos públicos disponibilizados.

R: package produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.99, 50);
        Produto produto2 = new Produto("Calça Jeans", 79.99, 30);

        System.out.println("Informações do Produto 1:");
        produto1.exibirInformacoes();

        System.out.println(); // linha em branco

        System.out.println("Informações do Produto 2:");
        produto2.exibirInformacoes();

        produto1.setPreco(34.99);
        produto1.setQuantidadeEmEstoque(40);

        System.out.println(); // linha em branco
        System.out.println("Informações atualizadas do Produto 1:");
        produto1.exibirInformacoes();
    }
}

3 - Você deve implementar um programa em Java para gerenciar o estoque de uma loja. Para isso, crie uma classe **`Produto`** que representará os produtos disponíveis na loja. Esta classe deve possuir atributos privados para armazenar o nome, o preço e a quantidade em estoque do produto.

Em seguida, implemente métodos públicos na classe **`Produto`** para acessar e modificar esses atributos, garantindo o encapsulamento adequado da classe.

Após criar a classe **`Produto`**, desenvolva um programa principal que permita ao usuário realizar as seguintes operações:

1. Adicionar um novo produto ao estoque, fornecendo o nome, o preço e a quantidade em estoque.
2. Atualizar o preço ou a quantidade em estoque de um produto existente.
3. Exibir os detalhes de um produto específico, incluindo seu nome, preço e quantidade em estoque.

Certifique-se de utilizar o encapsulamento de forma correta na classe **`Produto`**, protegendo os atributos da classe e garantindo o acesso seguro a eles através dos métodos públicos disponibilizados.

R: import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto("Camiseta", 29.99, 50);

        System.out.println("=== Sistema de Gerenciamento de Estoque ===");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Atualizar Produto");
        System.out.println("3. Exibir Detalhes de Produto");
        System.out.println("0. Sair");

        int opcao;
        do {
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.next();
                    System.out.print("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em Estoque: ");
                    int quantidade = scanner.nextInt();
                    produto = new Produto(nome, preco, quantidade);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("1. Atualizar Preço");
                    System.out.println("2. Atualizar Quantidade em Estoque");
                    int escolha = scanner.nextInt();
                    if (escolha == 1) {
                        System.out.print("Novo Preço: ");
                        double novoPreco = scanner.nextDouble();
                        produto.setPreco(novoPreco);
                        System.out.println("Preço atualizado com sucesso!");
                    } else if (escolha == 2) {
                        System.out.print("Nova Quantidade em Estoque: ");
                        int novaQuantidade = scanner.nextInt();
                        produto.setQuantidadeEmEstoque(novaQuantidade);
                        System.out.println("Quantidade em Estoque atualizada com sucesso!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 3:
                    produto.exibirInformacoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

4 - **Exercício para Praticar Método Construtor em Java:**

Você deve criar uma classe **`Circulo`** que representará um círculo geométrico. Essa classe deve conter os seguintes atributos privados:

- Raio (do tipo double)
- Cor (do tipo String)

Implemente um método construtor na classe **`Circulo`** que aceite dois parâmetros: o raio e a cor do círculo. O método construtor deve inicializar os atributos correspondentes com os valores fornecidos como parâmetros.

Após criar a classe **`Circulo`**, desenvolva um programa principal que permita ao usuário criar objetos dessa classe e exibir suas características.

Certifique-se de que o método construtor está sendo utilizado corretamente para inicializar os objetos da classe **`Circulo`** com os valores fornecidos pelo usuário.

Dica: Você pode incluir métodos adicionais na classe **`Circulo`** para calcular a área ou o perímetro do círculo, se desejar.

R: import java.util.Scanner;

public class Circulo {
    private double raio;
    private String cor;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do teclado
        System.out.print("Digite a cor do círculo: ");
        String cor = scanner.nextLine();

        Circulo circulo = new Circulo(raio, cor);

        System.out.println("\nCaracterísticas do Círculo:");
        System.out.println("Raio: " + circulo.raio);
        System.out.println("Cor: " + circulo.cor);
        System.out.println("Área: " + circulo.calcularArea());

        scanner.close();
    }
}

5 - **Exercício para Praticar Múltiplos Construtores em Java:**

Crie uma classe **`Produto`** que representará um produto em uma loja. Essa classe deve conter os seguintes atributos privados:

- Nome (do tipo String)
- Preço (do tipo double)
- Quantidade em Estoque (do tipo int)

Implemente múltiplos métodos construtores na classe **`Produto`** para permitir diferentes maneiras de inicializar um objeto **`Produto`**. Os métodos construtores devem ser os seguintes:

1. Um construtor que aceita apenas o nome do produto e inicializa os demais atributos com valores padrão (preço = 0.0 e quantidade em estoque = 0).
2. Um construtor que aceita o nome e o preço do produto, inicializando a quantidade em estoque com o valor padrão (0).
3. Um construtor que aceita o nome, o preço e a quantidade em estoque do produto.

Após criar a classe **`Produto`**, desenvolva um programa principal que permita ao usuário criar objetos dessa classe utilizando os diferentes construtores implementados e exibir as características dos produtos criados.

Certifique-se de que os métodos construtores estão sendo utilizados corretamente para inicializar os objetos da classe **`Produto`** com os valores fornecidos pelo usuário.

R: import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEmEstoque = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque do produto: ");
        int quantidade = scanner.nextInt();

        Produto produto1 = new Produto(nome);
        Produto produto2 = new Produto(nome, preco);
        Produto produto3 = new Produto(nome, preco, quantidade);

        System.out.println("\nInformações do Produto 1:");
        produto1.exibirInformacoes();
        System.out.println("\nInformações do Produto 2:");
        produto2.exibirInformacoes();
        System.out.println("\nInformações do Produto 3:");
        produto3.exibirInformacoes();

        scanner.close();
    }
}
