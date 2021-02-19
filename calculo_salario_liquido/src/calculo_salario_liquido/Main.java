package calculo_salario_liquido;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		String nome;
		
	    double salarioBruto;
	    double descontoInss = 0;
	    double descontoIRFF = 0;
	    double salarioLiquido;
	    
		System.out.println("Digite seu nome: ");
		nome = sc.next();
	    
		System.out.println("Digite seu salario: ");
        salarioBruto = sc.nextDouble();
	    
	    if (salarioBruto < 1100.00) {
	    	descontoInss = (salarioBruto * 0.075) ;
	    	 System.out.printf("Desconto INSS: %.2f%n", descontoInss);
	    }
	    else if (salarioBruto > 1100.01 && salarioBruto < 2203.45) {
	    	descontoInss = (salarioBruto * 0.09);
	        System.out.printf("Desconto INSS: %.2f%n", descontoInss);
	    }
	    else if (salarioBruto > 2203.49 && salarioBruto < 3305.22) {
			descontoInss = (salarioBruto * 0.12);
		    System.out.printf("Desconto INSS: %.2f%n", descontoInss);
		}
	    else if (salarioBruto > 3305.23 && salarioBruto <= 6433.57) {
			descontoInss = (salarioBruto * 0.14);
		    System.out.printf("Desconto INSS: %.2f%n", descontoInss);
		}
	    	    
	  else if (salarioBruto >= 6433.58 ){
	    	descontoInss = 900.69;
	    	System.out.printf("Desconto INSS: %.2f%n", descontoInss);
		}
	    	
	    salarioLiquido = salarioBruto - descontoInss;
	    
	    if (salarioLiquido > 1903.98 && salarioLiquido < 2826.65) {
	    	descontoIRFF = (salarioLiquido * 0.075 - 142.80);	
	    	System.out.printf("Desconto IRFF: %.2f%n", descontoIRFF);
	    	
	    }
	    else if (salarioLiquido > 2826.66 && salarioLiquido < 3751.05 ) {
	    	descontoIRFF = (salarioLiquido * 0.15 - 354.80);	
	    	System.out.printf("Desconto IRFF: %.2f%n", descontoIRFF );
	    }	
	    else if (salarioBruto > 3751.06 && salarioBruto < 4664.68){
	    	descontoIRFF = (salarioLiquido * 0.225 - 636.13);   	
	    	System.out.printf("Desconto IRFF: %.2f%n", descontoIRFF);
		}
	    else if (salarioBruto > 4664.68) {
	    	descontoIRFF = (salarioLiquido * 0.275 - 869.36);
    	System.out.printf("Desconto IRFF: %.2f%n", descontoIRFF);
	    }
	    else {
	    	System.out.println("Isento"); 
	    }
    
	    System.out.printf(nome +" Seu salario é R$: %.2f%n", salarioLiquido - descontoIRFF);

	
	    sc.close();
	}

}
