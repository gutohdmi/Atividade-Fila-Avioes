public class FilaAviao {
    private int inicio;
    private int fim;
    private Aviao fila[];

    public FilaAviao(int tamanho) {
        this.fim = 0;
        this.inicio = 0;
        this.fila = new Aviao[tamanho];
    }

    public Aviao[] getFila() {
        return this.fila;
    }

    public void setFila(Aviao[] fila) {
        this.fila = fila;
    }

    public int getInicio() {
        return this.inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return this.fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public boolean filaCheia() {
        return this.fim >= this.fila.length;
    }

    public boolean enfileirar(Aviao aviao) {
        if (!this.filaCheia()) {
            this.fila[this.fim] = aviao;
            this.fim++;
            System.out.println("Adicionado Aviao: " + aviao);
            return true;
        } else {
            System.out.println("Fila cheia! Não foi possível adicionar: " + aviao);
            return false;
        }
    }

    public Aviao desenfileirar() {
        if (this.fila.length > this.inicio && this.inicio >= 0) {
            Aviao valorRemovido = this.fila[this.inicio];
            this.fila[this.inicio] = null;
            this.inicio++;
            return valorRemovido;
        }
        else  {
            return null;
        }
    }

    public Aviao desenfileirarCorreto() {
        if (this.inicio < this.fim) {
            Aviao valorRemovido = this.fila[this.inicio];

            for (int i = 0; i < this.fim - 1; i++) {
                this.fila[i] = this.fila[i + 1];
            }

            this.fila[this.fim - 1] = null;
            this.fim--;

            return valorRemovido;
        } else {
            System.out.println("Fila vazia!");
            return null;
        }
    }


}
