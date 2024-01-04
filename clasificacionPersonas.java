class Persona {
    char sexo;
    int edad;
}

void clasificacionPersonas (){
    Persona[] personas = new Persona[50]; 
    personas = leerPersonas();

    int mayoresEdad = 0;
    int masculinasMayores = 0;
    int femeninasMenores = 0;
    int mujeres = 0;

    for(int i = 0; i < personas.length; i++){

        if(personas[i].edad >= 18){
            mayoresEdad++;
            if(personas[i].sexo == 'm'){
                masculinasMayores++;
            }
        }else{
            if(personas[i].sexo == 'f'){
                femeninasMenores++;
            }
        }

        if(personas[i].sexo == 'f'){
                mujeres++;
        }
    }

    System.out.print("Cantidad de personas mayores de edad: " + mayoresEdad);
    System.out.print("Cantidad de personas menores de edad: " + (personas.length-mayoresEdad));
    System.out.print("Cantidad de personas masculinas mayores de edad: " + masculinasMayores);
    System.out.print("Cantidad de personas femeninas menores de edad: " + femeninasMenores);
    System.out.print("Porcentaje que representan las personas mayores de edad respecto al total de personas: " +  ((mayoresEdad/personas.length)*100));
    System.out.print("Porcentaje que representan las mujeres respecto al total de personas: " + ((mujeres/personas.length)*100));

}