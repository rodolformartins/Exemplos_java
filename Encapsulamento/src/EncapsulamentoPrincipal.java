public class EncapsulamentoPrincipal {
    public static void main(String[] args) {

        biblioteca newBiblioteca = new biblioteca();

        newBiblioteca.incluirLivro();

        System.out.println(newBiblioteca.getLivro());
        System.out.println(newBiblioteca.getIdLivro());
    }
}
