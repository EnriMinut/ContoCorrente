import org.example.ContoBancario;
import org.example.SaldoInsufficienteException;



void main(){

    ContoBancario cb = new ContoBancario();
    Scanner sc = new Scanner(System.in);
    int valor = sc.nextInt();

    try{
        cb.preleva(valor);
    }catch(SaldoInsufficienteException e){
        IO.println(e.getMessage());
    }

    finally{
        if(valor <= cb.saldo){
            IO.println("Buonfine");
        }
        IO.println(cb.saldo - valor);
    }

}
