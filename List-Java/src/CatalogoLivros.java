
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> livroList;

    
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    
    }
    public void adicionarLivro(int anoPublicacao, String autor, String titulo) {
        livroList.add(new Livro(anoPublicacao, autor, titulo));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarporIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return  livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    } 
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro(2020,"Autor 1", "Titulo 1");
        catalogoLivros.adicionarLivro(2010,"Autor 2", "Titulo 1");
        catalogoLivros.adicionarLivro(2000,"Autor 2", "Titulo 2");
        catalogoLivros.adicionarLivro(2005,"Autor 3", "Titulo 3");
        catalogoLivros.adicionarLivro(2024,"Autor 4", "Titulo 4");

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarporIntervaloAnos(2010, 2020));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Titulo 1"));


    }
}

