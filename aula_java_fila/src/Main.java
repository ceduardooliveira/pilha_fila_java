public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila(5);
        //testando fila

        System.out.println("Adicionando: " + fila.adicionar("Abelha"));
        System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("Casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragão"));
        System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A fila está vazia? " + fila.estaVazia());

        System.out.println("Primeiro elementodad fila: " + fila.primeiro());
        System.out.println("Tamanho da fila " + fila.tamanho());

        while (!fila.estaVazia()){
            System.out.println("Removendo da fila: " + fila.remover());
        }
        System.out.println("A fila está vazia? " + fila.estaVazia());

        //testando pilha
        Pilha pilha = new Pilha(5);
        System.out.println();

        System.out.println("Adicionando: " + pilha.empilhar("Abobora"));
        System.out.println("Adicionando: " + pilha.empilhar("Beterraba"));
        System.out.println("Adicionando: " + pilha.empilhar("Carambola"));
        System.out.println("Adicionando: " + pilha.empilhar("Douglas"));
        System.out.println("Adicionando: " + pilha.empilhar("Eduardo"));

        System.out.println("A pilha está vazia? " + pilha.estaVazia());

        System.out.println("Primeiro elementodad pilha: " + pilha.topo());
        System.out.println("Tamanho da pilha " + pilha.tamanho());

        while (!pilha.estaVazia()){
            System.out.println("Removendo da pilha: " + pilha.desempilhar());
        }
        System.out.println("A pilha está vazia? " + pilha.estaVazia());
        System.out.println("Acabou");

    }
}