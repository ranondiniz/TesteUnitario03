public class CalculadoraSalarioApp{

 
  public double calcularINSS(double salarioBruto){
      double porcentagemDesconto;
      int faixaSalarial;
      double descontoInss = 0;

    
    if(salarioBruto <= 1320.00){
      porcentagemDesconto = 0.075;
      faixaSalarial = 1;
        
    }else if(salarioBruto <= 2571.29){
      porcentagemDesconto = 0.09;
      faixaSalarial = 2;
        
    }else if(salarioBruto <= 3856.94){
      porcentagemDesconto = 0.12;
      faixaSalarial = 3;
        
    }else{
      porcentagemDesconto = 0.14;
      faixaSalarial = 4;
    }

    if(faixaSalarial == 1){
      descontoInss = salarioBruto * porcentagemDesconto;
    }
    else if(faixaSalarial == 2){
      double sal1 = 99.00;
      double sal2 = (salarioBruto - 1320.00) * porcentagemDesconto;
      descontoInss = sal1 + sal2;
    }
    else if(faixaSalarial == 3){
      double sal1 = 99.00;
      double sal2 = 112.62;
      double sal3 = (salarioBruto - 2571.29) * porcentagemDesconto;
      descontoInss = sal1 + sal2 + sal3;
    }
    else{
      double sal1 = 99.00;
      double sal2 = 112.62;
      double sal3 = 154.28;
      double sal4 = (salarioBruto - 3856.94) * porcentagemDesconto;
      descontoInss = sal1 + sal2 + sal3 + sal4;
    }
    return descontoInss;
    
  }
}