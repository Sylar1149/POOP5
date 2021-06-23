/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author Miguel Lozano
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo1 = new Circulo(8);
        System.out.println("radio cir1 = "+circulo1.getRadio());
        
        Circulo circulo2 = new Circulo();
        System.out.println(circulo2);
        circulo2.setRadio(2);
        System.out.println(circulo2);
        circulo2.setRadio(-10);
        System.out.println(circulo2);
        
        System.out.println("############### E2 #################");
        Persona per1 = new Persona();
        Fecha fnac = new Fecha();
        
        per1.setNombre("Raul");
        per1.setApellido("Hernandez");
        fnac.setDia(10);
        fnac.setMes(6);
        fnac.setAnio(2000);
        per1.setfNacimiento(fnac);
        System.out.println(per1);
        
        System.out.println("Fecha nacimiento: "+per1.getfNacimiento().getDia()+
                "/"+per1.getfNacimiento().getMes()+"/"+per1.getfNacimiento().getAnio());
        
        System.out.println("Fecha nacimiento: "+per1.getfNacimiento());
        
        /*
           Implementar clase coche que tenga 4 personas y cada una diga en que lugar está
        *Chofer
        *Copiloto
        *Pasajero1
        *Pasajero2
        */
        
        System.out.println("\nCoche\n");
        Coche coch1 = new Coche();
        coch1.setLugar("Copiloto");
        coch1.setPersona(per1);
        System.out.println("Persona 1");
        System.out.println(coch1+"\n");
 
        
        per1.setNombre("Paulina");
        per1.setApellido("López");
        fnac.setDia(6);
        fnac.setMes(8);
        fnac.setAnio(1991);
        coch1.setLugar("Chofer");
        per1.setfNacimiento(fnac);
        coch1.setPersona(per1);
        System.out.println("Persona 2");
        System.out.println(coch1+"\n");
        
        
        per1.setNombre("Miriam");
        per1.setApellido("Rodríguez");
        fnac.setDia(18);
        fnac.setMes(9);
        fnac.setAnio(2001);
        coch1.setLugar("Pasajera 1");
        per1.setfNacimiento(fnac);
        coch1.setPersona(per1);
        System.out.println("Persona 3");
        System.out.println(coch1+"\n");
        
        
        per1.setNombre("Miguel");
        per1.setApellido("Lozano");
        fnac.setDia(23);
        fnac.setMes(1);
        fnac.setAnio(2001);
        coch1.setLugar("Pasajero 2");
        per1.setfNacimiento(fnac);
        coch1.setPersona(per1);
        System.out.println("Persona 4");
        System.out.println(coch1+"\n");
    }
    
}
