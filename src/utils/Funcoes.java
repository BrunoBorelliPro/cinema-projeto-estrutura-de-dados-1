public class Funcoes(){

    public Funcoes(){}

    public int verificaSeFilmeExiste(Filme[] filmes, String nomeDoFilme){
        int contadorFilmes = 0;
        for (int i=0; i < filmes.length; i++){                      
            if(filmes[i].getTitulo().contains(nomeDoFilme)){
                    exibeInformacoesFilme(filmes[i]);
                    contadorFilmes++;
            }
        }
        return contadorFilmes;
    }

    public void exibeInformacoesFilme(Filme filme){
        System.out.println(filme.getCodigo() + " - " + filme.getTitulo());
    }

    public void verificaSessoes(ArrayList<Sessao> sessoes, int codigoDoFilme){
        if (codigoDoFilme <=3 && codigoDoFilme >= 0){
			sessoes.forEach((sessao)->{
				if(sessao.getFilme().getCodigo() == codigoDoFilme){
                    System.out.println("---------------------------------------");
					System.out.println("SESSÃO " + sessao.getCodigo() );
					System.out.println("Sala: " + sessao.getSala().getCodigo() + " Horário: " + sessao.getHorario());                                  							
                }
			});
		}
    }

    public void verificaSalas(Sessao)
}
