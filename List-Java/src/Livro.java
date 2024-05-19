public class Livro {
    //atributos
    private String titulo;

    private String autor;

    private int anoPublicacao;

    public Livro(int anoPublicacao, String autor, String titulo) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", anoPublicacao=").append(anoPublicacao);
        sb.append('}');
        return sb.toString();
    }



}
