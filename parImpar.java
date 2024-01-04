void parImpar () {
    int numero = leerNumero();           
    for(int i = numero; i > 1; i-=2){
        System.out.print(i + " ");
    }
    if(numero % 2 == 0 ){
        System.out.print(0);
    }else{
        System.out.print(1);
    }
}
