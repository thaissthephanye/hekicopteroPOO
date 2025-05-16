public class Helicoptero{
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int pessoas;

    public Helicoptero(int capacidade){
        this.ligado = false;
        this.altitude = 0;
        this.capacidade = capacidade;
        this.pessoas = 0;
    }

    public boolean getLigado(){
        return ligado;
    }
    public int getAltitude(){
        return altitude;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public int getPessoas(){
        return pessoas;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public void setAltitude(int altitude){
        this.altitude = altitude;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public void setPessoas(int pessoas){
        this.pessoas = pessoas;
    }

        public void ligar(){
        if( ligado = false){
            ligado = true;
            System.out.println("O helicoptero esta ligado!\n");
        } else {
            System.out.println("O helicoptero já está ligado!\n");
        }
    }

        public void desligar(){
        if (ligado = true && altitude == 0){
            ligado = false;
            System.out.println("O helicoptero foi desligado\n");
        } else {
            System.out.println("O helicoptero já está desligado\n");
        }
    }

    public void addPessoas(){
        if (pessoas == capacidade){
            System.out.println("O helicoptero esta cheio!\n");
        } else{
            pessoas = pessoas + 1;
            System.out.println("Passageiro entrou no helicoptero com sucesso!\n");
        }
    }

    public void removerPessoas(){
        if( pessoas != 0){
            pessoas = pessoas - 1;
            System.out.println("A pessoa saiu do helicoptero!\n");
        } else {
            System.out.println("Não há pessoas para sair deste helicoptero!\n");
    
        }
    }



    public void decolar(){
        if(ligado = true && altitude == 0){
            altitude = 200;
            System.out.println("O helicoptero decolou\n");
        } else {
            System.out.println("O helicoptero já está no ar ou está desligado\n");
        }
    }

    public void aterrissar(){
        if (ligado = true && altitude > 0){
            altitude = 0;
            System.out.println("O helicoptero aterrissou!\n");
        } else {
            System.out.println("O helicoptero está desligado ou já está no chão\n");
        }
    }



    public String toString(){
        return String.format("******DADOS DO HELICOPTERO******\n [O helicoptero está ligado? %b]\n [Está numa altitude de %d metros]\n [A capacidade do helicoptero é de %d pessoas]\n [Há %d pessoas no helicoptero]\n", ligado, altitude, capacidade, pessoas);
    }
}
