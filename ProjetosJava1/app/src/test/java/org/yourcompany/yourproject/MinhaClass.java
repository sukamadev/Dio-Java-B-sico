package org.yourcompany.yourproject;

public class MinhaClass {
    public static void main (String [] args) {
        String primeiroNome = "Sukama";
        String seegundoNome = "Sarmento";

        String nomeCompleto = nomeCompleto(primeiroNome, seegundoNome);
        System.out.print(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String sugundoNome) {
        return "Resuldado do método: " + primeiroNome.concat(" ").concat(sugundoNome);
    }
}
