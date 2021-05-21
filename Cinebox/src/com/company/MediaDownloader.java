package com.company;

public class MediaDownloader {
    public interface DownloadListener {
        void onMediaDownloaded(String content);
    }

    public static void download(String mediaTitle, DownloadListener downloadListener) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Downloading " + mediaTitle);
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(mediaTitle + " Downloaded!");
                String content = "A un tipo le matan su perrito y va y se desquita con todos";
                downloadListener.onMediaDownloaded(content);
            }
        });
        thread.start();
    }
}
