public enum Operacoes {
    
    SOMAR("+"){
        public double execultarOperacao(double x, double y){
            return x + y;
        }
    }, SUBTRAIR("-"){
        public double execultarOperacao(double x, double y){
            return x - y;
        }
    }, MULTIPLICAR("*"){
        public double execultarOperacao(double x, double y){
            return x * y;
        }
    }, DIVIDIR("/"){
        public double execultarOperacao(double x, double y){
            return x / y;
        }
    };

    private String simbolos;

    Operacoes(String simbolos){
        this.simbolos =simbolos;
    }

    public String toString(){
        return simbolos;
    }

    public abstract double execultarOperacao(double x, double y);

    public String getSimbolos(){
        return simbolos;
    }
}
