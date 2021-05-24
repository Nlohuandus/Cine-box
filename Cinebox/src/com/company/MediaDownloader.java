package com.company;

public class MediaDownloader {
    public interface DownloadListener {
        void onMediaDownloaded(Media media, String content);
    }

    public static void download(Media media, DownloadListener downloadListener) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Downloading " + media.getTitle());
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(media.getTitle() + " Downloaded!");
                String content = "A un tipo le matan su perrito y va y se desquita con todos";
                downloadListener.onMediaDownloaded(media, content);
            }
        });
        thread.start();
    }
}
