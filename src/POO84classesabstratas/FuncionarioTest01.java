package POO84classesabstratas;

import POO84classesabstratas.entities.Funcionario;
import POO84classesabstratas.entities.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        //Funcionario funcionario = new Funcionario("Andre", 4000);
        Gerente gerente = new Gerente("Carlinhos", 7000);
        //System.out.println(funcionario);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlas", 9000);
        System.out.println(desenvolvedor);
    }
}
