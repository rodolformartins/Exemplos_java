import java.util.Scanner;

public class biblioteca {


    //Atributos da classe
    private String livro;
    private int idLivro;


    //Métodos da classe
    public void incluirLivro(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        livro = scan.nextLine();
        setLivro(livro);
        System.out.println("Digite o id do livro: ");
        idLivro = scan.nextInt();
        setIdLivro(idLivro);
    }




    //Métodos getters and setters
    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }
}
