public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;
    
    public void reducirPrecioBillete(int cantidad) {
    precioBillete = precioBillete - cantidad;
    }

    
    public void setPrecioBillete(int nuevoPrecio) {
    precioBillete = nuevoPrecio;
    }   
    
    public int getTotalDineroAcumulado() {
    return totalDineroAcumulado;
     }


    /**
     * Crea una maquina expendedora de billetes de tren con valores fijos:
     * Precio = 20 euros, origen = "León", destino = "Benavente".
     */
    public MaquinaExpendedoraSimple() {
        precioBillete = 20;            // Precio fijo
        estacionOrigen = "León";       // Origen fijo
        estacionDestino = "Benavente"; // Destino fijo
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
    }

    /**
     * Segundo constructor:
     * Permite crear una máquina con un precio y destino personalizados.
     * El origen será siempre "León" y el resto de valores iniciales son 0.
     */
    public MaquinaExpendedoraSimple(int precio, String destino) {
        precioBillete = precio;
        estacionOrigen = "León";
        estacionDestino = destino;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
    }

    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }

    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }

    /**
     * Devuelve el origen del billete
     */
    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    /**
     * Devuelve el destino del billete
     */
    public String getEstacionDestino() {
        return estacionDestino;
    }

    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
    }

    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();

        // Actualiza el total de dinero acumulado en la maquina
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}

