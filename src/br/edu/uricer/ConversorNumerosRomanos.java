package br.edu.uricer;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
class ConversorNumerosRomanos {

    public int converter(char i) {
        switch (i) {
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'I':
                return 1;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public int converter(String numeroRomano) {
        int total = 0;
        
        for (int i = 0; i < numeroRomano.length(); i++) {
            int valorCaracterAtual = converter(numeroRomano.charAt(i));
            int valorCaracterAnterior = i - 1 >= 0 ? converter(numeroRomano.charAt(i-1)) : 0;
            
            if(valorCaracterAnterior < valorCaracterAtual) {
                total = valorCaracterAtual - total;
            } else {
                total = total + valorCaracterAtual;
            }
        }
        
        return total;
    }    
}
