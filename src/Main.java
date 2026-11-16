import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Dados da clínica
        int horarioAbertura = 8;
        int horarioFechamento = 18;
        int duracaoConsulta = 30;

        // Cálculo da capacidade diária
        int minutosFuncionamento = (horarioFechamento - horarioAbertura) * 60;
        int consultasPorDia = minutosFuncionamento / duracaoConsulta;

        // Controle do sistema
        int opcao = 0;

        System.out.println("================================");
        System.out.println("       SISTEMA VIDAPET");
        System.out.println("================================");

        while (opcao != 4) {

            System.out.println("\n========== MENU PRINCIPAL ==========");
            System.out.println("1 - Horário de funcionamento");
            System.out.println("2 - Capacidade diária");
            System.out.println("3 - Verificar se a clínica está aberta");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nHorário de abertura: " + horarioAbertura + "h");
                    System.out.println("Horário de fechamento: " + horarioFechamento + "h");
                    break;

                case 2:
                    System.out.println("\nDuração da consulta: " + duracaoConsulta + " minutos");
                    System.out.println("Capacidade diária: " + consultasPorDia + " consultas");
                    break;

                case 3:
                    System.out.print("\nDigite o horário atual (0 a 23): ");
                    int horarioAtual = entrada.nextInt();

                    if (horarioAtual >= horarioAbertura && horarioAtual < horarioFechamento) {
                        System.out.println("Clínica aberta!");
                    } else if (horarioAtual >= 0 && horarioAtual <= 23) {
                        System.out.println("Clínica fechada!");
                    } else {
                        System.out.println("Horário inválido!");
                    }
                    break;

                case 4:
                    System.out.println("\nEncerrando o Sistema VidaPet...");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        }

        entrada.close();
    }
}

