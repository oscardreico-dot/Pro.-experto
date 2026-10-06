
package animal2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Animal2 {

  
    public static void main(String[] args)
    {
       Scanner sn = new Scanner(System.in);
       int opcion = 0;
       String menu="";
       String Animal = "acuaticos";
       String Animal1 = "aereos";
       String Animal2 = "terrestres";
       String Animal3 = "semiacuaticos";
       String Animal4= "carnivoros";
       String Animal5 = "vertebrados";
       String Animal6= "oviparos";
       String Animal7 = "grupo";
       String Animal8 = "invertebrados";
       String Animal9 = "manada";
       String Animal10 = "inteligentes";       
       String input; 
       do
        {
        menu="selecccione una opcion de 1 a 3\n";
        menu+="1. Animales segun su caracteristica\n";
        menu+="2. Desea cconocer mas de un Animal\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            input=JOptionPane.showInputDialog(null,"escriba la caracteristica del animal que busca\n "+"acuaticos, "+"aereos,"+"terrestres,"+
                                          "semiacuaticos, "+"carnivoros, "+"vertebrados, "+"oviparos, "+"grupo, "+"invertebrados,"+"manada, "+"inteligentes");
        
             
            while (true) 
            {
                String carac = input;
                if(carac.equals(Animal7))
                {
                   caracteristica animal7 =new caracteristica();
                   animal7.datosanimal7();
                   break;
                } 
                else 
                if(carac.equals(Animal))
                {
                   caracteristica animal =new caracteristica();
                   animal.datosanimal();
                   break;
                }
                else 
                if(carac.equals(Animal1))
                {
                   caracteristica animal1 =new caracteristica();
                   animal1.datosanimal1();
                   break;
                }
                else 
                if(carac.equals(Animal2))
                {
                   caracteristica animal2 =new caracteristica();
                   animal2.datosanimal2();
                   break;
                }
                else 
                if(carac.equals(Animal3))
                {
                   caracteristica animal3 =new caracteristica();
                   animal3.datosanimal3();

                break;
                }
                else 
                if(carac.equals(Animal4))
                {
                   caracteristica animal4 =new caracteristica();
                   animal4.datosanimal4();

                break;
                }
                else 
                if(carac.equals(Animal5))
                {
                   caracteristica animal5 =new caracteristica();
                   animal5.datosanimal5();                 
                   break;
                }
                else 
                if(carac.equals(Animal6))
                {
                   caracteristica animal6 =new caracteristica();
                   animal6.datosanimal6();                  
                   break;
                }
                else 
                if(carac.equals(Animal8))
                {
                    caracteristica animal8 =new caracteristica();
                   animal8.datosanimal8();

                break;
                }
                else 
                if(carac.equals(Animal9))
                {
                   caracteristica animal9 =new caracteristica();
                   animal9.datosanimal9();                 
                   break;
                }
                else 
                if(carac.equals(Animal10))
                {
                   caracteristica animal10 =new caracteristica();
                   animal10.datosanimal10();                
                   break;
                }
                else
                {
                   JOptionPane.showMessageDialog(null,"Intentalo de nuevo!");
                   break;                
                }
            }          
            break;
            case 2:
            do
            {
                menu="selecccione una opgion de 1 a 7\n";
                menu+="1. Leon\n";
                menu+="2. Ballenas\n";
                menu+="3. Ornitorrinco\n";
                menu+="4. Hombre\n";
                menu+="5. Delfin\n";
                menu+="6. Aguila\n";
                menu+="7. cuervo\n";
                menu+="8. salir\n";
                opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (opcion)
                {
                    case 1:
                    caracteristica leon =new caracteristica();
                    leon.datosleon();
                    break;
                    case 2:
                    caracteristica ballenas =new caracteristica();
                    ballenas.datosballena();
                    break;
                    case 3:
                    caracteristica ornitorrinco =new caracteristica();
                    ornitorrinco.datosornitorinco();
                    break;
                    case 4:
                    caracteristica hombre =new caracteristica();
                    hombre.datoshombre();
                    break;
                    case 5: 
                    caracteristica delfin =new caracteristica();
                    delfin.datosdelfin();
                    break;
                    case 6:
                    caracteristica aguila =new caracteristica();
                    aguila.datosaguila();
                    break;
                    case 7:
                    caracteristica cuervo =new caracteristica();
                    cuervo.datoscuervo();
                    break;
                }

                } while(opcion!=8); 
            }
        
        } while(opcion!=3);
       
    }
    
    
}
