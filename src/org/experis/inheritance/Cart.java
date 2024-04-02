package org.experis.inheritance;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per l'input da tastiera
        Scanner scanner = new Scanner(System.in);

        // Messaggio di benvenuto e istruzioni per l'inserimento dei prodotti
        System.out.println("Benvenuto nel carrello! Inserisci i prodotti desiderati. Digita 'fine' quando hai finito.");

        // Inizializzazione di un array di oggetti Product con capacità massima 100 per il carrello
        Product[] cart = new Product[10];

        // Variabile per tenere traccia dell'indice corrente nel carrello
        int index = 0;

        // Ciclo per l'inserimento dei prodotti nel carrello
        while (true) {
            // Richiesta del tipo di prodotto da inserire
            System.out.println("Inserisci il tipo di prodotto (Smartphone, Televisore, Cuffie) o 'fine' per terminare: ");
            String typeProduct = scanner.nextLine();

            // Uscita dal ciclo se l'utente digita "fine"
            if (typeProduct.equalsIgnoreCase("fine")) {
                break;
            }

            // Acquisizione delle informazioni comuni a tutti i prodotti
            System.out.println("Inserisci il codice: ");
            int code = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il nome: ");
            String name = scanner.nextLine();
            System.out.println("Inserisci la marca: ");
            String brand = scanner.nextLine();
            System.out.println("Inserisci il prezzo: ");
            // Verifico se l'utente ha inserito un numero decimale valido
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Inserisci l'IVA: ");
            double iva = scanner.nextDouble();
            scanner.nextLine();

            // Creazione dell'oggetto Product corrispondente al tipo inserito
            switch(typeProduct.toLowerCase()) {
                case "smartphone":
                    System.out.println("Inserisci l'IMEI: ");
                    String code_imei = scanner.nextLine();
                    System.out.println("Inserisci la memoria: ");
                    int memory = scanner.nextInt();
                    scanner.nextLine();
                    cart[index++] = new Smartphone(code, name, brand, price, iva, code_imei, memory);
                    break;
                case "televisore":
                    System.out.println("Inserisci le dimensioni: ");
                    String dimensions = scanner.nextLine();
                    System.out.println("Il televisore è smart? (true/false): ");
                    // Verifico se la risposta dell'utente è vera o falsa
                    boolean smart = scanner.nextBoolean();
                    scanner.nextLine();
                    cart[index++] = new Television(code, name, brand, price, iva, dimensions, smart);
                    break;
                case "cuffie":
                    System.out.println("Inserisci il colore: ");
                    String colour = scanner.nextLine();
                    System.out.println("Le cuffie sono wireless? (true/false)");
                    // Verifico se la risposta dell'utente è vera o falsa
                    boolean wireless = scanner.nextBoolean();
                    scanner.nextLine();
                    cart[index++] = new HeadPhones(code, name, brand, price, iva, colour, wireless);
                    break;
                default:
                    System.out.println("Tipo di prodotto non valido. Riprova.");
                    break;
            }
        }

        // Visualizzazione dei prodotti presenti nel carrello con i relativi dettagli e prezzo con IVA
        System.out.println("Nel carrello hai: ");
        for (int i = 0; i < index; i++) {
            System.out.println(cart[i].detailsProduct() + ", Prezzo con IVA: " + cart[i].priceIva());
        }

        // Chiusura dello scanner per evitare memory leak
        scanner.close();
    }
}


