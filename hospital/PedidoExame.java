
package hospital;


public class PedidoExame {
    //atributos
    private boolean raioX;
    private boolean ressonancia;
    private boolean urina;
    private boolean sangue;

    public PedidoExame(int pedir) {
        organizarPedido(pedir);
    }

    //metodo privado
    private int organizarPedido(int pedido) {

        switch (pedido) {
            case 1:
                raioX = true;
                break;
            case 2:
                ressonancia = true;
                break;
            case 3:
                sangue = true;
                break;
            case 4:
                urina = true;
                break;
            default:
                System.out.println("Opção inválida!");
        }
        return pedido;
    }
    //metodos especiais

    public boolean getRaioX() {
        return raioX;
    }

    public void setRaioX(boolean raioX) {
        this.raioX = raioX;
    }

    public boolean getRessonancia() {
        return ressonancia;
    }

    public void setRessonancia(boolean ressonancia) {
        this.ressonancia = ressonancia;
    }

    public boolean getUrina() {
        return urina;
    }

    public void setUrina(boolean urina) {
        this.urina = urina;
    }

    public boolean getSangue() {
        return sangue;
    }

    public void setSangue(boolean sangue) {
        this.sangue = sangue;
    }

    public void Encaminhamento() {
        System.out.println("***Encaminhamento para Exame ***");
        if (raioX == true) {
            System.out.println("Encaminhe o paciente a sala de raio-X");
        } else if (ressonancia == true) {
            System.out.println("Encaminhe o paciente a sala de Ressonancia");
        } else if (sangue == true) {
            System.out.println("Encaminhe o paciente para colher amostra de sangue");
        } else if (urina == true) {
            System.out.println("Encaminhe o paciente para colher amostra de urina");
        }
        
    }
}
