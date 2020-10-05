package ac1;

public class ContaCorrente {
    private int numConta;
    private float saldo;
    private float limiteEspecial;
    private String NomeCli;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean setSaldo(float saldo) {
        if(saldo >= limiteEspecial){
            this.saldo = saldo;
            return true;
        }
        else{
            return false;
        }
            
    }

    public void setDeposito(float saldo) {
            
            this.saldo = this.saldo + saldo;
            
    }

    public boolean setSaque(float saldo) {
        if( (this.saldo - saldo) < ((limiteEspecial) * -1)){
            return false;
        }
        else{
            this.saldo = this.saldo - saldo;
            return true;

        }
 
        
}

    public float getLimiteEspecial() {
        return limiteEspecial;
    }

    public boolean setLimiteEspecial(float limiteEspecial) {
        if(limiteEspecial >= 0){
            this.limiteEspecial = limiteEspecial;
            return true;
        }
        else{
            return false;
        }
        
    }

    public String getNomeCli() {
        return NomeCli;
    }

    public void setNomeCli(String nomeCli) {
        NomeCli = nomeCli;
    }


    @Override
    public String toString() {
        return "ContaCorrente [NomeCli=" + NomeCli + ", limiteEspecial=" + limiteEspecial + ", numConta=" + numConta
                + ", saldo=" + saldo + "]";
    }

   

}
