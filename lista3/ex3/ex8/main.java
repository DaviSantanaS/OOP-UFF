public class Ex8 {

    public static void main(String[] args) {
        int tempo = 11;
        
        Celular cell = new Celular(100);
        
        cell.ligacao(150);
        cell.mensagem(15);
        System.out.printf("o celular tem %d de bateria\n", cell.getCarga());
        cell.setCarga(tempo);
        System.out.printf("O celular carregou %d e agora tem %d de bateria\n", tempo, cell.getCarga());
    }
    
}
