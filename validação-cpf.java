public class Main{
	public static void main(String[] args) {
	    String cpf = "712.642.364-09";
	    String n1, n2, n3, n4, n5, n6, n7, n8, n9, confere="";
	    int a1, a2, a3, a4, a5, a6, a7, a8, a9, ver1, ver2;
	    n1 = cpf.substring(0,1); a1 = Integer.parseInt(n1);
	    n2 = cpf.substring(1,2); a2 = Integer.parseInt(n2);
	    n3 = cpf.substring(2,3); a3 = Integer.parseInt(n3);
	    n4 = cpf.substring(4,5); a4 = Integer.parseInt(n4);
	    n5 = cpf.substring(5,6); a5 = Integer.parseInt(n5);
	    n6 = cpf.substring(6,7); a6 = Integer.parseInt(n6);
	    n7 = cpf.substring(8,9); a7 = Integer.parseInt(n7);
	    n8 = cpf.substring(9,10); a8 = Integer.parseInt(n8);
	    n9 = cpf.substring(10,11); a9 = Integer.parseInt(n9);
	    
	        ver1=(a1*10+a2*9+a3*8+a4*7+a5*6+a6*5+a7*4+a8*3+a9*2);
	        
		        if ((ver1%11) <2)
		            ver1=0;
		            
		        else
		            ver1=11-(ver1%11);
		            
		    ver2=(a1*11+a2*10+a3*9+a4*8+a5*7+a6*6+a7*5+a8*4+a9*3+ver1*2);
		    
		        if ((ver2%11) <2)
		            ver2=0;
		        else
		            ver2=11-(ver2%11);
		          
		                confere=(n1+n2+n3+"."+n4+n5+n6+"."+n7+n8+n9+"-"+ver1+""+ver2);
		                    
		                    if (confere.equals(cpf))
		                        System.out.println("CPF válido!");
		                    else
		                        System.out.println("CPF inválido! VERIFIQUE!");
		                
		                    System.out.println(confere);
	}
                    }