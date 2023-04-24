// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------Condicionales---------------------------------");
        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        int numeroIf = 0;
        if (numeroIf >= 0){
            System.out.println("El numero " + numeroIf +  " es positivo");
        } else {
            System.out.println("El numero " + numeroIf +  " es negativo");
        }

        System.out.println("---------------------------------Bucle While---------------------------------");
        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea
        // inferior a 3, el bloque de código que tendrá el bucle deberá:
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //Mostrarlo por pantalla cada vez que se ejecute.
        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("---------------------------------Bucle do While---------------------------------");
        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe
        // ejecutar una vez.
        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while(numeroDoWhile<3);

        System.out.println("---------------------------------Bucle for---------------------------------");
        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición
        // será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se
        // ejecute y deberá mostrarse por pantalla.

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("---------------------------------Switch---------------------------------");
        // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro
        // estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por
        // consola informando de la estación en la que está. También habrá que poner un default para cuando
        // el valor de la variable no sea una estación.
        var estacion = "invierno";

        switch(estacion){
            case "verano":
                System.out.println("Estás en la estacion verano");
                break;
            case "invierno":
                System.out.println("Estás en la estacion invierno");
                break;
            case "primavera":
                System.out.println("Estás en la estacion primavera");
                break;
            case "otoño":
                System.out.println("Estás en la estacion otoño");
                break;
            default:
                System.out.println("El valor dado no es una estación");
        }

    }
}