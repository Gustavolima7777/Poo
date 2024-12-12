package Pacote;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
    private static int contadorPedidos = 0;
    private int codigo;
    private String enderecoEntrega;
    private LocalDateTime horaCompra;
    private int quantidadeBotijoes;
    private double totalCompra;
    private LocalDateTime horaEntrega;
    private String numeroCartao;
    private String status;

    public Pedido(String enderecoEntrega) {
        this.codigo = ++contadorPedidos;
        this.enderecoEntrega = enderecoEntrega;
        this.horaCompra = LocalDateTime.now();
        this.status = "Novo";
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public void confirmarPedido(int quantidadeBotijoes, double precoUnitario, String numeroCartao) {
        this.quantidadeBotijoes = quantidadeBotijoes;
        this.totalCompra = quantidadeBotijoes * precoUnitario;
        this.horaEntrega = horaCompra.plusHours(6);
        this.numeroCartao = numeroCartao;
        this.status = "Confirmado";
    }

    public void confirmarEntrega() {
        this.status = "Entregue";
    }

    public boolean isConfirmado() {
        return "Confirmado".equals(status);
    }

    public boolean isEntregue() {
        return "Entregue".equals(status);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format(
            "Código: %d%nEndereço: %s%nHora da Compra: %s%nQuantidade: %d%nTotal: R$ %.2f%nHora de Entrega: %s%nStatus: %s",
            codigo,
            enderecoEntrega,
            horaCompra.format(formatter),
            quantidadeBotijoes,
            totalCompra,
            horaEntrega != null ? horaEntrega.format(formatter) : "Não definido",
            status
        );
    }
}