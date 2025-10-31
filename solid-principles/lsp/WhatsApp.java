package lsp;
public class WhatsApp implements VideoGroupManager{

@Override
    public void chat(){
        System.out.println("Fitur chat");
    }
@Override

    public void sendPhotosAndVideos(){
        System.out.println("Fitur pengiriman foto dan video");
    }
@Override
    public void callGroupVideo(){
        System.out.println("Fitur telepon grup video");
    }
    
}
