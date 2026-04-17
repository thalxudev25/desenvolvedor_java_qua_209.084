import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa motorista = new Pessoa(null, null, null, null, null);
        Veiculo carro = new Veiculo(null, null, null, null, null, null, motorista);

        // Entrada de dados 
        System.out.println("Informe o nome do motorista: ");
        motorista.setNome(sc.nextLine());
        System.out.println("Informe o CPF do motorista:");
        motorista.setCpf(sc.nextLine());
        System.out.println("Informe o telefone do motorista:");
        motorista.setTelefone(sc.nextLine());
        System.out.println("Informe o email do motorista");
        motorista.setEmail(sc.nextLine());
        System.out.println("Informe o CNH do motorista:");
        motorista.setCnh(sc.nextLine());

        // Entrada de dados 
        System.out.println("Informe a fabricante do carro: ");
        carro.setFabricante(sc.nextLine());
        System.out.println("Informe o modelo do carro");
        carro.setModelo(sc.nextLine());
        System.out.println("informe a cor do carro");
        carro.setAno(sc.nextLine());
        System.out.println("Informe a placa do carro:");
        carro.setPlaca(sc.nextLine());
        System.out.println("Informe o renavam do carro:");
        carro.setRenavam(sc.nextLine());

        carro.setMotorista(motorista);

        System.out.println("Fabricante do carro: " + carro.getFabricante());
        System.out.println("Modelo do carro: " + carro.getModelo());
        System.out.println("Cor do carro: " + carro.getCor());
        System.out.println("Ano do carro: " + carro.getAno());
        System.out.println("Placa do carro: " + carro.getPlaca());
        System.out.println("Renavam do carro: " + carro.getRenavam());
        System.out.println("Nome do Motorista do carro: " + carro.getMotorista().getNome());
        System.out.println("Cpf do Motorista do carro: " + carro.getMotorista().getCpf());
        System.out.println("Telefone do Motorista do carro: " + carro.getMotorista().getTelefone());
        System.out.println("Email do Motorista do carro: " + carro.getMotorista().getEmail());
        System.out.println("Cnh do Motorista do carro: " + carro.getMotorista().getCnh());

        sc.close();

    }
}
