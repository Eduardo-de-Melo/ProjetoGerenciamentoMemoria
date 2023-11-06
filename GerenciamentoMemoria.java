import java.util.Random;

class Gerenciamento{
    public static void main(String[] args) {
        Random random = new Random();

        //Criando a matriz do SWAP
        int qtdLinhasSWAP = 101; //Tamanho maior por causa do título
        int qtdColunasSWAP = 6;
        Object[][] matrizSwap = new Object[qtdLinhasSWAP][qtdColunasSWAP];

        //Colocando os títulos das colunas na primeira linha
        matrizSwap[0][0] = "(N)";
        matrizSwap[0][1] = "(I)";
        matrizSwap[0][2] = "(D)";
        matrizSwap[0][3] = "(R)";
        matrizSwap[0][4] = "(M)";
        matrizSwap[0][5] = "(T)";

        //Preenchendo os dados da matriz SWAP a partir da segunda linha
        for (int i = 1; i < qtdLinhasSWAP; i++) {
            matrizSwap[i][0] = i - 1; // (N) com -1 para começar no 0
            matrizSwap[i][1] = i; // (I)
            matrizSwap[i][2] = (int) (Math.random() * 50) + 1; //(D) com um numero aleatorio. Adicionamos 1 para que o método não comece em 0, mas sim no 1. E multiplicamos por 50 para mostrar o limite
            matrizSwap[i][3] = 0; // (R)
            matrizSwap[i][4] = 0; // (M)
            matrizSwap[i][5] = (int) (Math.random() * 9900) + 100; //(T) com o método igual ao de (D), Porém, agora queremos começar no 100.
        }
        //Imprimindo
        System.out.println("");
        System.out.println("-------------------SWAP-------------------");
        for (int i = 0; i < qtdLinhasSWAP; i++) {
            for (int j = 0; j < qtdColunasSWAP; j++) {
            System.out.print(matrizSwap[i][j] + "\t");
        }
            System.out.println(); //Nova linha após cada linha da matriz
        }
        
        
        //Criando a matriz RAM
        int qtdLinhasRAM = 11;
        int qtdColunasRAM = 6;

        Object[][] matrizRAM = new Object[qtdLinhasRAM][qtdColunasRAM];

        //Preenchendo a matriz RAM com os mesmos campos
        matrizRAM[0][0] = "(N)";
        matrizRAM[0][1] = "(I)";
        matrizRAM[0][2] = "(D)";
        matrizRAM[0][3] = "(R)";
        matrizRAM[0][4] = "(M)";
        matrizRAM[0][5] = "(T)";

        //Sorteando um número em cada linha da matriz RAM, baseado no campo N
        for(int i = 1; i < qtdLinhasRAM; i++){
            int numSorteado = (int) (Math.random() * 99);//Sorteia um número de 0 a 99
            for (int j = 0; j < qtdColunasRAM; j++) {
                matrizRAM[i][j] = matrizSwap[numSorteado][j];//Adiciona os dados da Matriz SWAP para cada linha sorteada da matriz RAM
            }
        }

        System.out.println("");
        System.out.println("-------------------SORTEIO-------------------");
        System.out.println("");

        
        //Sorteando um número em cada linha da matriz RAM, baseado no campo I
        for(int i = 1; i < qtdLinhasRAM; i++){
            int numSorteado = (int) (Math.random() * 100) + 1;//Sorteia um número de 0 a 99
            System.out.println("Numero sorteado:"+ numSorteado);
            
            if ((int) matrizRAM[i][1] == numSorteado){ //Verifica se o numero está carregado na coluna I da matriz RAM
                matrizRAM[i][3] = 1; //Altera o valor de D para 1, caso esteja na matriz RAM

                double probabilidade = random.nextDouble(); //Sorteia um numero de 0 a 1.0
                if (probabilidade <= 0.3) {
                    matrizRAM[i][2] = (int )matrizRAM[i][2] + 1; //Atualiza o campo D para D = D + 1
                    matrizRAM[i][4] = 1; //Atualiza o campo M para 1
            }
            else{
                
                }
            }
            
        }
        
        //Imprimindo
        System.out.println("");
        System.out.println("-------------------RAM-------------------");
        for (int i = 0; i < qtdLinhasRAM; i++) {
            for (int j = 0; j < qtdColunasRAM; j++) {
            System.out.print(matrizRAM[i][j] + "\t");
        }
            System.out.println(); // Nova linha após cada linha da matriz
        }
        
    }
}
