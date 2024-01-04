int calculoSalario(){
    int horasTrabajadas = leerHorasTrabajadas();
    int tarifa = leerTarifa();
    int sueldo = 0;

    if(horasTrabajadas > 40){
        int horasExtra = horasTrabajadas - 40;
        sueldo = (horasTrabajadas-horasExtra)*tarifa + horasExtra*tarifa*1.5;
    }else{
        sueldo = horasTrabajadas*tarifa;
    }

    return sueldo;
}