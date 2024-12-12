package Pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Pedido> pedidos = new ArrayList<>();
    private static final double PRECO_UNITARIO = 110.00; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Fazer pedido");
            System.out.println("2. Confirmar entrega");
            System.out.println("3. Ver pedidos confirmados");
            System.out.println("4. Ver pedidos entregues");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    fazerPedido(scanner);
                    break;
                case 2:
                    confirmarEntrega(scanner);
                    break;
                case 3:
                    verPedidos("Confirmado");
                    break;
                case 4:
                    verPedidos("Entregue");
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void fazerPedido(Scanner scanner) {
        System.out.print("Informe o endereço de entrega: ");
        String endereco = scanner.nextLine();
        Pedido pedido = new Pedido(endereco);

        System.out.println("\nDados do pedido:");
        System.out.println(pedido);
        System.out.print("\nDeseja alterar o endereço? (s/n): ");
        if ("s".equalsIgnoreCase(scanner.nextLine())) {
            System.out.print("Informe o novo endereço: ");
            pedido.setEnderecoEntrega(scanner.nextLine());
            System.out.println("\nEndereço atualizado:");
            System.out.println(pedido);
        }

        System.out.print("\nInforme a quantidade de botijões desejada: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Informe o número do cartão de crédito: ");
        String numeroCartao = scanner.nextLine();

        pedido.confirmarPedido(quantidade, PRECO_UNITARIO, numeroCartao);

        System.out.println("\nPedido confirmado:");
        System.out.println(pedido);
        pedidos.add(pedido);
    }

    private static void confirmarEntrega(Scanner scanner) {
        System.out.print("Informe o código do pedido para confirmar a entrega: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 
        Pedido pedidoEncontrado = null;
        for (Pedido pedido : pedidos) {
            if (pedido.getCodigo() == codigo) {
                pedidoEncontrado = pedido;
                break;
            }
        }

        if (pedidoEncontrado != null && pedidoEncontrado.isConfirmado()) {
            pedidoEncontrado.confirmarEntrega();
            System.out.println("\nEntrega confirmada:");
            System.out.println(pedidoEncontrado);
        } else {
            System.out.println("Pedido não localizado ou já entregue.");
        }
    }

    private static void verPedidos(String status) {
        System.out.printf("\nPedidos com status '%s':%n", status);
        boolean encontrou = false;

        for (Pedido pedido : pedidos) {
            if ((status.equals("Confirmado") && pedido.isConfirmado()) ||
                (status.equals("Entregue") && pedido.isEntregue())) {
                System.out.println(pedido);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum pedido encontrado.");
        }
    }
}
