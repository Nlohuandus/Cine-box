package com.company;

import java.util.Scanner;

import com.company.MediaDownloader.DownloadListener;

public class CineboxPlayer implements MediaDownloader.DownloadListener {
    private Movie backToTheFuture = new Movie("Back to the future", "Ciencia ficcion", 90);

    public void initialize() {
        backToTheFuture.setWonOscar(true);
        MediaDownloader.download(backToTheFuture.getTitle(), this);

        Series breakingBad = new Series("Breaking bad", "Drama", 50, 10, 10);
        Series vikingos = new Series("Vikingos", "Action/ Adventure", 50, 10, 6);
        Series friends = new Series("Friends", "Comedy", 20, 22, 12);
        breakingBad.setSynopsis("Un profe recluta a un vago y venden dulces azules");
        vikingos.setSynopsis("Un monton de rudos van y buscan pleito en otros paises nada mas porque si");
        friends.setSynopsis(
                "Un grupo de amigos que al parecer no trabajan ni tienen hobbies se juntan a hablar de parejas");
        printInstructions();
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();
        while (selection != 0) {
            System.out.println("\n");
            if (selection == 1) {
                System.out.println(breakingBad.getSynopsis());
            } else if (selection == 2) {
                System.out.println(vikingos.getSynopsis());
            } else if (selection == 3) {
                System.out.println(friends.getSynopsis());
            } else {
                System.out.println("Serie invalida, seleccione otra");
            }
            System.out.println("\n");
            printInstructions();
            selection = sc.nextInt();
        }
        System.out.println("Fin");
        sc.close();
    }

    private static void printInstructions() {
        System.out.println("selecciona una serie para ver su sinopsis");
        System.out.println("1) Breaking bad");
        System.out.println("2) Vikingos");
        System.out.println("3) Friends");
        System.out.println("0) Salir");
    }

    @Override
    public void onMediaDownloaded(String content) {
        backToTheFuture.play();
        backToTheFuture.setContent(content);
        System.out.println(content);

    }

}
