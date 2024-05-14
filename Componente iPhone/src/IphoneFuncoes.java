public class IphoneFuncoes implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    public void exibirPagina() {
        System.out.println("Página eibida.");
    }
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada.");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }
    @Override
    public void atender() {
        System.out.println("Atendeu.");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }
    @Override
    public void tocar() {
        System.out.println("Música Tocando.");
    }
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    @Override
    public void selecionarmusica() {
        System.out.println("Música selecionada.");
    }
    
}
