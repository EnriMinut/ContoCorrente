package org.example;

public class ContoBancario {

    public double saldo = 1200;


    public double preleva(double valor) throws SaldoInsufficienteException{

        if(this.saldo <valor){
            throw new SaldoInsufficienteException("Saldo insufficiente");
        }
        else if (valor <= 0){
            throw new ImportoNonValioException("Importo Invalido");
        }
        else{
            return this.saldo-valor;
        }
    }

}
