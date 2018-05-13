import estudiantes.Estudiantes;

public class Principal {
    public static void main (String [] args){
    Estudiantes [] estudiantes1 =new Estudiantes [5];
    estudiantes1 [0]=new Estudiantes ("Naty","Guallichico","1722380571");
    
    Estudiantes estudiantes11=new Estudiantes ("Nataly","Guallichico","1722380571");
        System.out.println("Estudiante 1");
        System.out.println();
        System.out.println("Nombre: "+estudiantes11.getNombre());
        System.out.println("Apellido: "+estudiantes11.getApellido());
        System.out.println("Cedula: "+estudiantes11.getCedula());
        System.out.println("Materias: ");
        String []m={"m1","m2"};
        estudiantes1 [0].setMaterias(m);
        String []materiasEstudiantes=estudiantes1 [0].getMaterias();
        for (int i=0; i<materiasEstudiantes.length; i++){
            System.out.println(materiasEstudiantes[i]);
        }
        System.out.println();
        
    estudiantes1 [1]=new Estudiantes ("Andres","Alvear","1722364705");
    Estudiantes estudiantes12=new Estudiantes ("Andres","Alvear","1722364705");
        System.out.println("Estudiante 2");
        System.out.println();
        System.out.println("Nombre: "+estudiantes12.getNombre());
        System.out.println("Apellido: "+estudiantes12.getApellido());
        System.out.println("Cedula: "+estudiantes12.getCedula());
        System.out.println("Materias: ");
        String []m1={"m1","m2","m3"};
        estudiantes1 [1].setMaterias(m1);
        String[]materiasEstudiantes1=estudiantes1 [1].getMaterias();
        for (int i=0; i<materiasEstudiantes1.length; i++){
            System.out.println(materiasEstudiantes1[i]);
        }
    estudiantes1 [2]=new Estudiantes ("Mauricio","Rodrigues","1767536475");
    Estudiantes estudiantes13=new Estudiantes ("Mauricio","Rodrigues","1767536475");
        System.out.println("Estudiante 3");
        System.out.println();
        System.out.println("Nombre: "+estudiantes13.getNombre());
        System.out.println("Apellido: "+estudiantes13.getApellido());
        System.out.println("Cedula: "+estudiantes13.getCedula());
        System.out.println("Materias: ");
        String []m2={"m1","m2","m3","m4"};
        estudiantes1 [2].setMaterias(m2);
        String[]materiasEstudiantes2=estudiantes1 [2].getMaterias();
        for (int i=0; i<materiasEstudiantes2.length; i++){
            System.out.println(materiasEstudiantes2 [i]);
        }
        
        estudiantes1 [3]=new Estudiantes ("Juan","Quishpe","1767536197");
    Estudiantes estudiantes14=new Estudiantes ("Juan","Quishpe","1767536197");
        System.out.println("Estudiante 4");
        System.out.println();
        System.out.println("Nombre: "+estudiantes14.getNombre());
        System.out.println("Apellido: "+estudiantes14.getApellido());
        System.out.println("Cedula: "+estudiantes14.getCedula());
        System.out.println("Materias: ");
        String []m3={"m1","m2","m3"};
        estudiantes1 [3].setMaterias(m3);
        String[]materiasEstudiantes3=estudiantes1 [3].getMaterias();
        for (int i=0; i<materiasEstudiantes3.length; i++){
            System.out.println(materiasEstudiantes3 [i]);
        }
        
        estudiantes1 [4]=new Estudiantes ("Mishell","Loaiza","1767536234");
    Estudiantes estudiantes15=new Estudiantes ("Mishell","Loaiza","1767536234");
        System.out.println("Estudiante 5");
        System.out.println();
        System.out.println("Nombre: "+estudiantes15.getNombre());
        System.out.println("Apellido: "+estudiantes15.getApellido());
        System.out.println("Cedula: "+estudiantes15.getCedula());
        System.out.println("Materias: ");
        String []m4={"m1","m2","m3"};
        estudiantes1 [4].setMaterias(m4);
        String[]materiasEstudiantes4=estudiantes1 [4].getMaterias();
        for (int i=0; i<materiasEstudiantes4.length; i++){
            System.out.println(materiasEstudiantes4 [i]);
        }
    
    
    }
    
}
