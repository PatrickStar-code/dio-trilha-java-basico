public class Iphone implements ReprodutorMusical, Telefone, Navegador {
    
    // Implementação dos métodos da interface Reprodutor
    @Override
    public void tocar() {
        // Implementação
        System.out.println("Tocando música");
        
    }
    
    @Override
    public void pausar() {
        // Implementação
        System.out.println("Pausando música");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        // Implementação
        System.out.println("Selecionando música: " + musica);
    }
    
    // Implementação dos métodos da interface Telefone
    @Override
    public void ligar(String numero) {
        // Implementação
        System.out.println("Ligando para: " + numero);
    }
    
    @Override
    public void atender() {
        // Implementação
        System.out.println("Atendendo");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        // Implementação
        System.out.println("Iniciando correio de voz");
    }
    
    // Implementação dos métodos da interface Navegador
    @Override
    public void exibirPagina(String url) {
        // Implementação
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        // Implementação
        System.out.println("Adicionando nova aba");
    }
    
    @Override
    public void atualizarPagina() {
        // Implementação
        System.out.println("Atualizando página");
    }
}