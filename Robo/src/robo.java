public class robo {

    private comportamento Comportamento;

    public comportamento getComportamento() {
        return Comportamento;
    }

    public void setComportamento(comportamento comportamento) {
        Comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }

    
}
