public class Main {
    public static void main(String[] args) {

        System.out.println("\nBem vindo ao quiz!"
                + "\nTema: Hora de Aventura"
                + "\nCriador: Lucas Martins"
                + "\nMatéria: Algoritmo e Lógica de Programação 2"
                + "\nProfessor: Brenno Pimenta"
                + "\nInstituição: UNIFAN");

        for (int i = 1; i < 16; i++) {
            Perguntas.pergs(i);
        }

        Perguntas.totalCorretas();
    }
}
