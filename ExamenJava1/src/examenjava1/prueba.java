package examenjava1;


public class prueba {

    public String geringoso(String palabra) {
        // Acá escribí la lógica necesaria
        String palabra_jeringoso = "";

        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.charAt(i) == 'a') {
                
                palabra_jeringoso = palabra_jeringoso + palabra.charAt(i)+ "p"+ palabra.charAt(i);

            }
            else
            {
                palabra_jeringoso = palabra_jeringoso + palabra.charAt(i);
            }
        }

        return palabra_jeringoso;
    }
}
