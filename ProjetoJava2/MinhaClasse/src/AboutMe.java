public class AboutMe {
    public static void main(String[] args) {

        String nome = args [0];
        String sobreNome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);


        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos");
        System.err.println("Minha altura é " + altura + "m");

    }
}
