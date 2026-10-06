
package animal2;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

class caracteristica
{
    Scanner sn = new Scanner(System.in);
    int opcion = 0;
    String menu="";
    public caracteristica(){}
    @SuppressWarnings("empty-statement")
    public void datosleon()
    {
        JOptionPane.showMessageDialog(null," El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                           "Nombre científico: Panthera leo\n" +
                           "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                           "Familia: Felidae\n" +
                           "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                           "Clase: Mammalia\n" +
                           "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                           "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)");
        do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null," La forma en que el león realiza la caza resulta diferente a la de otros felinos.\n"
                    +"Cazan en grupo, en lugar de hacerlo solos. Son capaces de crear planes estratégicos y rodear a sus presas, \n"+
                    "esto aumenta las posibilidades de éxito de la cacería, también les permite derribar presas muy grandes. \n"+
                    "Puesto que son muchos para alimentar, tiene sentido para conseguir una presa con bastante carne.\n"+
                    "Las presas más grandes del león incluyen ñus, cebras, impalas, búfalos y ciervos, estas presas a menudo dependen del hábitat donde residan.\n"+
                    "De vez en cuando buscará una jirafa, pero esto puede ser una prueba muy peligrosa. \n"+
                    "El león se centrará en las presas jóvenes, débiles, y mayores, con las que pueden acabar sin demasiado riesgo de resultar heridos en el proceso. \n"+
                    "El tamaño de la presa puede variar desde 420 libras a 1.200 libras.\n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Los leones se comunican de varias formas, por rugidos, olor y lenguaje corporal.\n"+
                    "Los rugidos pueden ser suaves o tan fuertes que se escuchan a kilómetros de distancia, los cuales usan para proteger a su manada o su territorio.\n");
            break;
            }
        
        } while(opcion!=3);
        
    }
    
    public void datosballena()
    {
        JOptionPane.showMessageDialog(null,"Los balénidos son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                            "Nombre científico: Balaenidae\n" +
                            "Promedio de vida: Eubalaena japonica: 70 años\n" +
                            "Familia: Balaenidae; Gray, 1825?\n" +
                            "Clase: Mammalia\n" +
                            "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                            "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                            "Masa Corporal: Ballena franca austral: 23,000 kg");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Las ballenas son grandes mamíferos, por lo que no es de extrañar que consuman grandes \n"+
                    "cantidades de comida cada día, son muy buenos depredadores y encuentran lo que necesitan para sobrevivir en las aguas donde viven.  \n"+
                    "Básicamente, comen cualquier cosa que puedan encontrar para su supervivencia. Algunos tipos de ballenas tienen estómagos muy grandes y pueden comer todos los días, por  \n"+
                    "ejemplo, la ballena azul puede almacenar hasta 2,200 libras de alimentos en su estómago antes de llenarse. \n"+
                    "Los predadores más agresivos son las ballenas dentadas y comen peces más grandes que sus \n"+
                    "primas las ballenas barbadas, algunas ballenas dentadas de mayor tamaño se alimentan también  \n"+
                    "de lobos marinos y otros grandes animales en las aguas, tal vez te sorprenda saber que incluso osos polares se han encontrado consumidos por ballenas.\n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Se cree que las ballenas utilizan el sonido para la eco-localización, un tipo de sonar, \n"+
                    "que les permite a las ballenas localizar peligros y otros animales  microscópicos si el suministro de alimentos es escaso. \n"+
                    "Una ballena produce un sonido que envía a través del agua y rebota en objetos o animales. \n"+
                    "Las ballenas tienen una capacidad especial para obtener información sobre la forma y la distancia del objeto con que el sonido chocó.\n"+
                    "Existen varias vocalizaciones o sonidos producidos por las ballenas, y cada uno, se cree, tenga un propósito diferente, incluyendo aquellos que se usan para la comunicación y la socialización. \n");
            break;
            }
        
        } while(opcion!=3);
    }
   public void datosornitorinco()
    {
        JOptionPane.showMessageDialog(null,"El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                            "Nombre científico: Ornithorhynchus anatinus\n" +
                            "Orden: Monotremata\n" +
                            "Clase: Mammalia\n" +
                            "Número de huevos: 1 – 3\n" +
                            "Periodo de gestación: 10 – 14 días\n" +
                            "Promedio de vida: 17 años (En cautiverio)");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Al salir de sus madrigueras, el ornitorrinco pasa la mayor parte de las horas de la tarde y noche en  \n"+
                    "el forrajeo de aguas poco profundas en busca de los invertebrados que habitan el fondo.\n"+
                    "Su dieta consiste principalmente de crustáceos, gusanos, camarones, moluscos, anélidos,  \n"+
                    "cangrejos, libélulas, mejillones, huevos de trucha, renacuajos y larvas de insectos.  \n"+
                    "De hecho, los ornitorrincos pueden consumir la totalidad de su peso corporal en alimentos en un  período de 24 horas.\n"+
                    "Durante 20 a 40 segundos por vez, los ornitorrincos buscan sus alimentos por medio del buceo a la  \n"+
                    "parte inferior de la corriente, con sus patas palmeadas y sondean el fondo fangoso con su sensible pico. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Bajo el agua, mantienen sus ojos cerrados y utilizan un sistema electro-receptor de sus picos para \n"+
                    "encontrar comida, mediante el moviendo de su cabeza de lado a lado. \n"+
                    "Pueden detectar el movimiento de la cola de un camarón a 10 centímetros de distancia. \n");
            break;
            }
        
        } while(opcion!=3);
        
    }
    public void datoshombre()
    {
        JOptionPane.showMessageDialog(null,"Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                            "Promedio de vida: 79 años\n" +
                            "Orden: Primates\n" +
                            "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                            "Clase: Mammalia\n" +
                            "Familia: Hominidae\n" +
                            "Reino: Animalia\n" +
                            "Filo: Chordata; Craniata");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"La comida es más que combustible para tu cuerpo; y es que la dieta puede ayudarte a combatir enfermedades y, además, a lucir más joven.\n "+
                    "Una alimentación saludable para los hombres debe incluir vitaminas, minerales y fibra. \n"+
                    "Para conseguir estos nutrientes es importante que comas al menos dos tazas de frutas y dos y media tazas de verduras al día. \n"+
                    "Asimismo, debes comer cereales enteros, remplaza los granos refinados por integrales en el pan, la pasta y el arroz, por ejemplo. \n"+
                    "Es fundamental que comas dos o tres porciones de pescado por semana. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"La comunicación humana es el campo dedicado a entender cómo se comunican los seres \n"+
                    "humanos, ya que el ser humano se comunica para transmitir información, manifestar \n"+
                    "sentimientos, influir en los demás y realizar acciones específicas. \n"+
                    "La comunicación humana refuerza las relaciones sociales, enriquece a sus participantes y es el  \n"+
                    "principal agente del desarrollo cultural.1 Su instrumento fundamental es el lenguaje verbal, pero \n"+
                    "las personas se comunican también por medio de gestos, movimientos, miradas, etc. \n");
            break;
            }
        
        } while(opcion!=3);
    }
    public void datosdelfin()
    {
        JOptionPane.showMessageDialog(null,"Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                            "Nombre científico: Delphinidae\n" +
                            "Familia: Delphinidae; Gray, 1821\n" +
                            "Velocidad: Delphinus delphis: 60 km/h\n" +
                            "Promedio de vida: Orca: 29 años, MÁS\n" +
                            "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                            "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                            "Periodo de gestación: Orca: 15 – 18 meses,");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Los delfines se alimentan principalmente de peces, en realidad no son cazadores, sino más bien \n "+
                    "parecen estar contentos con la especie más abundante y disponible para ellos. \n"+
                    "En consecuencia, la dieta en su hábitat natural suele depender de la zona en la que estén viviendo, así como la época del año. \n"+
                    "Regularmente se alimentan con especies de peces, calamares y pulpos. \n"+
                    "Se tragan su comida entera, sin masticar, utilizan los músculos en la parte posterior de la lengua y  \n"+
                    "la garganta para expulsar  el agua salada y enviar los peces hacia adentro. \n"+
                    "Los adultos pueden comer peces que pesen hasta 5 kilogramos, los delfines más jóvenes tienden a quedarse con los peces más pequeños. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Los delfines son como un niño que no se calla, hacen constantemente sonidos de comunicación o de navegación. \n"+
                    "Dichos sonidos se realizan de diferentes maneras.\n"+
                    "Los sonidos de ecolocalización se producen en las fosas nasales justo por debajo de sus orificios  \n"+
                    "nasales, y se denominan clics. Se producen a veces en una sucesión tan rápida que suenan como zumbidos.  \n"+
                    "Estos sonidos se producen justo detrás del ¨mellon¨, un aceite, un poco fuera del centro de la masa que podríamos llamar la frente del delfín. \n"+
                    "Los delfines se comunican como la mayoría de otros animales, sus chillidos y silbidos comunican  \n"+
                    "estados emocionales y a menudo, la presencia del peligro y la comida en la zona.  \n");
            break;
            }
        
        } while(opcion!=3);
    }
    
    public void datosaguila()
    {
        JOptionPane.showMessageDialog(null,"Águila es el nombre dado a las mayores aves depredadoras. Las diversas especies y subespecies de águilas pueden encontrarse en casi cualquier parte del mundo excepto en la Antártida. Son miembros de las aves de presa, del orden de Accipitriformes, ?, ? familia Accipitridae, subfamilia Buteoninae. \n" +
                            "Velocidad: Águila calva: 120 – 160 km/h\n" +
                            "Promedio de vida: Águila calva: 20 años, Stephanoaetus coronatus: 14 años\n" +
                            "Longitud: Águila real: 66 – 100 cm, Águila harpía: 99 cm, \n" +
                            "Longitud de las alas: Águila calva: 1.8 – 2.3 m, MÁS\n" +
                            "Masa Corporal: Águila calva: 3 – 6.3 kg, Águila real: 3 – 7 kg \n" +
                            "Número de huevos: 1 – 3 Huevos");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Estas aves rapaces se alimentan principalmente de peces, como salmón y la trucha. En invierno, prefieren consumir carroña.\n "+
                    "Las águilas calvas son capaces de devorar cadáveres de grandes mamíferos como las ballenas. \n"+
                    "Estos tipos de águilas también se alimentan de los vertederos de basura. \n"+
                    "Otros águilas calvas dieta incluye mapaches, castores, liebres, ratones almizcleros, conejos, lagartos y ciervos. \n"+
                    "Las águilas moneras, al igual que otras rapaces, se alimentan de zorros voladores, lagartijas, serpientes, lémures voladores, lagartos, lechuzas y perros. \n"+
                    "Las águilas de cola blanca también son muy oportunistas y se alimentan principalmente de peces, mamíferos y aves. \n"+
                    "Entre otros alimentos del águila se incluyen ratones, zorros, antílopes, cabras, ciervos y ovejas. y algunas águilas se comen a las crías de otras especies de águilas. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"La mayoría de las vocalizaciones se producen durante la época reproductora, normalmente dentro \n"+
                    "o cerca de los territorios de nidificación. Fuera de la estación reproductora son más bien escasas.\n"+
                    "Se han identificado hasta ocho sonidos diferentes durante la reproducción gritos de alarma, emitidos tanto por el macho como la hembra. \n"+
                    "Los gritos de alarma suelen tener diversas funciones, entre ellas las de atraer a la pareja, marcar el  \n"+
                    "territorio y avisar de peligros. Existen ligeras variaciones entre el macho y la hembra, tanto de  \n"+
                    "intensidad como de longitud, debido probablemente al mayor tamaño de las hembras. \n");
            break;
            }
        
        } while(opcion!=3);
    }
    public void datoscuervo()
    {
        JOptionPane.showMessageDialog(null,"El cuervo grande, ? anteriormente denominado cuervo común por la SEO? es una especie de ave paseriforme de la familia Corvidae. Presente en todo el hemisferio septentrional, es la especie de córvido con la mayor superficie de distribución.\n" +
                            "Nombre científico: Corvus corax\n" +
                            "Promedio de vida: 10 – 15 años (En libertad)\n" +
                            "Longitud: 56 – 78 cm (Adulto)\n" +
                            "Familia: Corvidae\n" +
                            "Masa Corporal: 0.69 – 2 kg (Adulto)\n" +
                            "Longitud de las alas: 100 – 150 cm (Adulto");
         do
        {
        menu="Desea conocer otras caracterisricas elija una opcion de 1 a 3\n";
        menu+="1. Alimentacion\n";
        menu+="2. Comunicacion\n";
        menu+="3. salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
            case 1:
            JOptionPane.showMessageDialog(null,"Esta es un ave omnivora que se alimenta casi de cualquier cosa que consiga, su alimentación se \n "+
                    "basa dependiendo del lugar donde este y la época del año. Son capaces de sobrevivir con bajos \n"+
                    "recursos alimenticios, estas aves comen desde hortalizas y frutas hasta carroña y desperdicios de  \n"+
                    "comida desechados por los seres humanos, entre lo que esta ave consume están los siguientes  \n"+
                    "alimentos; maíz, frutos secos, semillas, manzanas, higos, avellanas, hayucos, nueces, ingiere  \n"+
                    "mamíferos como  ratas, ratones, arañas, lagartijas, pájaros, conejos etc, y si esta cerca de alguna  \n"+
                    "playa comerá pescado, moluscos o  crustáceos. \n");
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"Es un ave inteligente capaz de copiar hasta la voz humana, generalmente posee un grito que lo\n"+
                    "caracteriza y suena algo así como crascitar un poco profundo rrok-rrok este entre los más \n"+
                    "comunes y que lo diferencian de otras especies. Entre sus sonidos también encontramos un toc- \n"+
                    "toc-toc, un kraa que siempre son emitidos de una forma ronca, produce graznidos de manera  \n"+
                    "gutural y muchas veces t Esta ave esta dotada de grandes cualidades y como tal tiene la capacidad  \n"+
                    "de imitar los sonidos tanto de la naturaleza como la del ser humano. Posee grandes habilidades  \n"+
                    "con su voz y tiene un gran repertorio de vocalizaciones dentro de las que destacan los gritos que  \n"+
                    "emite en forma de alarma, de vuelo y los de persecución.ambién tiene sonidos de naturaleza musical. \n");
            break;
            }
        
        } while(opcion!=3);      
    } 
    public void datosanimal()
    {
    JOptionPane.showMessageDialog(null,"Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                 "Nombre científico: Balaenidae\n" +
                                 "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                 "Familia: Balaenidae; Gray, 1825?\n" +
                                 "Clase: Mammalia\n" +
                                 "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                 "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                 "Masa Corporal: Ballena franca austral: 23,000 kg\n"+"\n"+ 
                                 "Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                                 "Nombre científico: Delphinidae\n" +
                                 "Familia: Delphinidae; Gray, 1821\n" +
                                 "Velocidad: Delphinus delphis: 60 km/h\n" +
                                 "Promedio de vida: Orca: 29 años, MÁS\n" +
                                 "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                                 "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                                 "Periodo de gestación: Orca: 15 – 18 meses,\n"+"\n"+ 
                                 "El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                                 "Nombre científico: Ornithorhynchus anatinus\n" +
                                 "Orden: Monotremata\n" +
                                 "Clase: Mammalia\n" +
                                 "Número de huevos: 1 – 3\n" +
                                 "Periodo de gestación: 10 – 14 días\n" +
                                 "Promedio de vida: 17 años (En cautiverio)\n");   
    }
    public void datosanimal1()
    {
      JOptionPane.showMessageDialog(null, "Águila es el nombre dado a las mayores aves depredadoras. Las diversas especies y subespecies de águilas pueden encontrarse en casi cualquier parte del mundo excepto en la Antártida. Son miembros de las aves de presa, del orden de Accipitriformes, ?, ? familia Accipitridae, subfamilia Buteoninae. \n" +
                                 "Velocidad: Águila calva: 120 – 160 km/h\n" +
                                 "Promedio de vida: Águila calva: 20 años, Stephanoaetus coronatus: 14 años\n" +
                                 "Longitud: Águila real: 66 – 100 cm, Águila harpía: 99 cm, \n" +
                                 "Longitud de las alas: Águila calva: 1.8 – 2.3 m, MÁS\n" +
                                 "Masa Corporal: Águila calva: 3 – 6.3 kg, Águila real: 3 – 7 kg \n" +
                                 "Número de huevos: 1 – 3 Huevos"+"\n"+ 
                                 "El cuervo grande, ? anteriormente denominado cuervo común por la SEO? es una especie de ave paseriforme de la familia Corvidae. Presente en todo el hemisferio septentrional, es la especie de córvido con la mayor superficie de distribución.\n" +
                                 "Nombre científico: Corvus corax\n" +
                                 "Promedio de vida: 10 – 15 años (En libertad)\n" +
                                 "Longitud: 56 – 78 cm (Adulto)\n" +
                                 "Familia: Corvidae\n" +
                                 "Masa Corporal: 0.69 – 2 kg (Adulto)\n" +
                                 "Longitud de las alas: 100 – 150 cm (Adulto\n");   
    }
     public void datosanimal2()
    {
      JOptionPane.showMessageDialog(null," El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+ 
                                "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                "Promedio de vida: 79 años\n" +
                                "Orden: Primates\n" +
                                "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                "Clase: Mammalia\n" +
                                "Familia: Hominidae\n" +
                                "Reino: Animalia\n" +
                                "Filo: Chordata; Craniata\n");   
   }
    public void datosanimal3()
    {
    JOptionPane.showMessageDialog(null,"El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                                 "Nombre científico: Ornithorhynchus anatinus\n" +
                                 "Orden: Monotremata\n" +
                                 "Clase: Mammalia\n" +
                                 "Número de huevos: 1 – 3\n" +
                                 "Periodo de gestación: 10 – 14 días\n" +
                                 "Promedio de vida: 17 años (En cautiverio)\n");    
    }
    public void datosanimal4()
    {
     JOptionPane.showMessageDialog(null, "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                "Promedio de vida: 79 años\n" +
                                "Orden: Primates\n" +
                                "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                "Clase: Mammalia\n" +
                                "Familia: Hominidae\n" +
                                "Reino: Animalia\n" +
                                "Filo: Chordata; Craniata\n"+"\n"+ 
                                " El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+ 
                                "Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                "Nombre científico: Balaenidae\n" +
                                "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                "Familia: Balaenidae; Gray, 1825?\n" +
                                "Clase: Mammalia\n" +
                                "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                "Masa Corporal: Ballena franca austral: 23,000 kg\n");    
    }
    public void datosanimal5()
    {
       do
        {
        menu="selecccione una opcion de 1 a 4\n";
        menu+="1. Mamiferos\n";
        menu+="2. Aves\n";
        menu+="3. Reptiles\n";
        menu+="4. Salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
             case 1:
                  Scanner sn = new Scanner(System.in);
                  boolean salir = false;
                  int opcionmf = 0;
                  String menumf="";
                  while(!salir){
                  
                    menumf="Sobre cual Mamifero Desea Informacion\n";
                    menumf+="1. Hombre\n";
                    menumf+="2. Leon\n";
                    menumf+="3. Ballena\n";
                    menumf+="4. Delfin\n";
                    menumf+="5. Ornitorrinco\n";
                    menumf+="6. Salir\n";
                   
                  try
                  {
                      opcionmf=Integer.parseInt(JOptionPane.showInputDialog(menumf));
                  switch (opcionmf) 
                      
                  {
                    case 1:
                        caracteristica hombre =new caracteristica();
                        hombre.datoshombre();
                        break;
                    case 2:
                        caracteristica leon =new caracteristica();
                        leon.datosleon();
                        
                        break;
                    case 3:
                        caracteristica ballenas =new caracteristica();
                        ballenas.datosballena();
                        break;
                    case 4:
                        caracteristica delfin =new caracteristica();
                        delfin.datosdelfin();
                        break;
                    case 5:
                        caracteristica ornitorrinco =new caracteristica();
                        ornitorrinco.datosornitorinco();
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        JOptionPane.showInputDialog("Solo Opciones entre 1 y 6");
                  }
                  }
                  catch  (InputMismatchException e)
                  {
                        JOptionPane.showInputDialog("Debes insertar un número");
                        sn.next();
                  }
                  }
            break;
            
            case 2:
                  Scanner snav = new Scanner(System.in);
                  boolean salirav = false;
                  int opcionav = 0;
                  String menuav="";
                  while(!salirav){
                  
                    menuav="Sobre cual Ave Desea Informacion\n";
                    menuav+="1. Aguila\n";
                    menuav+="2. Cuervo\n";
                    menuav+="3. Pinguino\n";
                    menuav+="4. Salir\n";
                    try
                  {
                      opcionav=Integer.parseInt(JOptionPane.showInputDialog(menuav));
                  switch (opcionav) 
                      
                  {
                      case 1: 
                        caracteristica aguila =new caracteristica();
                        aguila.datosaguila();
                        break;
                      case 2:  
                        caracteristica cuervo =new caracteristica();
                        cuervo.datoscuervo();
                        break;
                      case 3:
                        caracteristica pinguino =new caracteristica();
                        pinguino.datospinguino();
                        break;
                      case 4:
                          salirav = true;
                        break;
                      default:
                        JOptionPane.showInputDialog("Solo Opciones entre 1 y 4"); 
                  }
                  }
                    catch  (InputMismatchException e)
                  {
                        JOptionPane.showInputDialog("Debes insertar un número");
                        snav.next();
                  }
                  }
                            
                          
            break;
            
            case 3:
                
                 Scanner snrp = new Scanner(System.in);
                  boolean salirp = false;
                  int opcionrp = 0;
                  String menurp="";
                  while(!salirp){
                  
                    menurp="Sobre cual Reptil Desea Informacion\n";
                    menurp+="1. Caiman llanero\n";
                    menurp+="2. Tortuga Marina\n";
                    menurp+="3. Serpiente (Cobra)\n";
                    menurp+="4. Salir\n";
                    try
                  {
                      opcionrp=Integer.parseInt(JOptionPane.showInputDialog(menurp));
                  switch (opcionrp) 
                      
                  {
                      case 1:
                        caracteristica cocodrilo =new caracteristica();
                        cocodrilo.datoscocodrilo();
                      break;   
                      case 2:
                        caracteristica tortugam =new caracteristica();
                        tortugam.datostortuga();
                      break;
                      case 3:
                        caracteristica serpiente =new caracteristica();
                        serpiente.datosserpiente();
                        break;
                      case 4:
                          salirp = true;
                        break;
                      default:
                        JOptionPane.showInputDialog("Solo Opciones entre 1 y 4");
                  }
                  }
                  catch  (InputMismatchException e)
                  {
                        JOptionPane.showInputDialog("Debes insertar un número");
                        snrp.next();
                  }
                  }
            
            break;
                               
        }
        }while(opcion!=4);  
    }
     public void datosanimal6()
    {
     JOptionPane.showMessageDialog(null,"El ornitorrinco es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania. \n" +
                                 "Nombre científico: Ornithorhynchus anatinus\n" +
                                 "Orden: Monotremata\n" +
                                 "Clase: Mammalia\n" +
                                 "Número de huevos: 1 – 3\n" +
                                 "Periodo de gestación: 10 – 14 días\n" +
                                 "Promedio de vida: 17 años (En cautiverio)\n"+"\n"+ 
                                 " El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+ 
                                "Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                 "Nombre científico: Balaenidae\n" +
                                 "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                 "Familia: Balaenidae; Gray, 1825?\n" +
                                 "Clase: Mammalia\n" +
                                 "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                 "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                 "Masa Corporal: Ballena franca austral: 23,000 kg\n"+"\n"+ 
                                 "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                 "Promedio de vida: 79 años\n" +
                                 "Orden: Primates\n" +
                                 "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                 "Clase: Mammalia\n" +
                                 "Familia: Hominidae\n" +
                                 "Reino: Animalia\n" +
                                 "Filo: Chordata; Craniata\n");    
    }
    public void datosanimal7()
    {
     JOptionPane.showMessageDialog(null," El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+
                                "Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                 "Nombre científico: Balaenidae\n" +
                                 "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                 "Familia: Balaenidae; Gray, 1825?\n" +
                                 "Clase: Mammalia\n" +
                                 "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                 "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                 "Masa Corporal: Ballena franca austral: 23,000 kg\n"+"\n"+
                                 "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                 "Promedio de vida: 79 años\n" +
                                 "Orden: Primates\n" +
                                 "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                 "Clase: Mammalia\n" +
                                 "Familia: Hominidae\n" +
                                 "Reino: Animalia\n" +
                                 "Filo: Chordata; Craniata\n"+"\n"+
                                 "Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                                 "Nombre científico: Delphinidae\n" +
                                 "Familia: Delphinidae; Gray, 1821\n" +
                                 "Velocidad: Delphinus delphis: 60 km/h\n" +
                                 "Promedio de vida: Orca: 29 años, MÁS\n" +
                                 "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                                 "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                                 "Periodo de gestación: Orca: 15 – 18 meses,\n");     
    }
    public void datosanimal8()
    {
       do
        {
        menu="selecccione una opcion de 1 a 4\n";
        menu+="1. Gusanos\n";
        menu+="2. Artropodos\n";
        menu+="3. Moluscos\n";
        menu+="4. Salir\n";
        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (opcion)
        {
             case 1:
                  Scanner sn = new Scanner(System.in);
                  boolean salir = false;
                  int opciongu = 0;
                  String menugu="";
                  while(!salir){
                  
                    menugu="Sobre cual Invertebrado Desea Informacion\n";
                    menugu+="1. Oruga\n";
                    menugu+="2. Lombriz de Tierra\n";
                    menugu+="3. Sanguijuela\n";
                    menugu+="4. Taenia\n";
                    menugu+="5. Salir\n";
                   
                  try
                  {
                      opciongu=Integer.parseInt(JOptionPane.showInputDialog(menugu));
                  switch (opciongu) 
                      
                  {
                    case 1:
                        caracteristica gusano =new caracteristica();
                        gusano.datosoruga();
                        break;
                    case 2:
                        caracteristica lombriz =new caracteristica();
                        lombriz.datoslombriz();
                        break;
                    case 3:
                        caracteristica sanguijuela =new caracteristica();
                        sanguijuela.datossanguijuela();
                        break;
                    case 4:
                        caracteristica tenia =new caracteristica();
                        tenia.datostenia();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        JOptionPane.showInputDialog("Solo Opciones entre 1 y 5");
                  }
                  }
                  catch  (InputMismatchException e)
                  {
                        JOptionPane.showInputDialog("Debes insertar un número");
                        sn.next();
                  }
                  }
            break;
            
            case 2:
                  Scanner snav = new Scanner(System.in);
                  boolean salirav = false;
                  int opcionar = 0;
                  String menuar="";
                  while(!salirav){
                  
                    menuar="Sobre cual Artropodo Desea Informacion\n";
                    menuar+="1. Araña\n";
                    menuar+="2. Escorpion\n";
                    menuar+="3. Libelula\n";
                    menuar+="4. Salir\n";
                    try
                  {
                      opcionar=Integer.parseInt(JOptionPane.showInputDialog(menuar));
                  switch (opcionar) 
                      
                  {
                      case 1: 
                        caracteristica araña =new caracteristica();
                        araña.datosaraña();
                        break;
                      case 2:  
                        caracteristica escorpion =new caracteristica();
                        escorpion.datosescorpion();
                        break;
                      case 3:
                        caracteristica libelula =new caracteristica();
                        libelula.datosescorpion();
                        break;
                      case 4:
                          salirav = true;
                        break;
                      default:
                        JOptionPane.showInputDialog("Solo Opciones entre 1 y 4"); 
                  }
                  }
                    catch  (InputMismatchException e)
                  {
                        JOptionPane.showInputDialog("Debes insertar un número");
                        snav.next();
                  }
                  }
                            
                          
            break;
            
            case 3:
                
                 Scanner snrp = new Scanner(System.in);
                  boolean salirp = false;
                  int opcionrp = 0;
                  String menurp="";
                  while(!salirp){
                  
                    menurp="Sobre cual Molusco Desea Informacion\n";
                    menurp+="1. Caracol\n";
                    menurp+="2. Pulpo\n";
                    menurp+="3. Almeja\n";
                    menurp+="4. Salir\n";
                    try
                  {
                      opcionrp=Integer.parseInt(JOptionPane.showInputDialog(menurp));
                  switch (opcionrp) 
                      
                  {
                      case 1:
                        caracteristica caracol =new caracteristica();
                        caracol.datoscaracol();
                      break;   
                      case 2:
                        caracteristica pulpo =new caracteristica();
                        pulpo.datospulpo();
                      break;
                      case 3:
                        caracteristica almeja =new caracteristica();
                        almeja.datosalmeja();
                        break;
                      case 4:
                          salirp = true;
                        break;
                      default:
                        JOptionPane.showInputDialog("Solo Opciones entre 1 y 4");
                  }
                  }
                  catch  (InputMismatchException e)
                  {
                        JOptionPane.showInputDialog("Debes insertar un número");
                        snrp.next();
                  }
                  }
            
            break;
                               
        }
        }while(opcion!=4); 
    }
    public void datosanimal9()
    {
    JOptionPane.showMessageDialog(null," El león es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera.\n" +
                                "Nombre científico: Panthera leo\n" +
                                "Promedio de vida: 10 – 14 años (Adulto, En libertad)\n" +
                                "Familia: Felidae\n" +
                                "Velocidad: 80 km/h (Maximum, En periodos muy cortos)\n" +
                                "Clase: Mammalia\n" +
                                "Masa Corporal: Macho: 190 kg (Adulto), Hembra: 130 kg (Adulto)\n" +
                                "Altura: Macho: 1.2 m (Adulto, Al hombro), Hembra: 1.1 m (Adulto, Al hombro)\n"+"\n"+ 
                                "Los balénidos o ballenas son una familia de cetáceos misticetos que incluye solo cuatro especies listadas más abajo, en dos géneros, Balaena y Eubalaena.\n" +
                                 "Nombre científico: Balaenidae\n" +
                                 "Promedio de vida: Eubalaena japonica: 70 años\n" +
                                 "Familia: Balaenidae; Gray, 1825?\n" +
                                 "Clase: Mammalia\n" +
                                 "Periodo de gestación: Ballena franca austral: 12 meses, Eubalaena glacialis: 12 meses \n" +
                                 "Longitud: Ballena franca austral: 14 m, Eubalaena glacialis: 14 m, Eubalaena japonica: 15 m\n" +
                                 "Masa Corporal: Ballena franca austral: 23,000 kg\n"+"\n"+ 
                                 "El hombre o Homo sapiens es una especie del orden de los primates perteneciente a la familia de los homínidos. También son conocidos bajo la denominación genérica de «hombres».\n" +
                                 "Promedio de vida: 79 años\n" +
                                 "Orden: Primates\n" +
                                 "Velocidad: 45 km/h (Maximum, Corriendo)\n" +
                                 "Clase: Mammalia\n" +
                                 "Familia: Hominidae\n" +
                                 "Reino: Animalia\n" +
                                 "Filo: Chordata; Craniata\n"+"\n"+ 
                                 "Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                                 "Nombre científico: Delphinidae\n" +
                                 "Familia: Delphinidae; Gray, 1821\n" +
                                 "Velocidad: Delphinus delphis: 60 km/h\n" +
                                 "Promedio de vida: Orca: 29 años, MÁS\n" +
                                 "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                                 "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                                 "Periodo de gestación: Orca: 15 – 18 meses,\n");    
    }
     public void datosanimal10()
    {
     JOptionPane.showMessageDialog(null,"Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea, que comprende 34 especies.\n" +
                                 "Nombre científico: Delphinidae\n" +
                                 "Familia: Delphinidae; Gray, 1821\n" +
                                 "Velocidad: Delphinus delphis: 60 km/h\n" +
                                 "Promedio de vida: Orca: 29 años, MÁS\n" +
                                 "Longitud: Orca: 6 – 8 m, Tursiops truncatus: 2 – 4 m,\n" +
                                 "Masa Corporal: Orca: 3,600 – 5,400 kg,\n" +
                                 "Periodo de gestación: Orca: 15 – 18 meses,\n"+"\n"+  
                                 "El cuervo grande, anteriormente denominado cuervo común por la SEO, es una especie de ave paseriforme de la familia Corvidae. Presente en todo el hemisferio septentrional, es la especie de córvido con la mayor superficie de distribución.\n" +
                                 "Nombre científico: Corvus corax\n" +
                                 "Promedio de vida: 10 – 15 años (En libertad)\n" +
                                 "Longitud: 56 – 78 cm (Adulto)\n" +
                                 "Familia: Corvidae\n" +
                                 "Masa Corporal: 0.69 – 2 kg (Adulto)\n");    
    }
     public void datospinguino()
    {
    JOptionPane.showMessageDialog(null,"Los pingüinos son aves altamente adaptadas a la vida acuática, los pingüinos se caracterizan por ser hábiles"
            + " nadadores, han cambiado sus alas por aletas como parte de su proceso de adaptación.\n"
            + "Los pingüinos se alimentan de calamares, peces, camarones y otras formas de vida marina en el océano.\n"
            + "Los pingüinos viven en el hemisferio sur, sin embargo no son exclusivos de los climas más fríos, existen pingüinos que viven al norte de las islas galápagos, cerca del ecuador.\n"
            + "Los pingüinos son vistos a menudo mirando hacia arriba, y lo hacen para averiguar dónde está el sol en el cielo, así es como determinan cuando deberían estar en el agua y cuando deberían estar en la tierra.\n");

    }
    public void datoscocodrilo()
    {
    JOptionPane.showMessageDialog(null,"El caimán llanero o caimán del Orinoco, a pesar de sus nombres populares, es un cocodrilo, \n"
            + " que pertenece a la familia Crocodylidae, donde se encuentran las otras especies de "
            + " cocodrilos “verdaderos”, como el cocodrilo del Nilo (Crocodylus niloticus) o el cocodrilo .\n"
            + " americano (Crocodylus acutus). La otra principal familia de cocodrilianos es la familia \n"
            + " Alligatoridae, donde se encuentran el aligátor americano (Alligator mississippiensis) y los \n"
            + " caimanes “verdaderos” como la baba o babilla (Caiman crocodilus), el caimán negro  \n"
            + " (Melanosuchus niger) o los cachirres (Paleosuchus palpebrosus y P. trigonatus).");

    }
    public void datostortuga()
    {
    JOptionPane.showMessageDialog(null,"Las tortugas marinas son un enlace fundamental con los ecosistemas marinos.\n  Ayudan a mantener la salud de los"
            + " lechos de pastos marinos y los arrecifes coralinos, que benefician a especies con valor comercial, como el camarón, la langosta y el atún.\n"
            + "  Las tortugas marinas son representantes vivos de un grupo de reptiles que han existido en el Planeta Tierra y han recorrido nuestros mares\n"
            + " durante los últimos 100 millones de años.  Las tortugas tienen un significado cultural muy importante y un valor turístico considerable.\n"
            + "  Las tortugas marinas pueden poner más de 150 huevos por nido y pueden anidar varias veces en cada estación, con lo cual compensan las\n"
            + " altas tasas de mortalidad que impiden a la mayoría de las tortugas marinas llegar a la madurez.\n");

    }
    public void datosserpiente()
    {
    JOptionPane.showMessageDialog(null,"La Cobra real es la serpiente más larga que existe: puede alcanzar un máximo de seis metros de longitud. \n"
            + "Es la única especie del género Ophiophagus. Los lagos y arroyos de los bosques densos son los lugares donde se distribuye.\n "
            + "De color verde oliva, gris o negro, su cuerpo está recorrido por bandas de color amarillento (su vientre es crema o amarillo).\n"
            + " El macho es de mayor tamaño y grosor que la hembra; debido a la lentitud de su metabolismo, si come una presa grande podrá pasar\n"
            + " varios meses sin necesidad de alimentarse. La Cobra real es capaz de inocular, en una única mordedura, hasta 500 miligramos; \n"
            + "la característica de este veneno es que es neurotóxico y cardiotóxico, de manera que afecta al sistema nervioso central, provocando en\n"
            + " la víctima daños importantes (visión borrosa, fallos renales, respiratorios y cardíacos).\n");

    }
    public void datosoruga()
    {
    JOptionPane.showMessageDialog(null,"Una oruga es la forma larvaria de un lepidóptero (un miembro del orden de insectos que contiene las mariposas y las polillas ).\n"
            + " Las orugas tienen cuerpos largos y segmentados y muchos pares de «patas».Se alimentan vorazmente de hojas, crecen rápidamente, suelen mudar la piel cuatro o cinco veces,\n"
            + " y eventualmente se recubren de capullos y luego llegan a la forma adulta.Las orugas no respiran por la boca .\n"
            + " El aire entra dentro de sus cuerpos a través de una serie de pequeños tubitos situados a los lados de sus tórax y abdomen.\n"
            + " Estos tubitos se interconectan dentro del cuerpo formando una red traqueal.Algunas orugas tienen grandes «ojos falsos» hacia el final del abdomen.\n"
            + " Esto es un intento de hacer creer a los depredadores que su trasero es de hecho su frente, dándoles una oportunidad de huir hacia atrás cuando son atacados.\n");

    }
    public void datoslombriz()
    {
    JOptionPane.showMessageDialog(null,"La lombriz de tierra, de color gris rojizo, es un animal familiar para todo aquel que tenga un jardín o una caña de pescar.\n"
            + " Es oriunda de Europa, pero en la actualidad abunda también en Norteamérica y en Asia occidental.\n" +
            "\n" + "Aunque por lo general apenas mide 7 u 8 centímetros, se sabe que algunos miembros de la especie alcanzan hasta 35 centímetros de longitud con el cuerpo enrollado.\n"
            + " El cuerpo de la lombriz de tierra está formado por segmentos llamados anillos o metámeros.\n"
            + " Estos segmentos están recubiertos de sedas, o pequeñas cerdas, que la lombriz usa para remover y escarbar la tierra.\n"
            + "La lombriz tiene la boca en el primer segmento del cuerpo. A medida que cava la tierra la va ingiriendo, extrayendo de ella nutrientes que provienen de la descomposición de materia orgánica,\n"
            + "como hojas o raíces.\n"
            + "La lombriz de tierra es vital para la salud del suelo, ya que transporta nutrientes y minerales hasta la superficie mediante sus deshechos y los túneles que excava oxigenan la tierra. ");

    }
    public void datossanguijuela()
    {
    JOptionPane.showMessageDialog(null,"Las sanguijuelas, al igual que los poliquetos y oligoquetos, pertenecen al filo Annelida, que agrupa a unas 16 500 especies.\n"
            + "Históricamente, las sanguijuelas se han clasificado en dos grupos dependiendo de la presencia o no de una probóscide eversible: rincobdélidos y arincobdélidos.\n"
            + "De acuerdo con Sawyer, hay tres grupos de rincobdélidos: los piscicólidos, parásitos de peces marinos y de agua dulce; los ozobránquidos, que infectan elasmobranquios \n"
            + "y tortugas marinas y de agua dulce, y, finalmente, los glosifónidos, que incluyen organismos aplanados dorsoventralmente, con algunas especies hematófagas y algunas \n"
            + "otras que se alimentan de la hemolinfa de moluscos y lombrices.\n"
            + "En este último grupo se encuentra Haementeria ghilianii, la sanguijuela más grande del mundo, que llega a medir más de 30 cm y habita en el Amazonas,\n"
            + "alimentándose de sangre de vertebrados.\n");
        }
    
    public void datostenia()
    {
    JOptionPane.showMessageDialog(null,"Taenia es un género de platelmintos parásitos de la clase Cestoda, conocidos vulgarmente como tenias o solitarias, que causan dos tipos de enfermedades parasitarias, según sean producidas por su fase adulta o por su fase larvaria.\n"
            + " Se llama teniasis a la que ocurre por la presencia de sus formas adultas, cuando se alojan en el intestino del huésped definitivo, y cisticercosis o cenurosis a la producida por sus formas larvales,\n"
            + " intermedias o juveniles, al afectar a los hospedadores intermediarios en sus tejidos u órganos internos.\n" 
            + "Las 32 especies de Taenia reconocidos1? parasitan a diversos animales, pero sólo T. saginata, T. asiatica y T.\n"
            + " solium causan enfermedad en los humanos."
            + "En su forma adulta, como todo platelminto, son \"gusanos\" aplanados a lo ancho, como una cinta, con ausencia de cavidad general, recubiertos por una estructura sincitial llamada tegumento, a diferencia de la cutícula de los nematodos. Su longitud varía, según las especies, desde los 50 cm a más de 15 m.\n"
            + "Como los demás cestodos, carecen de tubo digestivo, su cuerpo es segmentado y son parásitos digestivos de vertebrados e invertebrados.\n"
            + " Son hermafroditas, con poros genitales irregularmente alternos en cada proglótide. Como otros miembros del orden Cyclophyllidea poseen los característicos órganos de fijación,\n"
            + " llamados ventosas, cuatro en total, como parte del escólex o segmento anterior del parásito, que tiene también un rostelo que puede presentar una o varias hileras de ganchos (tenias armadas),\n"
            + " o no estar presentes (tenias inermes).2? Estos órganos, ventosas y garfios, son los que les permiten fijarse a las paredes del intestino de su hospedador.");
        }
    public void datosaraña()
    {
    JOptionPane.showMessageDialog(null,"Las arañas son un conjunto de animales artrópodos del orden Araneae, muy abundante en todo el mundo y del que se conocen aproximadamente unas 45.000 especies diferentes.\n"
            + "Son el orden más numeroso de la clase Arachnida y están lejanamente emparentadas con otros grupos de artrópodos, como los insectos. Se trata además de uno de los grupos más diversos, colocándose en cuanto al resto de organismos en el séptimo lugar respecto a su diversidad. \n" 
            + "Las arañas tienen el cuerpo dividido en dos partes denominadas tagmas, y cuentan con cuatro pares de patas. Se sabe que durante la prehistoria existieron algunas arañas que podían llegar a medir 50 centímetros, pero actualmente la más grande que existe tiene un tamaño de 30 centímetros. Por regla general son animales solitarios y depredadores de pequeños insectos a los cuales pueden dar caza a través de técnicas muy variadas. Algunas, de hecho, poseen potentes venenos los cuales un pequeña cantidad, puede acabar con la vida de un ser humano.\n" 
            + "Son capaces de producir seda que usan pajar tejer sofisticadas telarañas principalmente con el objetivo de cazar, aunque tienen múltiples utilidades");

    }
    public void datosescorpion()
    {
    JOptionPane.showMessageDialog(null,"Los escorpiones pertenecen a la clase de los arácnidos, y están estrechamente emparentados con las arañas, los caros y las garrapatas. Se los asocia comúnmente con el desierto, pero también están presentes en la selva brasilea, Columbia Britnica, Carolina del Norte e incluso la cordillera del Himalaya.\n"
            + " Estos resistentes y adaptables artrópodos existen desde hace cientos de millones de añosHay casi 2.000 especies de escorpión, aunque solo 30 o 40 tienen un veneno lo bastante potente como para matar a una persona.\n"
            + " Los numerosos tipos de veneno están perfectamente adaptados al estilo de vida de cada especie, especializados para tener la máxima efectividad contra sus respectivas presas.\n" 
            + "Los escorpiones suelen alimentarse de insectos, aunque su dieta puede ser extraordinariamente amplia, un factor clave para su supervivencia en tantos entornos hostiles.");
        }
    
    public void datoslibelula()
    {
    JOptionPane.showMessageDialog(null,"Los anisópteros (Anisoptera, del griego ???s?? anisos, 'desigual' y pt???? pteron, 'ala') son uno de los dos infraórdenes clásicos del suborden Epiprocta.\n"
            + " Se conocen comúnmente como libélulas, aunque este término suele usarse también en un sentido más amplio para designar a todos los odonatos.\n" +
            "\n" +
            "Son paleópteros, es decir, insectos que no pueden plegar las alas sobre el abdomen.\n"
            + " Se caracterizan por sus grandes ojos multifacetados, sus dos pares de fuertes alas transparentes y por su abdomen alargado. Se alimentan de mosquitos y otros pequeños insectos como moscas, abejas, mariposas y polillas.\n" +
            "\n" +
            "Su hábitat natural se encuentra en las cercanías de lagos, charcos, ríos y tierras pantanosas, ya que sus ninfas son acuáticas. Las libélulas no pican a los humanos y son valiosos depredadores, ya que controlan las poblaciones de moscas y mosquitos, algunos de los cuales transmiten enfermedades como el dengue.\n" +
            "\n" +
            "Algunas especies son migratorias. En efecto, algunas (en los géneros Libellula, Sympetrum y Pantala) se cuentan entre los insectos con los vuelos migratorios más largos.1?");
        }
     public void datoscaracol()
    {
    JOptionPane.showMessageDialog(null,"El término caracol es el nombre común de los moluscos gasterópodos provistos de una concha espiral.\n"
            + " Hay caracoles marinos (a veces denominados caracolas), dulceacuícolas y terrestres.\n"
            + " Los caracoles se mueven por medio de una serie de contracciones musculares ondulatorias que recorren la cara inferior del pie.\n"
            + " Estos poseen en la boca una estructura llamada rádula, con miles de dentículos que les sirven para raspar el moho de las rocas Los caracoles se desplazan con lentitud alternando contracciones y elongaciones de su cuerpo.\n"
            + " Producen mucus para autoayudarse en la locomoción reduciendo la fricción y permitiéndoles el desplazamiento por zonas de elevada pendiente debido a la untuosidad del mismo.\n"
            + " Esta mucosidad contribuye a su regulación térmica; también reduce el riesgo del caracol ante las heridas y las agresiones externas, principalmente bacterianas y fúngicas,\n"
            + " y los ayuda a ahuyentar insectos potencialmente peligrosos como las hormigas.\n"
            + " El mucus sirve además al caracol para desprenderse de ciertas sustancias tóxicas como los metales pesados.\n"
            + " Cuando se retraen en su concha, segregan un tipo especial de mucosidad para cubrir la entrada que al solidificarse forma una estructura llamada opérculo.\n"
            + " El opérculo de algunos caracoles tiene un olor agradable cuando se quema, por eso a veces se usa como un constituyente del incienso.");

    }
    public void datospulpo()
    {
    JOptionPane.showMessageDialog(null,"Los octópodos 2?3? son un orden de moluscos cefalópodos octopodiformes conocidos comúnmente como pulpos.\n"
            + " Al igual que otros cefalópodos, el pulpo es bilateralmente simétrico, con la boca y el pico situados en el punto central de sus ocho extremidades.\n"
            + " Tienen un cuerpo blando que puede alterar rápidamente su forma, permitiendo que se escurran a través de pequeñas grietas.\n"
            + " Arrastran sus ocho apéndices detrás de ellos mientras nadan. Utilizan el sifón tanto para la respiración como para la locomoción, expulsando un chorro de agua.\n"
            + " Cuentan con un sistema nervioso complejo y una vista excelente y se encuentran entre los invertebrados más inteligentes y de mayor diversidad conductual.\n"
            + "Habitan diversas regiones del océano, como los arrecifes de coral, las aguas pelágicas y el fondo marino;\n"
            + " algunas especies viven en la zona intermareal y otras en la abisal. La mayoría de las especies crecen rápido,\n"
            + " maduran temprano y son de vida efímera. Durante la reproducción, el macho utiliza un brazo especialmente adaptado para depositar un paquete de esperma directamente en la cavidad paleal de la hembra,\n"
            + " después de lo cual se produce una rápida senescencia y muere. La hembra deposita los huevos fertilizados en una madriguera y los cuida hasta que nacen,\n"
            + " después de lo cual también muere. Entre sus estrategias para defenderse de los depredadores incluyen la expulsión de tinta, el camuflaje y el comportamiento deimático, su capacidad para impulsarse rápidamente a través del agua y esconderse,\n"
            + " e incluso mediante el engaño. Todos los pulpos son venenosos, pero solo hay constancia de que los pulpos de anillos azules puedan ser mortales para los humanos.");
        }
    
    public void datosalmeja()
    {
    JOptionPane.showMessageDialog(null,"La almeja es un molusco bivalvo que vive en aguas saladas.\n"
            + " Los Bivalvos son aquellos moluscos cuyo cuerpo está protegido por dos conchas simétricas, cómo el mejillón, la ostra, o la navaja.\n"
            + " Soportan temperaturas de 5 a 35ºC, la baja mar y los cambios de salinidad.\n"
            + "Las almejas no tienen cerebro ni ojos, pero si tienen corazón, boca y recto y su sistema circulatorio es abierto.\n"
            + " Esto quiere decir que sus órganos están rodeados de sangre y agua que contiene los nutrientes y oxígeno.\n" 
            + "Este molusco vive enterrado en la arena a unos 5 - 30 cm de la superficie en fondos arenosos o fangosos, en los que excava y se oculta.\n"
            + "Se alimenta de pequeños seres vivos mediante la filtración de agua.");
        }
    
}
