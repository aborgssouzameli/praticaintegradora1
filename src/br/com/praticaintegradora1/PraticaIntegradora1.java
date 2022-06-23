package br.com.praticaintegradora1;

public class PraticaIntegradora1 {
    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madrid", "Nueva Work", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiado de Chile", "Lisboa", "Tokio"};
        int[][] temperaturasCidades = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int[] temperaturaBaixaRegistrada = {0, 999};
        int[] temperaturaAltaRegistrada = {0, -999};
        for (int pos = 0; pos < cidades.length; pos++) {
            int temperaturaBaixa = temperaturasCidades[pos][0];
            int temperaturaAltaCidade = temperaturasCidades[pos][1];
            if (temperaturaBaixa < temperaturaBaixaRegistrada[1]) {
                temperaturaBaixaRegistrada[0] = pos;
                temperaturaBaixaRegistrada[1] = temperaturaBaixa;
            }
            if (temperaturaAltaCidade > temperaturaAltaRegistrada[1]) {
                temperaturaAltaRegistrada[0] = pos;
                temperaturaAltaRegistrada[1] = temperaturaAltaCidade;
            }
        }
        System.out.printf("Mínimo: (%d): %s \n",
                temperaturaBaixaRegistrada[1],
                cidades[temperaturaBaixaRegistrada[0]]);
        System.out.printf("Máxima: (%d): %s \n",
                temperaturaAltaRegistrada[1],
                cidades[temperaturaAltaRegistrada[0]]);
    }
}
