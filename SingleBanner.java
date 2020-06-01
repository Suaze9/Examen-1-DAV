
public class SingleBanner {
    private static SingleBanner instance = new SingleBanner();
    private String banner;
    
    private SingleBanner(){
        banner = "banner por defecto";
    }
    
    public static SingleBanner getInstance(){
        return instance;
    }
    
    public String verBanner(){
        return banner;
    }
    
    public Boolean modificarBanner(String banner, int llave){
        if(llave > 5000){
            this.banner = banner;
            return true;
        }
        return false;
    }
}
