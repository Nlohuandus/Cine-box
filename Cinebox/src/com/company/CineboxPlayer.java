package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CineboxPlayer implements MediaDownloader.DownloadListener {

    public void initialize() {
        Movie backToTheFuture = new Movie("Back to the future", "Ciencia ficcion", 90);
        Movie avengers = new Movie("Avengers", "Action", 150);
        Movie forrestGump = new Movie("Forrest Gump", "Drama", 130);

        backToTheFuture.setSynopsis("rick and morty antes de la caricatura");
        avengers.setSynopsis("Superheroes resolviendo problemas que ellos mismos causaron");
        forrestGump.setSynopsis("Una gran pelicula, punto.");

        Series breakingBad = new Series("Breaking bad", "Drama", 50, 10, 10);
        Series vikingos = new Series("Vikingos", "Action/ Adventure", 50, 10, 6);
        Series friends = new Series("Friends", "Comedy", 20, 22, 12);
        Series dark = new Series("Dark", "Dramas", 40, 10, 4);
        Series howIMeetYourMother = new Series("How i meet your mother", "Comedy", 20, 22, 5);
        Series caballerosDelZodiaco = new Series("Caballeros del zodiaco", "Action", 15, 50, 3);

        breakingBad.setSynopsis("Un profe recluta a un vago y venden dulces azules");
        vikingos.setSynopsis("Un monton de rudos van y buscan pleito en otros paises nada mas porque si");
        friends.setSynopsis(
                "Un grupo de amigos que al parecer no trabajan ni tienen hobbies se juntan a hablar de parejas");
        dark.setSynopsis("La verdad no la entendi");
        howIMeetYourMother.setSynopsis("Lo mismo que friends pero con otras personas");
        caballerosDelZodiaco.setSynopsis("muchos luchadores que explican lo que haran antes de cada golpe");

        HashMap<Integer, Media> mediaHashMap = new HashMap();
        mediaHashMap.put(1, backToTheFuture);
        mediaHashMap.put(2, avengers);
        mediaHashMap.put(1, forrestGump);

        Media media=mediaHashMap.get(2);
        System.out.println(media);





        // PriorityQueue<Media> mediaQueue = new PriorityQueue<>();
        // mediaQueue.add(backToTheFuture);
        // mediaQueue.add(avengers);
        // mediaQueue.add(forrestGump);
        // mediaQueue.add(breakingBad);
        // mediaQueue.add(vikingos);

        // playQueue(mediaQueue);

        // ArrayList<Media> mediaList = new ArrayList<>();
        // mediaList.add(backToTheFuture);
        // mediaList.add(avengers);
        // mediaList.add(forrestGump);
        // mediaList.add(breakingBad);
        // mediaList.add(vikingos);
        // mediaList.add(friends);
        // mediaList.add(dark);
        // mediaList.add(howIMeetYourMother);
        // mediaList.add(caballerosDelZodiaco);
        // Collections.sort(mediaList); 

        // printInstructions(mediaList);
        // Scanner sc = new Scanner(System.in);
        // int selection = sc.nextInt();
        // while (selection != 0) {
        //     int mediaListSize = mediaList.size();
        //     int index = selection-1;
        //     if (index >= mediaListSize){
        //         System.out.println("Seleccion invalida, seleccione otra");
        //     }else{
        //         System.out.println("\n"); 
        //         Media media = mediaList.get(index);
        //         System.out.println(media.getSynopsis());
        //     }
        //     System.out.println("\n");
        //     printInstructions(mediaList);
        //     selection = sc.nextInt();
        // }
        // System.out.println("Fin");
        // sc.close();
    }
    private void playQueue(PriorityQueue<Media> mediaQueue){
        while (mediaQueue.size() > 0){
            Media media = mediaQueue.poll();
            media.play();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void printInstructions(ArrayList<Media> mediaList) {
        int index = 1;
        System.out.println("selecciona una serie para ver su sinopsis");
        for (Media media : mediaList) {
            System.out.println(index + ") " + media.getTitle());
            index++;
        }
        System.out.println("0) Salir");
    }

    @Override
    public void onMediaDownloaded(Media media, String content) {
        media.play();
        media.setContent(content);
        System.out.println(content);

    }

}
