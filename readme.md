## 5) Podemos programar em Java sem usar pacotes? Porque é bom usar pacotes? Você usa pacotes somente porque o Eclipse impõe? Como compilaria o seu programa em linha de comando, sem usar pacotes?

Sim, é possível programar em Java sem usar pacotes. No entanto, é uma prática recomendada utilizar pacotes por várias razões:

- **Porque é bom usar pacotes**: Ajuda na lógica e facilita a manutenção.
- **Você usa pacotes somente porque o Eclipse impõe**: Não, é mais porque é uma boa pratica usar
- **Como compilaria o seu programa em linha de comando, sem usar pacotes**: Pacotes permitem controle de acesso a classes e membros, facilitando a implementação do encapsulamento.
eu teria que executar cada uma no terminal na hora que fosse chamar a principal tipo:

```bash
javac Classe1.java Classe2.java MeuPrograma.java  
```

## 6) Defina formalmente o Paradigma de Orientação a Objetos.

O Paradigma de Orientação a Objetos (POO) é um modelo de programação que utiliza "objetos" como elementos centrais. Cada objeto é uma instância de uma "classe", que define suas propriedades e comportamentos. Os principais conceitos do POO incluem:

- **Classe**: Uma pré estrutura de algo, uma forma a ser preenchida.
- **Objeto**: É algo que foi criado a partir da classe, o preenchimento da forma.
- **Encapsulamento**: A prática de ocultar os detalhes internos de um objeto, expondo apenas o que é necessário.
- **Herança**: Um mecanismo que permite que uma classe herde características de outra.
- **Polimorfismo**: É um método se comportar de diferentes maneiras em diferentes contextos.

## 7) Compare a POO com o modelo antigo de programação, como eram os programas antigamente no modelo procedural.

Nos modelos de programação procedural, o foco está em funções e procedimentos, onde o código é organizado em sequência e manipula dados diretamente. As principais características do modelo procedural incluem:

- **Estrutura Linear**: O código é executado em uma sequência definida
- **Dados e Funções Separados**: Dados são manipulados por funções sem uma estrutura clara de como esses dados estão agrupados.

Em contraste, a POO organiza o código em torno de objetos, permitindo uma abordagem mais modular e reutilizável. As vantagens incluem:

- **Encapsulamento**: A complexidade é oculta, tornando o sistema mais compreensível.
- **Reuso de Código**: Permite que os desenvolvedores reutilizem classes e métodos, aumentando a eficiência.

## 8) Quais foram as inovações trazidas pelo novo modelo de POO? Cite os benefícios obtidos por quem adotou o modelo de P.O.O.

As inovações trazidas pela POO:

- **Modularidade**: O código é dividido em módulos (classes), facilitando a manutenção.
- **Reuso de Código**: Herança e polimorfismo permitem que o código existente seja reutilizado.
- **Encapsulamento**: Protege dados e implementações, expondo apenas interfaces necessárias.
- **Facilidade na Manutenção**: Alterações em um módulo não afetam os outros, simplificando o gerenciamento.

Os benefícios incluem:

- **Desenvolvimento mais Rápido**: Por reaprovietar codigos
- **Redução de Erros**: Por ser algo mais limpo de se ver 
- **Melhor Escalabilidade** Por ser mais facil de gerenciar

## 9) O que é uma classe e o que é um objeto?

- **Classe**: Uma pré estrutura de algo, uma forma a ser preenchida, com métodos e seus atributos.

- **Objeto**: É algo que foi criado a partir da classe, o preenchimento da forma.

## 10) Porque sempre devemos encapsular as nossas classes?

O encapsulamento é uma boa prática crucial na POO por várias razões:

- **Controle de Acesso**
- **Manutenção Facilitada**
- **Prevenção de Erros**
- **Organização**
