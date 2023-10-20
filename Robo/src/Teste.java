public class Teste {
    public static void main(String[] args) throws Exception {
        comportamento normal = new comportamentoNormal();
        comportamento raivoso = new comportamentoAgressivo();
        comportamento hilario = new comportamentoEngraçado();

        robo Robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(raivoso);
        robo.mover();
        robo.mover();
        robo.setComportamento(hilario);
        robo.mover();
        robo.mover();
    }
}
