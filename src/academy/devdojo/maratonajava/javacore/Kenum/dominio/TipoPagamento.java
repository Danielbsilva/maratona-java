package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO{
        //Sobreescrevendo calcular desconto que esta fora dos valores DEBITO e CREDITO
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    //aqui eu informo que este método não tem nenhum comportamento próprio
    //todos os comportamentos serão decididos pelas pessoas/classes/enumerações
    //que vão sobreescrever eles
    public abstract double calcularDesconto(double valor);
    //usando abstract eu digo que ele em si não existe, o que existe é a implementação do seu método
    //calcularDesconto dentro das enumerações acima (DEBITO e CREDITO) através da sobreescrita

    //metodo abstrato não pode ter corpo, você é obrigado a prover a implementação em outro lugar
    //o que neste caso de enumeracao, criamos o corpo atraves de "debito" e "credito" acima
    //realiando a sobreescrita do metodo
}