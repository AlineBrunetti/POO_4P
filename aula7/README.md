# Polimorfismo
## Slides
---

## Analogia 1

- **Controle remoto universal** → botão `ligar()`.
- TV: liga a tela.  
- Ar-condicionado: começa a soprar ar.  
- Som: ativa as caixas.

> Mesmo botão, ações diferentes dependendo do aparelho.

```java
ControleRemoto c = new ControleTV();
c.ligar(); // Liga a TV

c = new ControleArCondicionado();
c.ligar(); // Liga o ar
```

---

## Analogia 2

- Pergunta: "Qual é o seu nome?"
- Respostas diferentes: “Ana”, “Carlos”, “João”...

> A mesma pergunta, respostas diferentes conforme o objeto.

---

## Definição Simples

**Polimorfismo**: capacidade de uma referência se comportar de maneiras diferentes, dependendo do objeto real para o qual aponta.

- Uma mesma chamada de método pode ter resultados diferentes em objetos de classes diferentes.
- Requisitos:
  - **Herança**
  - **Sobrescrita de métodos**

---

## Por que usar

- Menos código repetido.
- Fácil de expandir.
- Código mais claro: foca no *o que fazer*, não *como fazer*.

---

## O que é Upcasting

**Upcasting**: transformar um objeto da subclasse em uma referência da superclasse (feito automaticamente e com segurança).

- Permite trabalhar com código genérico.
- O comportamento real ainda será da subclasse.

```java
Circulo c = new Circulo(2.0);
Forma f = c; // upcasting implícito
System.out.println(f.area()); // chama Circulo.area()
```

---

## Antes do Polimorfismo

```java
class Cachorro {
    void falar() { System.out.println("Au au"); }
}

class Gato {
    void falar() { System.out.println("Miau"); }
}

public class App {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.falar();

        Gato g = new Gato();
        g.falar();
    }
}
```

---

## Com Polimorfismo

### Parte 1

```java
class Animal {
    void falar() { System.out.println("Som genérico"); }
}

class Cachorro extends Animal {
    @Override
    void falar() {
        System.out.println("Au au");
    }
}

class Gato extends Animal {
    @Override
    void falar() {
        System.out.println("Miau");
    }
}
```

### Parte 2

```java
public class App {
    public static void main(String[] args) {
        Animal a1 = new Cachorro(); // upcasting
        Animal a2 = new Gato();

        a1.falar(); // "Au au"
        a2.falar(); // "Miau"
    }
}
```

---

## Polimorfismo e Mudança de Implementação

- Subclasse **herda** da superclasse.
- Pode **alterar** como um método é executado via `@Override`.
- Não confundir com **sobrecarga** (mesmo nome, parâmetros diferentes).

```java
class Animal {
    void falar() { System.out.println("Som genérico"); }
}

class Cachorro extends Animal {
    @Override
    void falar() { System.out.println("Au au"); }
}
```

> O código que usa `Animal` não precisa mudar.  
> Cada subclasse define seu comportamento.

---

## O papel do `@Override`

- Informa ao compilador que você quer sobrescrever um método da superclasse.
- **Não obrigatório**, mas recomendado:
  - Ajuda a evitar erros de digitação ou assinatura incorreta.

```java
class Cachorro extends Animal {
    @Override
    void falar() { System.out.println("Au au"); }
}
```

Sem `@Override`:

```java
class Cachorro extends Animal {
    void fala() { System.out.println("Au au"); } // ERRO: método não sobrescreve!
}
```

---

## Lista Polimórfica

```java
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Cachorro());

        for (Animal a : animais) {
            a.falar(); // método da subclasse correta
        }
    }
}
```

---

## Downcasting

- Converte uma referência de superclasse para subclasse.
- Deve-se ter certeza do tipo real.  
  Caso contrário: **`ClassCastException`**.

```java
Animal a = new Cachorro();
Cachorro c = (Cachorro) a; // OK

Animal a2 = new Gato();
Cachorro c2 = (Cachorro) a2; // Erro em runtime
```

---

## Resumo

- Polimorfismo = mesma chamada, comportamentos diferentes.
- Requer: **herança + sobrescrita**
- `Upcasting`: seguro  
- `Downcasting`: precisa de cuidado

---

## Método `toString()`

- Método da classe `Object`.
- Usado para representar objetos como texto.
- Importante para `debug` e exibição amigável.

```java
class Cliente {
    public String nome;
    public int idade;

    Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", idade: " + idade;
    }
}
```

### Exemplo de uso:

```java
public class App {
    public static void main(String[] args) {
        Cliente c = new Cliente("Ana", 25);
        System.out.println(c); 
        // Cliente: Ana, idade: 25
    }
}
```

> Ao sobrescrever `toString()`, essa versão será usada automaticamente em conversões para String.
