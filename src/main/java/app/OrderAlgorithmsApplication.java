package app;

import models.Aluno;

import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class OrderAlgorithmsApplication {

    public static void main(String[] args) throws IOException {

        final int MAX = 10000000;
        Scanner sc = new Scanner(System.in);
        Aluno[] listaAlunos = new Aluno[MAX];
        int opcao_auto = 0;
        System.out.println("""
                1 - preenchimento manual
                2 - preenchimento auto de dados
                selecione uma opção:""");
        opcao_auto = sc.nextInt();
        sc.nextLine();
        switch (opcao_auto){
            case 1:
                int opcao_ano = 0;
                String ano = "";
                String nome = "";
                int idade = 0;
                int matricula = 0;
                for (int i = 0;i < MAX;i++){
                    System.out.println("""
                    1 - 1º ano do Fundamental
                    2 - 2º ano do Fundamental
                    3 - 3º ano do Fundamental
                    4 - 4º ano do Fundamental
                    5 - 5º ano do Fundamental
                    6 - 6º ano do Fundamental
                    7 - 7º ano do Fundamental
                    8 - 8º ano do Fundamental
                    9 - 9º ano do Fundamental
                    10 - 1º ano do Ensino Medio
                    11 - 2º ano do Ensino Medio
                    13 - 3º ano do Ensino Medio
                    Selecione o ano do aluno: """);
                    opcao_ano = sc.nextInt();
                    sc.nextLine();
                    switch (opcao_ano){
                        case 1:
                            ano = "1º ano do Fundamental";
                            break;
                        case 2:
                            ano = "2º ano do Fundamental";
                            break;
                        case 3:
                            ano = "3º ano do Fundamental";
                            break;
                        case 4:
                            ano = "4º ano do Fundamental";
                            break;
                        case 5:
                            ano = "5º ano do Fundamental";
                            break;
                        case 6:
                            ano = "6º ano do Fundamental";
                            break;
                        case 7:
                            ano = "7º ano do Fundamental";
                            break;
                        case 8:
                            ano = "8º ano do Fundamental";
                            break;
                        case 9:
                            ano = "9º ano do Fundamental";
                            break;
                        case 10:
                            ano = "1º ano do Ensino Medio";
                            break;
                        case 11:
                            ano = "2º ano do Ensino Medio";
                            break;
                        case 12:
                            ano = "3º ano do Ensino Medio";
                            break;
                        default:
                            System.out.println("opção inválida");
                    }
                    System.out.println("Informe o nome do aluno: ");
                    nome = sc.next();
                    System.out.println("Informe a idade do aluno: ");
                    idade = sc.nextInt();
                    matricula = i + 1;
                    Aluno aluno = new Aluno(ano,idade,matricula,nome);
                    listaAlunos[MAX-i-1] = aluno;
                }
                break;
            case 2:
                for (int i = 0;i < MAX;i++){
                    listaAlunos[MAX - i - 1] = new Aluno("1º ano do Fundamental",4,i + 1,"teste" + i);
                }
                break;
            default:
                System.out.println("opçõa inválida");
                break;
        }
        for (Aluno aluno : listaAlunos){
            System.out.println(aluno);
        }
        int opcao_ordenador = 0;
        System.out.println("""
                1 - Bubble Sort
                2 - Selection Sort
                3 - Insertion Sort
                4 - Merge Sort
                5 - Quick Sort
                6 - Bogo Sort
                7 - Comb Sort
                8 - Shell Sort
                9 - Tim Sort
                Selecione o algoritimo de ordenação desejado: 
                """);
        opcao_ordenador = sc.nextInt();
        switch (opcao_ordenador){
            case 1:
                long start = System.currentTimeMillis();
                bubbleSort(listaAlunos);
                long elapsed = System.currentTimeMillis() - start;
                System.out.println("tempo de ordenação: " + elapsed);
                System.in.read();
                break;
            case 2:
                start = System.currentTimeMillis();
                selectionSort(listaAlunos);
                elapsed = System.currentTimeMillis() - start;
                System.out.println("tempo de ordenação: " + elapsed);
                System.in.read();
                break;
            case 3:
                start = System.currentTimeMillis();
                insertionSort(listaAlunos);
                elapsed = System.currentTimeMillis() - start;
                System.out.println("tempo de ordenação: " + elapsed);
                System.in.read();
                break;
            case 4:
                start = System.currentTimeMillis();
                mergeSort(listaAlunos,0, listaAlunos.length - 1);
                elapsed = System.currentTimeMillis() - start;
                System.out.println("tempo de ordenação: " + elapsed);
                System.in.read();
                break;
            case 5:
                start = System.currentTimeMillis();
                quickSort(listaAlunos,0, listaAlunos.length - 1);
                elapsed = System.currentTimeMillis() - start;
                System.out.println("tempo de ordenação: " + elapsed);
                System.in.read();
                break;
            case 6:
                start = System.currentTimeMillis();
                bogoSort(listaAlunos);
                elapsed = System.currentTimeMillis() - start;
                System.out.println("tempo de ordenação: " + elapsed);
                System.in.read();
                break;
            case 7:
                start = System.currentTimeMillis();
                combSort(listaAlunos);
                elapsed = System.currentTimeMillis() - start;
                System.out.println("tempo de ordenação: " + elapsed);
                System.in.read();
                break;
            case 8:
                start = System.currentTimeMillis();
                shellSort(listaAlunos);
                elapsed = System.currentTimeMillis() - start;
                System.out.println("tempo de ordenação: " + elapsed);
                System.in.read();
                break;
            case 9:
                start = System.currentTimeMillis();
                timSort(listaAlunos);
                elapsed = System.currentTimeMillis() - start;
                System.out.println("tempo de ordenação: " + elapsed);
                System.in.read();
                break;
            default:
                System.out.println("opção inválida");
                System.in.read();
                break;
        }
        for (Aluno aluno : listaAlunos){
            System.out.println(aluno);
        }
        int matricula = 0;
        System.out.println("Digite uma matricula para busca: ");
        matricula = sc.nextInt();
        sc.nextLine();

        System.out.println("teste busca linear: ");
        long start = System.currentTimeMillis();
        System.out.println(buscaLinear(listaAlunos,matricula));
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("tempo de busca: " + elapsed);

        System.out.println("teste busca binaria: ");
        start = System.currentTimeMillis();
        System.out.println(buscaBinaria(listaAlunos,matricula));
        elapsed = System.currentTimeMillis() - start;
        System.out.println("tempo de busca: " + elapsed);
    }

    /*
    #############
    #BUBBLE SORT#
    #############
    */

    public static void bubbleSort(Aluno[] listaAlunos){
        int n = listaAlunos.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1;i++){
                if (listaAlunos[i].getMatricula() > listaAlunos[i + 1].getMatricula()){
                    Aluno temp = listaAlunos[i];
                    listaAlunos[i] = listaAlunos[i + 1];
                    listaAlunos[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    /*
    ################
    #SELECTION SORT#
    ################
    */

    public static void selectionSort(Aluno[] listaAlunos){
        int n = listaAlunos.length;
        for (int i = 0; i < n - 1;i++){
            int menor = i;
            for (int j = i + 1;j < n;j++){
                if (listaAlunos[j].getMatricula() < listaAlunos[menor].getMatricula()){
                    menor = j;
                }
            }
            Aluno temp = listaAlunos[i];
            listaAlunos[i] = listaAlunos[menor];
            listaAlunos[menor] = temp;
        }
    }

    /*
    ################
    #INSERTION SORT#
    ################
    */

    public static void insertionSort(Aluno[] listaAlunos){
        for (int i = 1;i < listaAlunos.length;i++){
            Aluno chave = listaAlunos[i];
            int j = i - 1;
            while(j >= 0 && listaAlunos[j].getMatricula() > chave.getMatricula()){
                listaAlunos[j + 1] = listaAlunos[j];
                j--;
            }
            listaAlunos[j + 1] = chave;
        }
    }

    /*
    ############
    #MERGE SORT#
    ############
    */

    public static void mergeSort(Aluno[] listaAlunos, int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim)/2;
            mergeSort(listaAlunos,inicio,meio);
            mergeSort(listaAlunos,meio + 1,fim);
            merge(listaAlunos,inicio,meio,fim);
        }
    }

    public static void merge(Aluno[] listaAlunos, int inicio, int meio, int fim){
        Aluno[] aux = new Aluno[listaAlunos.length];
        for (int i = inicio; i<= fim; i++) aux[i] = listaAlunos[i];
        int i = inicio, j = meio + 1,k = inicio;
        while (i <= meio && j <= fim){
            if (aux[i].getMatricula() <= aux[j].getMatricula())
                listaAlunos[k++] = aux[i++];
            else
                listaAlunos[k++] = aux[j++];
        }
        while (i <= meio) listaAlunos[k++] = aux[i++];
    }

    /*
    ############
    #QUICK SORT#
    ############
    */

    public static void quickSort(Aluno[] listaAlunos, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particiona(listaAlunos, inicio, fim);
            quickSort(listaAlunos, inicio, posicaoPivo - 1);
            quickSort(listaAlunos, posicaoPivo + 1, fim);
        }
    }

    public static int particiona(Aluno[] listaAlunos, int inicio, int fim) {
        Aluno pivo = listaAlunos[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (listaAlunos[j].getMatricula() <= pivo.getMatricula()) {
                i++;
                Aluno temp = listaAlunos[i];
                listaAlunos[i] = listaAlunos[j];
                listaAlunos[j] = temp;
            }
        }
        Aluno temp = listaAlunos[i + 1];
        listaAlunos[i + 1] = listaAlunos[fim];
        listaAlunos[fim] = temp;
        return i + 1;
    }

    /*
    #############
    ##BOGO SORT##
    #############
    */

    public static void bogoSort(Aluno[] listaAlunos) {
        Random rand = new Random();
        while (!isSorted(listaAlunos)) {
            for (int i = 0; i < listaAlunos.length; i++) {
                int j = rand.nextInt(listaAlunos.length);
                Aluno temp = listaAlunos[i];
                listaAlunos[i] = listaAlunos[j];
                listaAlunos[j] = temp;
            }
        }
    }

    public static boolean isSorted(Aluno[] listaAlunos) {
        for (int i = 1; i < listaAlunos.length; i++) {
            if (listaAlunos[i].getMatricula() < listaAlunos[i - 1].getMatricula()) return false;
        }
        return true;
    }

    /*
    ############
    #QUICK SORT#
    ############
    */

    public static void combSort(Aluno[] listaAlunos) {
        int n = listaAlunos.length;
        double fator = 1.3;
        int gap = n;
        boolean trocou = true;

        while (gap > 1 || trocou) {
            gap = (int)(gap / fator);
            if (gap < 1) gap = 1;

            trocou = false;
            for (int i = 0; i + gap < n; i++) {
                if (listaAlunos[i].getMatricula() > listaAlunos[i + gap].getMatricula()) {
                    Aluno temp = listaAlunos[i];
                    listaAlunos[i] = listaAlunos[i + gap];
                    listaAlunos[i + gap] = temp;
                    trocou = true;
                }
            }
        }
    }

    /*
    ############
    #SHELL SORT#
    ############
    */

    public static void shellSort(Aluno[] listaAlunos) {
        int n = listaAlunos.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Aluno temp = listaAlunos[i];
                int j = i;
                while (j >= gap && listaAlunos[j - gap].getMatricula() > temp.getMatricula()) {
                    listaAlunos[j] = listaAlunos[j - gap];
                    j -= gap;
                }
                listaAlunos[j] = temp;
            }
        }
    }

    /*
    ##############
    ###TIM SORT###
    ##############
    */

    private static final int MIN_MERGE = 32;

    public static void timSort(Aluno[] alunos) {
        int n = alunos.length;

        if (n < MIN_MERGE) {
            insertionSort(alunos, 0, n);
            return;
        }

        int minRun = minRunLength(n);
        for (int i = 0; i < n; i += minRun) {
            int end = Math.min(i + minRun, n);
            insertionSort(alunos, i, end);
        }

        for (int size = minRun; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size;
                int right = Math.min(left + 2 * size, n);

                if (mid < right) {
                    timMerge(alunos, left, mid, right);
                }
            }
        }
    }

    private static int minRunLength(int n) {
        int r = 0;
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    private static void insertionSort(Aluno[] alunos, int left, int right) {
        for (int i = left + 1; i < right; i++) {
            Aluno key = alunos[i];
            int j = i - 1;

            while (j >= left && alunos[j].getMatricula() > key.getMatricula()) {
                alunos[j + 1] = alunos[j];
                j--;
            }
            alunos[j + 1] = key;
        }
    }

    private static void timMerge(Aluno[] alunos, int l, int m, int r) {
        int len1 = m - l, len2 = r - m;
        Aluno[] left = new Aluno[len1];
        Aluno[] right = new Aluno[len2];

        System.arraycopy(alunos, l, left, 0, len1);
        System.arraycopy(alunos, m, right, 0, len2);

        int i = 0, j = 0, k = l;

        while (i < len1 && j < len2) {
            if (left[i].getMatricula() <= right[j].getMatricula()) {
                alunos[k++] = left[i++];
            } else {
                alunos[k++] = right[j++];
            }
        }

        while (i < len1) {
            alunos[k++] = left[i++];
        }

        while (j < len2) {
            alunos[k++] = right[j++];
        }
    }


    public static Aluno buscaBinaria(Aluno[] listaAlunos, Integer matricula){
        int inicio = 0;
        int fim = listaAlunos.length - 1;
        int meio = 0;
        while (inicio <= fim){
            meio = (inicio + fim)/2;
            if (Objects.equals(listaAlunos[meio].getMatricula(), matricula)) return listaAlunos[meio];
            if (listaAlunos[meio].getMatricula() < matricula) inicio = meio + 1;
            else fim = meio - 1;

        }
        return null;
    }

    public static Aluno buscaLinear(Aluno[] listaAlunos, Integer matricula){
        for (int i = 0;i < listaAlunos.length;i++){
            if (Objects.equals(listaAlunos[i].getMatricula(), matricula)) return listaAlunos[i];
        }
        return null;
    }
}
