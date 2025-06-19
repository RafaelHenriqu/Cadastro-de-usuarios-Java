import java.util.Scanner;

public class Main {
    static Users Users = new Users();

  public static void main(String[] args){

      Scanner Options = new Scanner(System.in);
      System.out.println("1° Cadastrar novo usuário");
      System.out.println("2° Listar usuários");
      System.out.println("3° Sair");
      String Option = Options.nextLine();
switch (Option){
    case "1":
        Scanner Options2 = new Scanner(System.in);
        System.out.print("Digite o nome:");
        String Name = Options2.nextLine();
        System.out.println("Digite a idade:");
        int Age = Integer.parseInt(Options2.nextLine());
        Users.Add_Users(Name,Age);
        System.out.println("Usuário cadastrado com sucesso!");
        main(new String[]{""});
        break;
    case "2":
        System.out.println("Lista de usuários: \n " + Users.Get_Users()); // Apenas Retorna 1 Usuario (O Ultimo Usuario Adicionado).
        main(new String[]{""});
        break;
    case "3":
        System.out.println("Encerrando...");
        break;
        default:
        System.out.println("Desculpe-nos mas algo falhou!");
        break;

}



  }


}
