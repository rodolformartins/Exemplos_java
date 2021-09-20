public class Principal {
    public static void main(String[] args) {
        Professor joao = new Professor();

        joao.setCpf("747747747-95");
        joao.setNome("Joao");
        joao.setMateria("biologia");
        joao.setSala("123");

        System.out.println(joao.getMateria());
    }
}
