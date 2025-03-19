package principal;

import modelo.Array;
import modelo.Pet;

public class Main {
    public static void main(String[] args) {

        Array lista = new Array();

        Pet pet1 = new Pet("Victor", 5, "Macaco");
        Pet pet2 = new Pet("Pardini", 7, "Porco");
        Pet pet3 = new Pet("Bruno", 10, "Galinha");


        lista.inserir(pet1);
        lista.inserir(pet2);
        lista.inserir(pet3);

        Pet resultado = lista.busca(1);

        if (resultado != null) {
            System.out.println(resultado.toString());
        } else {
            System.out.println("Pet não encontrado.");
        }

        System.out.println();
        Array.ordenarPorNome(lista.pet);

        System.out.println("Pets ordenados por nome:");
        for (Pet pet : lista.pet) {
            if (pet != null) {  // Verificando se o pet não é null
                System.out.println(pet.getNome());
            }
        }
    }
}