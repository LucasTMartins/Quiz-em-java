public class Questao {

    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    double total = 0;

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns resposta Correta!");
            this.total = this.total + 1;
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            return false;
        }
    }

    public String toString() {
        return "\n" + this.pergunta
                + "\n \n" + this.opcaoA
                + "\n" + this.opcaoB
                + "\n" + this.opcaoC
                + "\n" + this.opcaoD
                + "\n" + this.opcaoE
                + "\n \nDigite a opção correta:";
    }

}
