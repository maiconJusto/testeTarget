class RespostaCinco {
    public static String inverterString(String str) {
        char[] array = str.toCharArray();
        int inicio = 0;
        int fim = array.length - 1;
        while (inicio < fim) {
            char temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(array);
    }

    public static void main(String[] args) {
        String str = "Olá, Mundo!";
        String strInvertida = inverterString(str);
        System.out.println(strInvertida);
    }
}