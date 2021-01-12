using System;
class HelloWorld {
  static void Main() {
        double capital, juros, montante;
        int tempo, i; //i é um contador.
    
        Console.WriteLine("Este programa visa calcular juros compostos.");
        Console.WriteLine("Digite o capital inicial: ");
        capital = Convert.ToDouble(Console.ReadLine()); // Recebe o valor de capital.
        Console.WriteLine("Digite a taxa de juros em meses: ");
        juros = Convert.ToDouble(Console.ReadLine()); // Recebe o valor de juros.
        Console.WriteLine("Digite a quantidade de meses: ");
        tempo = Convert.ToInt32(Console.ReadLine()); // Recebe o valor de tempo.
        
            juros = juros/100; // Para converter porcentagem em decimal.
            montante = capital * (1+juros); // Calcula o montante do primeiro mês.
            Console.WriteLine("Montante: "+montante+" Juros: "+juros*100+"%"); // Devolve o valor do montante e o valor dos juros convertidos em porcentagem.
            
                    for (i=1;i<tempo;i++) // Laço for que calcula o montante da quantidade de meses informada
                    {
                      montante = montante + (montante * juros); // Calcula o valor do montante.
                      Console.WriteLine("Montante: "+montante+" Juros: "+juros*100+"%"); // Devolve o valor do montante e juros convertidos para porcentagem a cada mês.
                    }
                    
                        juros = montante-capital; // Calcula os juros total.
                        Console.WriteLine("Montante total: "+montante+" Juros total: "+juros); // Devolve o valor total do montante e dos juros.
                
            
  }
}