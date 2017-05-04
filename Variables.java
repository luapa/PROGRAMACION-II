package fundamentos;

//Variables o metodos de clases son static
//Variables o metodos de instancia no son static
//Para acceder a un metodo o variable static es: NombreClase.Metodo
//o Nombre Clase.Variable

class CuentaBancaria{
    public int saldo;
    public static int numero=0;
}

public class Variables{
    public static void sumarSaldo(CuentaBancaria cta){
        cta.saldo +=100;
    }
    public static void sumarSaldo(int saldo){
        saldo +=100;
    }
 //Crear minimo 10 objetos Cuenta Bancaria y
 //probar probar probar............probar
    public static void main(String[] args) {
        
       CuentaBancaria ct1=new CuentaBancaria();
       CuentaBancaria ct2 = ct1;
        
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
       ct1.saldo =5000;
       sumarSaldo(ct1);
       sumarSaldo(ct2); 
       System.out.println("Saldo Cuenta #1:    "+ct1.saldo);//imprime 5200
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       System.out.println("Saldo Cuenta #2:    "+ct2.saldo);//imprime 5200
       
      
       
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
       CuentaBancaria ct3=new CuentaBancaria();
       ct3.saldo =3000;
       sumarSaldo(ct3);
       System.out.println("Saldo Cuenta #3:    "+ct3.saldo);//imprime 3100
       
       
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       CuentaBancaria ct4=new CuentaBancaria();
       ct4.saldo =ct1.saldo + ct2.saldo + ct3.saldo;
       sumarSaldo(ct4);
       System.out.println("Saldo Cuenta #4:    "+ct4.saldo);//imprime 13600
      
       
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
       CuentaBancaria ct5=new CuentaBancaria();
       ct5.saldo =ct1.saldo + ct2.saldo - ct3.saldo + ct4.saldo;
       sumarSaldo(ct5);
       System.out.println("Saldo Cuenta #5:    "+ct5.saldo);//imprime 21000
       
     
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
       CuentaBancaria ct6=new CuentaBancaria();
       ct6.saldo =ct1.saldo + ct2.saldo + ct3.saldo + ct4.saldo + ct5.saldo;
       sumarSaldo(ct6);
       System.out.println("Saldo Cuenta #6:    "+ct6.saldo);//imprime 48200
       
       
    
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
       CuentaBancaria ct7=new CuentaBancaria();
       ct7.saldo =ct1.saldo + ct2.saldo + ct3.saldo + ct4.saldo + ct5.saldo + ct6.saldo;
       sumarSaldo(ct7);
       System.out.println("Saldo Cuenta #7:    "+ct7.saldo);//imprime 96400
       
       
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
       CuentaBancaria ct8=new CuentaBancaria();
       ct8.saldo =ct1.saldo + ct2.saldo + ct3.saldo + ct4.saldo - ct5.saldo - ct6.saldo + ct7.saldo;
       sumarSaldo(ct8);
       System.out.println("Saldo Cuenta #8:    "+ct8.saldo);//imprime 54400
       
    
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
       CuentaBancaria ct9=new CuentaBancaria();
       ct9.saldo =ct1.saldo + ct2.saldo + ct3.saldo + ct4.saldo - ct5.saldo - ct6.saldo - ct7.saldo + ct8.saldo;
       sumarSaldo(ct9);
       System.out.println("Saldo Cuenta #9:    "+ct9.saldo);//imprime -84000
       
     
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
       CuentaBancaria ct10=new CuentaBancaria();
       ct10.saldo =ct1.saldo + ct2.saldo + ct3.saldo + ct4.saldo + ct5.saldo - ct6.saldo + ct7.saldo + ct8.saldo - ct9.saldo ;
       sumarSaldo(ct10);
       System.out.println("Saldo Cuenta 10:    "+ct10.saldo);//imprime 234800
       
       System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
    }
    
}
