import java.util.Scanner;

public class atividades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            //Sistema onde o usuário fará o cadastro dos seus dados.
        System.out.print("Digite sua idade: ");
                int idade = sc.nextInt();
        System.out.print("Digite o dia da semana: ");
                String dia = sc.next();

             //If com as denominações de cada idade
        if (idade <12){
            System.out.println("Você é criança.");
        } else if (idade >=12 && idade <18){
            System.out.println("Você é adolescente.");
        }else{
            System.out.println("Você é adulto.");
        }

            //sugestões de atividades(coloquei tolowercase caso a letra seja maiscula ou minuscula)
        switch (dia.toLowerCase()){
            case "domingo":
                System.out.println("Ir ao parque.");
                break;
            case "segunda":
                System.out.println("Estudar programação.");
                break;
            case "terca":
                System.out.println("Praticar esporte.");
                break;
            case "quarta":
                System.out.println("Ler um livro.");
                break;
            case "quinta":
                System.out.println("Assistir a um filme.");
                break;
            case "sexta":
                System.out.println("Encontrar amigos.");
                break;
            case "sabado":
                System.out.println("Fazer uma viagem curta.");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        sc.close();

    }
}
