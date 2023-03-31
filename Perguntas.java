import java.util.Scanner;

public class Perguntas {

    Questao q = new Questao();

    public void pergs(int valor){
        Scanner sc = new Scanner(System.in);

        switch (valor) {
            case 1:
                q.pergunta = "Quem foi o primeiro portador conhecido do Enchiridion?";

                q.opcaoA = "A) Lich";
                q.opcaoB = "B) Finn";
                q.opcaoC = "C) Billy";
                q.opcaoD = "D) Simon";
                q.opcaoE = "E) Mannish, o minotauro";
                q.correta = "D";

                break;

            case 2:
                q.pergunta = "O que é exatamente o Gunter?";

                q.opcaoA = "A) Um pinguim";
                q.opcaoB = "B) Um demônio";
                q.opcaoC = "C) Um vampiro";
                q.opcaoD = "D) Um mago bolado";
                q.opcaoE = "E) Um conquistador espacial";
                q.correta = "E";

                break;

            case 3:
                q.pergunta = "Por qual nome ficou conhecida a grande guerra que quase destruiu o planeta?";

                q.opcaoA = "A) Grande Guerra Nuclear";
                q.opcaoB = "B) Grande Guerra dos Cogumelos";
                q.opcaoC = "C) Grande Batalha de Magos";
                q.opcaoD = "D) Grande Guerra Mundial";
                q.opcaoE = "E) Grande Batalha Mundial";
                q.correta = "B";

                break;

            case 4:
                q.pergunta = "Como Jake ganhou seus poderes elásticos?";

                q.opcaoA = "A) Rolando na lama";
                q.opcaoB = "B) Nascendo da cabeça de seu pai, Joshua, por causa de um alienígena";
                q.opcaoC = "C) Fazendo um contrato com Hunson Abadeer";
                q.opcaoD = "D) Roubando de uma bruxa";
                q.opcaoE = "E) Um raio mágico caiu em sua cabeça";
                q.correta = "B";

                break;

            case 5:
                q.pergunta = "A aproximadamente quanto tempo as pessoas deixaram de ter 5 dedos?";

                q.opcaoA = "A) A 1 zibilhão de anos";
                q.opcaoB = "B) A 5 anos";
                q.opcaoC = "C) A 1 milhão de anos";
                q.opcaoD = "D) A 1 bilhão de anos";
                q.opcaoE = "E) A 1 quadrilhão de anos";
                q.correta = "A";

                break;

            case 6:
                q.pergunta = "Qual o verdadeiro nome do Rei Gelado?";

                q.opcaoA = "A) Richard";
                q.opcaoB = "B) Ted";
                q.opcaoC = "C) Simon";
                q.opcaoD = "D) Balthazar";
                q.opcaoE = "E) Serggio";
                q.correta = "C";

                break;

            case 7:
                q.pergunta = "Quais os 4 elementos básicos da terra de ooo?";

                q.opcaoA = "A) Terra, Fogo, Ar, Agua";
                q.opcaoB = "B) Fogo, Agua, Gelo, Terra";
                q.opcaoC = "C) Fogo, Doce, Gelo, Gosma";
                q.opcaoD = "D) Agua, Gelo, Neve, Frio";
                q.opcaoE = "E) Madeira, Raio, Som, Frio";
                q.correta = "C";

                break;

            case 8:
                q.pergunta = "O que Finn respondeu ao Morte após ele dizer 'Não pode me chutar porque o seu cérebro é burro!'?";

                q.opcaoA = "A) Isso nem faz sentido!";
                q.opcaoB = "B) O SEU cérebro é burro!";
                q.opcaoC = "C) Tudo bem, Jake... Eu tenho um plano";
                q.opcaoD = "D) Não é não!";
                q.opcaoE = "E) EU VOU ABRAÇAR A SUA MÃE!!";
                q.correta = "B";

                break;

            case 9:
                q.pergunta = "Qual o principal vilão do seriado?";

                q.opcaoA = "A) Rei gelado";
                q.opcaoB = "B) Orgalorg";
                q.opcaoC = "C) Hunson Abadeer";
                q.opcaoD = "D) Billy";
                q.opcaoE = "E) Lich";
                q.correta = "E";

                break;

            case 10:
                q.pergunta = "No episódio O Armário de Marceline, o que Jake quer fazer para passar o tempo enquanto espera Marceline chegar?";

                q.opcaoA = "A) Eliminar desejos do coração";
                q.opcaoB = "B) Caçar vampiros";
                q.opcaoC = "C) Jogar videogame";
                q.opcaoD = "D) Tocar violino";
                q.opcaoE = "E) Brincar de esconde-esconde";
                q.correta = "A";

                break;

            case 11:
                q.pergunta = "Qual a fala marcante de Finn enquanto se transforma em lobo do abraço?";

                q.opcaoA = "A) ME AJUDA JAKE!";
                q.opcaoB = "B) EU TO ME TRANSFORMANDO!";
                q.opcaoC = "C) SE AFASTA DE MIM, JAKE!";
                q.opcaoD = "D) EU VOU ABRAÇAR A SUA MÃE!";
                q.opcaoE = "E) O QUE TA ACONTECENDO?";
                q.correta = "D";

                break;

            case 12:
                q.pergunta = "Quantas espadas Finn teve ao longo do seriado?";

                q.opcaoA = "A) 7 espadas";
                q.opcaoB = "B) 9 espadas";
                q.opcaoC = "C) 4 espadas";
                q.opcaoD = "D) 5 espadas";
                q.opcaoE = "E) 2 espadas";
                q.correta = "A";

                break;

            case 13:
                q.pergunta = "Qual a origem do Finn de grama?";

                q.opcaoA = "A) Um mago criou uma cópia de Finn";
                q.opcaoB = "B) Finn de grama é a manifestação de um sonho do verdadeiro Finn";
                q.opcaoC = "C) É o irmão adotivo de Finn e Jake";
                q.opcaoD = "D) Um demonio de grama possuiu a Espada Finn";
                q.opcaoE = "E) Princesa Jujuba o criou para ajudar a proteger OOO";
                q.correta = "D";

                break;

            case 14:
                q.pergunta = "Qual nome Finn, Jake e Homem Banana dão ao carro que encontram?";

                q.opcaoA = "A) Carronaldo Veloncio";
                q.opcaoB = "B) McQueen Katiau";
                q.opcaoC = "C) Ricardo Ricasso";
                q.opcaoD = "D) Melhor Carro de Todos os Tempos";
                q.opcaoE = "E) Daniel Gatão";
                q.correta = "E";

                break;

            case 15:
                q.pergunta = "Qual a cor do cabelo do Finn?";

                q.opcaoA = "A) Preto";
                q.opcaoB = "B) Ruivo";
                q.opcaoC = "C) Loiro";
                q.opcaoD = "D) Castanho";
                q.opcaoE = "E) Roxo";
                q.correta = "C";

                break;

            default:
                System.out.print("Error");
                break;

            
        }

        q.escrevaQuestao();
        q.isCorreta(sc.next());
    }

    public void totalCorretas() {
        double totalCem = q.total/15 * 100;
        System.out.printf("\nVoce acertou um total de %.0f questões!", q.total);
        System.out.printf("\nIsso equivale a %.2f por cento das questões!", totalCem);
    }
}
