package modelo;

public class Array {

    public Pet[] pet = new Pet[3];
    private int indice;

    public void inserir(Pet pets){
        if(indice==pet.length){
            //Novo array maior
            pet=novoArray();
        }
        pet[indice++]=pets;
    }

    private Pet[] novoArray(){
        Pet[] novo=new Pet[pet.length+2];

        System.arraycopy(pet, 0, novo, 0, pet.length);

        return novo;
    }

    public Pet busca(int id) {
        return buscaBinariaRecursiva(pet, id, 0, pet.length -1);
    }

    private Pet buscaBinariaRecursiva(Pet[] pet, int id, int inicio, int fim) {
        // Caso base: quando o início ultrapassa o fim, significa que o item não foi encontrado
        if (inicio > fim) {
            return null; // Item não encontrado
        }

        // Calcula o meio da lista
        int meio = (inicio + fim) / 2;
        Pet petAtual = pet[meio];

        // Verifica se o item no meio é o que procuramos
        if (petAtual.getId() == id) {
            return petAtual;
        }

        // Se o id procurado é menor que o id do item no meio, busca na metade esquerda
        if (id < petAtual.getId()) {
            return buscaBinariaRecursiva(pet, id, inicio, meio - 1);
        } else {
            // Se o id procurado é maior, busca na metade direita
            return buscaBinariaRecursiva(pet, id, meio + 1, fim);
        }
}

    public static void ordenarPorNome(Pet[] pet) {
        int n = pet.length;

        // Bubble Sort: repetidamente troca os itens adjacentes se estiverem na ordem errada
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Pet petAtual = pet[j];
                Pet petProximo = pet[j+1];

                // Comparar os itens pelo nome
                if (petAtual.getNome().compareTo(petProximo.getNome()) > 0) {
                    // Trocar os itens de lugar
                    pet[j] = petProximo;
                    pet[j+1] = petAtual;
                }
            }
        }
    }
    }
