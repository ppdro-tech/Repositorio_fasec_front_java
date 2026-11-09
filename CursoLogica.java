import java.util.Scanner;

// Execute no terminal com: java CursoLogica.java
public class CursoLogica {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========================================================");
            System.out.println("   CURSO DE LÓGICA E PROGRAMAÇÃO - DIDÁTICA DO CURSO   ");
            System.out.println("========================================================");
            System.out.println("1. [Aula 1 e 2] Introdução, Variáveis e Operadores");
            System.out.println("2. [Aula 3] Estruturas Condicionais (if / else)");
            System.out.println("3. [Aula 4] Exercícios de Condicionais (Notas, Par/Ímpar, Idade)");
            System.out.println("4. [Aula 5] Laços de Repetição - Parte 1 (while e do-while)");
            System.out.println("5. [Aula 6] Laços de Repetição - Parte 2 (for)");
            System.out.println("6. [Aula 7] Exercícios de Laços (Tabuada, Contagem e Acumulador)");
            System.out.println("7. [Aulas 8 e 9] Interatividade e Equivalência do DOM");
            System.out.println("8. Executar TODAS as Aulas em Sequência (Demonstração Completa)");
            System.out.println("0. Sair");
            System.out.println("========================================================");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer de quebra de linha
            } else {
                System.out.println("Opção inválida! Digite um número inteiro.");
                scanner.nextLine();
                continue;
            }

            System.out.println();
            switch (opcao) {
                case 1:
                    aula1e2Variaveis();
                    break;
                case 2:
                    aula3Condicionais();
                    break;
                case 3:
                    aula4ExerciciosCondicionais();
                    break;
                case 4:
                    aula5LacosWhile();
                    break;
                case 5:
                    aula6LacosFor();
                    break;
                case 6:
                    aula7ExerciciosLacos();
                    break;
                case 7:
                    aulas8e9EquivalenciaDOM();
                    break;
                case 8:
                    executarTudo();
                    break;
                case 0:
                    System.out.println("Encerrando o programa de estudos. Bons estudos!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public static void aula1e2Variaveis() {
        System.out.println("--- [AULAS 1 E 2] VARIÁVEIS E TIPOS DE DADOS ---");
        System.out.println("Didática: Compreender como armazenar dados na memória do computador.");
        System.out.println("Diferença JS vs Java: No JS usamos 'let' ou 'const' com tipagem dinâmica.");
        System.out.println("No Java, a tipagem é estática e explícita (int, double, String, boolean).\n");

        // Declaração de variáveis de diferentes tipos
        String nomeAluno = "Augusto";
        int idade = 20;
        double nota1 = 8.5;
        double nota2 = 7.0;
        boolean matriculado = true;

        System.out.println("Nome: " + nomeAluno + " (String/Texto)");
        System.out.println("Idade: " + idade + " anos (int/Inteiro)");
        System.out.println("Notas: " + nota1 + " e " + nota2 + " (double/Ponto Flutuante)");
        System.out.println("Status Matriculado: " + matriculado + " (boolean/Lógico)");

        // Operadores Aritméticos (+, -, *, /, %)
        double soma = nota1 + nota2;
        double media = soma / 2.0;
        int restoDivisao = idade % 2;

        System.out.println("\nOperações Aritméticas:");
        System.out.println(" - Soma das notas: " + soma);
        System.out.println(" - Média calculada: " + media);
        System.out.println(" - Resto da divisão da idade por 2 (módulo %): " + restoDivisao);
    }

    public static void aula3Condicionais() {
        System.out.println("--- [AULA 3] ESTRUTURAS CONDICIONAIS ---");
        System.out.println("Didática: Tomada de decisões baseada em expressões lógicas verdadeiras ou falsas.\n");

        double media = 7.5;
        int frequenciaPercentual = 80;

        System.out.println("Dados do aluno para teste -> Média: " + media + ", Frequência: " + frequenciaPercentual + "%");

        // Operadores relacionais: >=, >, <=, <, ==, !=
        // Operadores lógicos: && (E), || (OU), ! (NÃO)
        if (media >= 7.0 && frequenciaPercentual >= 75) {
            System.out.println("Resultado: APROVADO DIRETAMENTE! (Média >= 7.0 E Frequência >= 75%)");
        } else if (media >= 5.0 && frequenciaPercentual >= 75) {
            System.out.println("Resultado: EM RECUPERAÇÃO! (Nota entre 5.0 e 6.9 com frequência mínima)");
        } else {
            System.out.println("Resultado: REPROVADO! (Nota insuficiente ou falta excessiva)");
        }
    }

    public static void aula4ExerciciosCondicionais() {
        System.out.println("--- [AULA 4] EXERCÍCIOS DE FIXAÇÃO DE CONDICIONAIS ---");
        System.out.println("Didática prática: Resolução dos clássicos problemas de tomada de decisão.\n");

        // Exercício 1: Par ou Ímpar
        int numero = 17;
        System.out.println("Exercício 1: Testando se o número " + numero + " é Par ou Ímpar:");
        if (numero % 2 == 0) {
            System.out.println(" -> " + numero + " é PAR (resto da divisão por 2 é zero).");
        } else {
            System.out.println(" -> " + numero + " é ÍMPAR (resto da divisão por 2 é diferente de zero).");
        }

        // Exercício 2: Classificação por Faixa Etária
        int idade = 22;
        System.out.println("\nExercício 2: Classificando a idade " + idade + " anos:");
        if (idade < 12) {
            System.out.println(" -> Criança");
        } else if (idade < 18) {
            System.out.println(" -> Adolescente");
        } else if (idade < 60) {
            System.out.println(" -> Adulto");
        } else {
            System.out.println(" -> Idoso");
        }

        // Exercício 3: Situação de Voto no Brasil
        System.out.println("\nExercício 3: Situação eleitoral para " + idade + " anos:");
        if (idade < 16) {
            System.out.println(" -> Voto Proibido / Não vota");
        } else if ((idade >= 16 && idade < 18) || idade >= 70) {
            System.out.println(" -> Voto Facultativo");
        } else {
            System.out.println(" -> Voto Obrigatório");
        }
    }

    public static void aula5LacosWhile() {
        System.out.println("--- [AULA 5] LAÇOS DE REPETIÇÃO: WHILE E DO-WHILE ---");
        System.out.println("Didática: Executar um bloco de instruções repetidamente enquanto uma condição for verdadeira.\n");

        System.out.println("1. Exemplo com 'while' (testa a condição ANTES de executar):");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("   Passo " + contador);
            contador++; // Incremento essencial para evitar loop infinito
        }

        System.out.println("\n2. Exemplo com 'do-while' (garante que executa pelo menos UMA vez):");
        int valor = 10;
        do {
            System.out.println("   Executou uma vez mesmo o valor sendo " + valor + " (condição testa valor < 5)");
            valor++;
        } while (valor < 5);
    }

    public static void aula6LacosFor() {
        System.out.println("--- [AULA 6] LAÇOS DE REPETIÇÃO: FOR ---");
        System.out.println("Didática: Estrutura compacta reunindo (inicialização; condição; incremento).\n");

        System.out.println("1. Contagem progressiva de 1 até 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("   i = " + i);
        }

        System.out.println("\n2. Contagem regressiva de 5 até 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.println("   i = " + i);
        }

        System.out.println("\n3. Contagem com passo 2 (números pares até 10):");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void aula7ExerciciosLacos() {
        System.out.println("--- [AULA 7] EXERCÍCIOS DE FIXAÇÃO DE LAÇOS ---");
        System.out.println("Didática: Aplicação de acumuladores e geradores de repetição.\n");

        // Exercício 1: Gerador de Tabuada
        int numeroTabuada = 7;
        System.out.println("Exercício 1: Tabuada do número " + numeroTabuada + " utilizando for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("   " + numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }

        // Exercício 2: Acumulador / Soma dos números de 1 a 100
        int somaAcumulada = 0;
        for (int i = 1; i <= 100; i++) {
            somaAcumulada += i;
        }
        System.out.println("\nExercício 2: Soma de todos os números inteiros de 1 a 100:");
        System.out.println("   Total acumulado = " + somaAcumulada);

        // Exercício 3: Contagem de quantos números pares existem entre 1 e 20
        int totalPares = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                totalPares++;
            }
        }
        System.out.println("\nExercício 3: Quantidade de números pares entre 1 e 20:");
        System.out.println("   Total de pares encontrados = " + totalPares);
    }

    public static void aulas8e9EquivalenciaDOM() {
        System.out.println("--- [AULAS 8 E 9] INTERATIVIDADE E EQUIVALÊNCIA DO DOM ---");
        System.out.println("Conceito Didático:");
        System.out.println(" No JavaScript web, o DOM (Document Object Model) permite:");
        System.out.println("   1. Ler o que o usuário digita em campos HTML (<input>)");
        System.out.println("   2. Reagir a eventos de clique (<button onclick='...'>)");
        System.out.println("   3. Escrever e alterar textos diretamente na tela (innerHTML / textContent)");
        System.out.println();
        System.out.println("Em Java (aplicação de Console/Terminal), fazemos a mesma interação:");
        System.out.println("   1. Leitura de dados do usuário via 'Scanner'");
        System.out.println("   2. Processamento da lógica");
        System.out.println("   3. Saída formatada para o usuário com 'System.out.println'");
        System.out.println("------------------------------------------------------------------");

        System.out.print("\n[Simulação Interativa] Digite o seu primeiro nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número para ver a tabuada em tempo real: ");
        int num = 5;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Entrada não numérica detectada. Usando valor padrão 5.");
            scanner.nextLine();
        }

        System.out.println("\nOlá, " + nome + "! Veja o resultado gerado dinamicamente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("   " + num + " x " + i + " = " + (num * i));
        }
    }

    // ==========================================================================
    // DEMONSTRAÇÃO COMPLETA
    // ==========================================================================
    public static void executarTudo() {
        System.out.println("\n>>> INICIANDO DEMONSTRAÇÃO COMPLETA DO CURSO <<<\n");
        aula1e2Variaveis();
        System.out.println();
        aula3Condicionais();
        System.out.println();
        aula4ExerciciosCondicionais();
        System.out.println();
        aula5LacosWhile();
        System.out.println();
        aula6LacosFor();
        System.out.println();
        aula7ExerciciosLacos();
        System.out.println("\n>>> FIM DA DEMONSTRAÇÃO COMPLETA <<<");
    }
}
