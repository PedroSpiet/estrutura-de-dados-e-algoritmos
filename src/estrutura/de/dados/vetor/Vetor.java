package estrutura.de.dados.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int quantidade) {
        this.elementos = new String[quantidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
            }
        }
    }*/

    public void adiciona(String elemento) throws Exception{
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new  Exception("Este vetor ja está cheio, não foi possível adicionar");
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho-1 ; i++) {
            s.append(elementos[i]);
            s.append(",");
        }

        if (tamanho > 0) {
            s.append(elementos[tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }

    public String exibeElemento(int elemento) {
        if (elemento < 0 || elemento > tamanho ) {
            throw new IllegalArgumentException("Indice inválido");
        }

        return this.elementos[elemento];
    }

    public boolean elementoExiste(String elemento) {
        boolean existe = false;
        for (String elementoUnico : this.elementos) {
            if (elementoUnico == elemento) {
                existe = true;
            }
        }

        return existe;
    }

    private void aumentaCapacidade() {
        if (this.elementos.length == tamanho) {

            var novoVetor = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novoVetor[i] = this.elementos[i];
            }

            this.elementos = novoVetor;
        }
    }

    public void addElementoEmPosicao(String elemento, int posicao) {
        for (int i = tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;
    }
}
