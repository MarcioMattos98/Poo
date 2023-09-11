package poo_tv;

class Televisor {

    int canal;
    int volume;
    boolean ligado;

    void aumentarVolume() {
        System.out.println("O volume est� definido em: " + this.volume);
        if (this.volume < 10) {
            this.volume += +1;
            System.out.println("O volume foi aumentado para: " + this.volume);
        } else {
            System.out.println("O volume est� no maximo!");
        }
    }

    void reduzirVolume() {
        System.out.println("O volume estava em:" + this.volume);
        if (this.volume > 0) {
            this.volume += -1;
            System.out.println("O volume foi diminuido para: " + this.volume);
        } else {
            System.out.println("Est� mudo!");
        }
    }

    void subirCanal() {
        System.out.println("O canal atual �: " + this.canal);
        if (this.canal < 16) {
            this.canal += +1;
            System.out.println("O canal atual �: " + this.canal);
        } else {
            System.out.println("Est� no ultimo canal!");
        }
    }

    void descerCanal() {
        System.out.println("O canal atual �: " + this.canal);
        if (this.canal > 0) {
            this.canal += -1;
            System.out.println("O canal atual �: " + this.canal);
        } else {
            System.out.println("n�o h� como abaixar o canal!");
        }
    }

    boolean ligarTelevisor() {
        if (this.ligado == false) {
            System.out.println("O televisor estava desligado");
            this.ligado = true;
            System.out.println("O televisor foi ligado");
        }
        return false;
    }

    boolean desligarTelevisor() {
        if (this.ligado == true) {
            System.out.println("O televisor estava ligado");
        } else {
            if (this.ligado == false) {
                System.out.println("O televisor foi desligado");
            }
        }
        return true;
    }

    void mostraStatus() {
        if (this.ligado == true) {
            System.out.println("A tv est� ligada, no canal: " + this.canal + " e no volume: " + this.volume);
        } else {
            System.out.println("A tv est� desligada!");
        }
    }

}
